package controler;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.cloud.StorageClient;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.ClasseSupervisor;

//Essa classe contém os métodos próprios do adm como auto-cadastro e atualização dos próprios dados. Para mais informações,
//acesse a documentação na página:

public class ControllerAdmin {
    static Firestore bd;
    static Bucket auxB;
    static FirebaseApp app;
    public static void conectar(){
        try{
            InputStream serviceAccount = new FileInputStream("service-account-file.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount)).setDatabaseUrl("https://sgmtranscodil-aa0f7.firebaseio.com")
            .setStorageBucket("sgmtranscodil-aa0f7.appspot.com")
            .build();
            app = FirebaseApp.initializeApp(options);

            bd = FirestoreClient.getFirestore();
            Bucket bucket = StorageClient.getInstance().bucket();
            auxB = bucket;
            
            
        }catch(Exception e){
        }
    }
    
    public static String cadastrarSupervisor(ClasseSupervisor supervisor){
       String retorno = "Cadastro realizado com sucesso em:\n";
       String codUser = "código";
       Map<String, Object> data = new HashMap<>();
       
       switch (validadorDeCpf(supervisor.getCpf())){
           case 0:
               retorno = "CPF inválido";
               return retorno;
           case 1:
               retorno = "CPF já cadastrado";
               return retorno;
       }
       
       if(!confirmaEmail(supervisor.getEmail())){
           retorno = "E-mail já cadastrado ou incorreto";
           return retorno;
       }
       
       data.put("senha", supervisor.getSenha());
       data.put("ativado", supervisor.isValidado());
       data.put("cpf", supervisor.getCpf());
       data.put("email", supervisor.getEmail());
       data.put("imagem", null);
       data.put("nome", supervisor.getNome());
       
       codUser = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 28);
       try{
           ApiFuture<WriteResult> future = bd.collection("Administrador").document(codUser).set(data);
           String updateTime = future.get().getUpdateTime().toString();
           retorno += updateTime;
           return retorno;
       }catch(Exception e){
           return e.getMessage();
       }
    }
    
    public static ClasseSupervisor getSupervByEmail(String email){
        try{//ApiFuture<QuerySnapshot> future = db.collection("cities").whereEqualTo("capital", true).get();

            CollectionReference users = bd.collection("Administrador");
            ApiFuture<QuerySnapshot> future = users.whereEqualTo("email", email).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                ClasseSupervisor aux = new ClasseSupervisor(
                    document.getString("nome"),
                    document.getString("cpf"), 
                    document.getString("email"),
                    document.getString("senha"),
                    document.getString("imagem"),
                    document.getId(),
                    document.getBoolean("ativado")
                );
                //supervisos.add(aux);
                return aux;
            }
        }catch(Exception e){
           
        }
        return null;
    }
    
    public static boolean loginSuperv(String email, String senha){//return true se pode fazer login e false se não pode
        ClasseSupervisor supervisor = getSupervByEmail(email);
        if(supervisor == null)
            return false;
        if(senha.equals(supervisor.getSenha()) && supervisor.isValidado() == true){
            return true;
        }

        return false;
    }
    
    public static boolean confirmaEmail(String email){
        try{
            CollectionReference users = bd.collection("Usuarios");
            Query query = users.whereEqualTo("email", email);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                if(document.getId()!=null){
                    return false;
                }
            }
        }catch(Exception e){
            return false;
        }
        
        try{
            CollectionReference users = bd.collection("Administrador");
            Query query = users.whereEqualTo("email", email);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                if(document.getId()!=null){
                    return false;
                }
            }
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        }catch(Exception e){
            return false;
        }
        
        return true;
    }

    public static int validadorDeCpf(String cpf){
        //motivo 0: cpf errado
        //motivo 1: cpf já cadastrado
        //motivo 2: está tudo ok
        if(cpf.indexOf(".") == -1 && cpf.indexOf("-") == -1){
            return 0;
        }
        
        String[] cpfRetornado = cpf.split("\\.");
        if(cpfRetornado.length!=3){
            return 0;
        }//000.000.000-00
        for(int i = 0; i < 2; i++){//000.000
            if(cpfRetornado[i].length()!=3)//000
                return 0;
            try{
                Integer.parseInt(cpfRetornado[i]);
            }catch(Exception e){
                return 0;
            }
        }
        
        String[] aux = cpfRetornado[2].split("\\-");
        
        try{
            Integer.parseInt(aux[1]);
            Integer.parseInt(aux[0]);
        }catch(Exception e){
            return 0;
        }
        if(aux.length!=2 && aux[1].length()!=2 && aux[0].length()!=3){
            return 0;
        }
        
        try{
            CollectionReference users = bd.collection("Usuarios");
            CollectionReference users2 = bd.collection("Administrador");
            Query query = users.whereEqualTo("cpf", cpf);
            Query query2 = users2.whereEqualTo("cpf", cpf);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            ApiFuture<QuerySnapshot> querySnapshot2 = query2.get();
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                if(document.getId()!=null){
                    return 1;
                }
            }
            for (DocumentSnapshot document : querySnapshot2.get().getDocuments()) {
                if(document.getId()!=null){
                    return 1;
                }
            }
            
        }catch(Exception e){
            return 0;
        }
        
        
        
        return 2;
    }
    
    public static String possiveisErrosLogin(String email, String senha){
         String retorno = "Usuário não cadastrado.\nCaso tenha se cadastrado, verifique se o seu e-mail está escrito corretamente.";
         try{
             int aux = 0;
            CollectionReference users = bd.collection("Administrador");
            Query query = users.whereEqualTo("email", email);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
                if(document.getId()!=null){
                     aux = 1;
                }
            }
            if(aux==1){
                ClasseSupervisor aux1 = getSupervByEmail(email);
                if(!senha.equals(aux1.getSenha()))
                    retorno = "Senha incorreta";
                if(!aux1.isValidado())
                    retorno = "Você foi cadastrado, mas sua conta não foi validada pela equipe SGM";
            }
        }catch(Exception e){
            return retorno;
        }
        
        return retorno;
    }
    
    public static String uploadDeImagem(String idSuperv, String caminhoImg){
        String idProjeto = "sgmtranscodil-aa0f7";
        try{
            Storage storage = StorageOptions.newBuilder().setProjectId(idProjeto).build().getService();
            BlobId blobId = BlobId.of(auxB.getName(), idSuperv);
            BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("image/png").build();
            storage.create(blobInfo, Files.readAllBytes(Paths.get(caminhoImg)));
            DocumentReference docRef = bd.collection("Administrador").document(idSuperv);
            String aux = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/"+idSuperv+"?alt=media&token=78a07ae0-ae43-4d00-8aef-293201e0244d";
            docRef.update("imagem", aux);
            return "Imagem atualizada com sucesso!";
        }
        //BlobInfo.newBuilder(blobId).setContentType("text/plain").build();
        catch(Exception e){
            e.printStackTrace();
            return "Algo deu errado.\nTente novamente mais tarde.";
        }
        
    }

    public static String atualizaDadosFire(ClasseSupervisor sup, ClasseSupervisor supAnt){
        String retorno = "Dados atualizados com sucesso!";
        try{
            DocumentReference docRef = bd.collection("Administrador").document(sup.getId());
            if(!sup.getCpf().equals(supAnt.getCpf()))
                docRef.update("cpf", sup.getCpf());
            if(!sup.getEmail().equals(supAnt.getEmail()))
                docRef.update("email", sup.getEmail());
            if(!sup.getSenha().equals(supAnt.getSenha()))
                docRef.update("senha", sup.getSenha());
            if(!sup.getNome().equals(supAnt.getNome()))
                docRef.update("nome", sup.getNome());
            if(!sup.getImagem().equals(supAnt.getImagem()))
                docRef.update("imagem", sup.getImagem());
        }catch(Exception e){
            retorno = "Deu errado!";
            return retorno;
        }
        return retorno;
    }

}
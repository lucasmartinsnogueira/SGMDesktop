package controler;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.auth.UserRecord.UpdateRequest;
import static controler.ControllerAdmin.bd;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.Normalizer;
import java.util.ArrayList;
import model.ClasseUsuarios;

public class ControllerUsuarios {
    
    public static ArrayList<ClasseUsuarios> retornaUsuariosPorCategoria(String categoria){
        ArrayList<ClasseUsuarios> aux = new ArrayList<>();
        
        try{//ApiFuture<QuerySnapshot> future = db.collection("cities").whereEqualTo("capital", true).get();

            CollectionReference users = ControllerAdmin.bd.collection("Usuarios");
            ApiFuture<QuerySnapshot> future = users.whereEqualTo("categoria", categoria).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                ClasseUsuarios aux2 = new ClasseUsuarios(
                    document.getString("nome"),
                    document.getString("cpf"), 
                    document.getString("email"),
                    document.getString("imagem"),
                    document.getId(),
                    document.getString("categoria"),
                    document.getBoolean("ativado")
                );
                aux.add(aux2);
            }
            return aux;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }
    
    public static int retornaQuantDeUsuarios(){
        
        int res = 1;
        try{

            CollectionReference users = ControllerAdmin.bd.collection("Usuarios");
            ApiFuture<QuerySnapshot> future = users.get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                res++;
            }
            return res;
        }catch(Exception e){
           e.printStackTrace();
           return 0;
        }
    }
    
    public static ArrayList<ClasseUsuarios> retornaUsuariosPorStatusDeValidacao(boolean validado){
        ArrayList<ClasseUsuarios> aux = new ArrayList<>();
        
        try{
            
            CollectionReference users = ControllerAdmin.bd.collection("Usuarios");
            ApiFuture<QuerySnapshot> future = users.whereEqualTo("ativado", validado).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                ClasseUsuarios aux2 = new ClasseUsuarios(
                    document.getString("nome"),
                    document.getString("cpf"), 
                    document.getString("email"),
                    document.getString("imagem"),
                    document.getId(),
                    document.getString("categoria"),
                    document.getBoolean("ativado")
                );
                aux.add(aux2);
            }
            return aux;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }
    
    public static ClasseUsuarios retornaUsuarioPorId(String id){
        ClasseUsuarios falhou = new ClasseUsuarios("usuário excluído", "000.000.000-00", "0000@000.000", "0000", null, "excluído", false);
        try{
            ApiFuture<DocumentSnapshot> users = ControllerAdmin.bd.collection("Usuarios").document(id).get();
            if(users != null){
                String nome = users.get().getString("nome");
                String cpf = users.get().getString("cpf");
                String email = users.get().getString("email");
                String imagem = users.get().getString("imagem");
                String ID = id;
                String CATEGORIA = users.get().getString("categoria");
                boolean ativado = users.get().getBoolean("ativado");
                ClasseUsuarios mecanico = new ClasseUsuarios(nome, cpf, email, imagem, ID, CATEGORIA, ativado);
            
                return mecanico;
            }else
                return falhou;
            
        }catch(Exception e){
           e.printStackTrace();
           return falhou;
        }
    }
   
    public static ArrayList<ClasseUsuarios> retornaUsuariosPorNome(String nome){
        ArrayList<ClasseUsuarios> usuarios = retornaUsuariosPorStatusDeValidacao(true);
        ArrayList<ClasseUsuarios> usrs = new ArrayList<>();

        nome = Normalizer.normalize(nome,Normalizer.Form.NFD);
        nome = nome.replaceAll("[^\\p{ASCII}]", "");
        
        
        for(ClasseUsuarios usuario : usuarios){
            String usrname = Normalizer.normalize(usuario.getNome(),Normalizer.Form.NFD);
            usrname = usrname.replaceAll("[^\\p{ASCII}]", "");
            
            if(usrname.toUpperCase().indexOf(nome.toUpperCase())!=-1){
                usrs.add(usuario);
            }
        }
        if(usrs.size() == 0){
            usrs.add(new ClasseUsuarios("null", "null", "null", "usuário não encontrado", "null", "null", false));
        }
        return usrs;
    }
    
    public static String removerUsuarios(String ID){
        ControllerAdmin.bd.collection("Usuarios").document(ID).delete();
        try{
            FirebaseAuth.getInstance().deleteUser(ID);
        }catch(Exception e){
            return "Algo deu errado";
        }
        return "Usuário removido com sucesso!";
    }
    
    public static String ValidarUsuarios(String ID){
        String retorno = "Validado com sucesso!";
        try{
            DocumentReference docRef = ControllerAdmin.bd.collection("Usuarios").document(ID);
            docRef.update("ativado", true);
            return retorno;
        }catch(Exception e){
            retorno = "Deu errado!";
            return retorno;
        }
    }
    
    public static String InalidarUsuarios(String ID){
        String retorno = "Invalidado com sucesso!";
        try{
            DocumentReference docRef = ControllerAdmin.bd.collection("Usuarios").document(ID);
            docRef.update("ativado", false);
            return retorno;
        }catch(Exception e){
            retorno = "Algo deu errado!\n Tente novamente mais tarde!";
            return retorno;
        }
    }

    public static String atualizarUsuarios(ClasseUsuarios user, ClasseUsuarios userAnt){
        String retorno = "Dados atualizados com sucesso!";
        try{
            DocumentReference docRef = bd.collection("Usuarios").document(user.getId());
            if(!user.getCpf().equals(userAnt.getCpf()))
                docRef.update("cpf", user.getCpf());
            if(!user.getEmail().equals(userAnt.getEmail()))
                docRef.update("email", user.getEmail());
            if(!user.getNome().equals(userAnt.getNome()))
                docRef.update("nome", user.getNome());
            
            UpdateRequest request = new UpdateRequest(user.getId())
            .setEmail(user.getEmail())
            .setEmailVerified(true)
            .setDisabled(false);

            UserRecord userRecord = FirebaseAuth.getInstance().updateUser(request);

            return retorno;
        }catch(Exception e){
            e.printStackTrace();
            retorno = "Algo deu errado!\nTente novamente mais tarde.";
            return retorno;
        }
    }

}

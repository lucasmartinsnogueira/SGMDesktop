package controler;

import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import model.ClassePedido;
import model.ClasseUsuarios;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public class ControllerPedidos {
    
    static ArrayList<ClassePedido> aux = new ArrayList<>();
    //Pelo supervisor:
    public static ArrayList<ClassePedido> getPedidos(){   
        aux.clear();
        try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future = ordens.get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                
                String data = document.get("data").toString();
                String ajuda = document.get("mecanicos").toString();
                ArrayList<String> mecanicos = stringParaList(ajuda);
                //[vfWK8XuspBUQgwvJ5f2WY4YAKn93, TieswdM6i4Xa8aUtMOxb6qdFsSw1, JTwtSqxLzWZcuDSppTRRmQe5BmI3]
                
                Timestamp ts = converterTimestampDoGoogle(data);
               
                long longa = 0;
                long longa2 = 0;
                
                if(document.getLong("carreta")!=null){
                     longa2 = document.getLong("carreta");
                }
                if(document.getLong("cavalo") != null){
                    longa = document.getLong("cavalo");
                }
                ClassePedido aux2 = new ClassePedido(
                        
                        (int) longa,
                        (int) longa2, 
                        ts,
                        document.getString("descricao"),
                        document.getString("docEstoquista"),
                        document.getString("docSupervisor"),
                        document.getBoolean("estoquista"),
                        document.getBoolean("feita"),
                        document.getBoolean("esperaEst"),
                        document.getBoolean("igm"),
                        document.getString("itens"),
                        document.getString("imagem"),
                        document.getString("titulo"),
                        mecanicos,
                        document.getId()
                );
                aux.add(aux2);
            }
            return aux;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
        
    }
   
    public static ArrayList<ClassePedido> getPedidosAguardandoMateriais(){
        
        ArrayList<ClassePedido> aux2 = new ArrayList();
         try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future = ordens.whereEqualTo("esperaEst", true).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                
                String data = document.get("data").toString();
                String ajuda = document.get("mecanicos").toString();
                ArrayList<String> mecanicos = stringParaList(ajuda);
                Timestamp ts = converterTimestampDoGoogle(data);
                long longa = 0;
                long longa2 = 0;
                
                if(document.getLong("carreta")!=null){
                     longa2 = document.getLong("carreta");
                }
                if(document.getLong("cavalo") != null){
                    longa = document.getLong("cavalo");
                }
                ClassePedido aux3 = new ClassePedido(
                        
                        (int) longa,
                        (int) longa2, 
                        ts,
                        document.getString("descricao"),
                        document.getString("docEstoquista"),
                        document.getString("docSupervisor"),
                        document.getBoolean("estoquista"),
                        document.getBoolean("feita"),
                        document.getBoolean("esperaEst"),
                        document.getBoolean("igm"),
                        document.getString("itens"),
                        document.getString("imagem"),
                        document.getString("titulo"),
                        mecanicos,
                        document.getId()
                );
                aux2.add(aux3);
            }
            return aux2;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }
    
    public static ArrayList<ClassePedido> getPedidosAindaNaoAprovadosPorEstoeuistas(){
        
        ArrayList<ClassePedido> aux2 = new ArrayList();
         try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future = ordens.whereEqualTo("estoquista", false).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                
                String data = document.get("data").toString();
                String ajuda = document.get("mecanicos").toString();
                ArrayList<String> mecanicos = stringParaList(ajuda);
                Timestamp ts = converterTimestampDoGoogle(data);
                long longa = 0;
                long longa2 = 0;
                
                if(document.getLong("carreta")!=null){
                     longa2 = document.getLong("carreta");
                }
                if(document.getLong("cavalo") != null){
                    longa = document.getLong("cavalo");
                }
                ClassePedido aux3 = new ClassePedido(
                        
                        (int) longa,
                        (int) longa2, 
                        ts,
                        document.getString("descricao"),
                        document.getString("docEstoquista"),
                        document.getString("docSupervisor"),
                        document.getBoolean("estoquista"),
                        document.getBoolean("feita"),
                        document.getBoolean("esperaEst"),
                        document.getBoolean("igm"),
                        document.getString("itens"),
                        document.getString("imagem"),
                        document.getString("titulo"),
                        mecanicos,
                        document.getId()
                );
                aux2.add(aux3);
            }
            return aux2;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }
    
    public static ClassePedido getPedidosPorId(String idPedido){
        ClassePedido aux3 = new ClassePedido();
        try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future = ordens.get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                if(document.getId().equals(idPedido)){
                    
                    String data = document.get("data").toString();
                    String ajuda = document.get("mecanicos").toString();
                    ArrayList<String> mecanicos = stringParaList(ajuda);
                    
                    Timestamp ts = converterTimestampDoGoogle(data);
                    long longa = 0;
                    long longa2 = 0;

                    if(document.getLong("carreta")!=null){
                         longa2 = document.getLong("carreta");
                    }
                    if(document.getLong("cavalo") != null){
                        longa = document.getLong("cavalo");
                    }

                        ClassePedido aux2 = new ClassePedido(

                            (int) longa,
                            (int) longa2,
                            ts,
                            document.getString("descricao"),
                            document.getString("docEstoquista"),
                            document.getString("docSupervisor"),
                            document.getBoolean("estoquista"),
                            document.getBoolean("feita"),
                            document.getBoolean("esperaEst"),
                            document.getBoolean("igm"),
                            document.getString("itens"),
                            document.getString("imagem"),
                            document.getString("titulo"),
                            mecanicos,
                            document.getId()
                    );
                    aux3 = aux2;
                }
            }
            return aux3;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }
    
    public static int getQuantPedidosFinalizados(){
        int quantidade = 0;
        for(int i = 0; i < aux.size(); i++){
            if(aux.get(i).isFeita())
                quantidade++;
        }
        return quantidade;
    }
    
    public static ArrayList<ClassePedido> getPedidosFinalizados(){
        ArrayList<ClassePedido> myArrayList = new ArrayList<>();
        try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future = ordens.whereEqualTo("feita", true).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                
                String data = document.get("data").toString();
                String ajuda = document.get("mecanicos").toString();
                ArrayList<String> mecanicos = stringParaList(ajuda);
                Timestamp ts = converterTimestampDoGoogle(data);
                long longa = 0;
                long longa2 = 0;
                
                if(document.getLong("carreta")!=null){
                     longa2 = document.getLong("carreta");
                }
                if(document.getLong("cavalo") != null){
                    longa = document.getLong("cavalo");
                }
                ClassePedido aux2 = new ClassePedido(
                        
                        (int) longa,
                        (int) longa2, 
                        ts,
                        document.getString("descricao"),
                        document.getString("docEstoquista"),
                        document.getString("docSupervisor"),
                        document.getBoolean("estoquista"),
                        document.getBoolean("feita"),
                        document.getBoolean("esperaEst"),
                        document.getBoolean("igm"),
                        document.getString("itens"),
                        document.getString("imagem"),
                        document.getString("titulo"),
                        mecanicos,
                        document.getId()
                );
                myArrayList.add(aux2);
            }
            return myArrayList;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }
    
    public static ArrayList<ClassePedido> getPedidosNaoFinalizados(){
        ArrayList<ClassePedido> myArrayList = new ArrayList<>();
        try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future = ordens.whereEqualTo("feita", false).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                
                String data = document.get("data").toString();
                String ajuda = document.get("mecanicos").toString();
                ArrayList<String> mecanicos = stringParaList(ajuda);
                Timestamp ts = converterTimestampDoGoogle(data);
                long longa = 0;
                long longa2 = 0;
                
                if(document.getLong("carreta")!=null){
                     longa2 = document.getLong("carreta");
                }
                if(document.getLong("cavalo") != null){
                    longa = document.getLong("cavalo");
                }
                ClassePedido aux2 = new ClassePedido(
                        
                        (int) longa,
                        (int) longa2, 
                        ts,
                        document.getString("descricao"),
                        document.getString("docEstoquista"),
                        document.getString("docSupervisor"),
                        document.getBoolean("estoquista"),
                        document.getBoolean("feita"),
                        document.getBoolean("esperaEst"),
                        document.getBoolean("igm"),
                        document.getString("itens"),
                        document.getString("imagem"),
                        document.getString("titulo"),
                        mecanicos,
                        document.getId()
                );
                myArrayList.add(aux2);
            }
            return myArrayList;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
        
    }
    
    public static ArrayList<String> getCarretas(){
        ArrayList<String> carretas = new ArrayList<>();
        for(ClassePedido p : aux){
            carretas.add(Integer.toString(p.getCarreta()));
        }
        
        Set<String> set = new HashSet<>(carretas);
        carretas.clear();
        carretas.addAll(set);
        
        return carretas;
    }
    
    public static ArrayList<ClassePedido> getOSbyCarreta(String carreta){
        ArrayList<ClassePedido> aux3 = new ArrayList<>();
        
        try{
            CollectionReference ordens = ControllerAdmin.bd.collection("OSs");
            ApiFuture<QuerySnapshot> future;
            if(carreta != null)
                future = ordens.whereEqualTo("carreta", Long.parseLong(carreta)).get();
            else
                future = ordens.whereEqualTo("carreta", null).get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                    String data = document.get("data").toString();
                    String ajuda = document.get("mecanicos").toString();
                    ArrayList<String> mecanicos = stringParaList(ajuda);
                    Timestamp ts = converterTimestampDoGoogle(data);
                    long longa = 0;
                long longa2 = 0;
                
                if(document.getLong("carreta")!=null){
                     longa2 = document.getLong("carreta");
                }
                if(document.getLong("cavalo") != null){
                    longa = document.getLong("cavalo");
                }
                
                    ClassePedido aux2 = new ClassePedido(
                        
                        (int) longa,
                        (int) longa2,
                        ts,
                        document.getString("descricao"),
                        document.getString("docEstoquista"),
                        document.getString("docSupervisor"),
                        document.getBoolean("estoquista"),
                        document.getBoolean("feita"),
                        document.getBoolean("esperaEst"),
                        document.getBoolean("igm"),
                        document.getString("itens"),
                        document.getString("imagem"),
                        document.getString("titulo"),
                        mecanicos,
                        document.getId()
                );
                aux3.add(aux2);
                
            }
            return aux3;
        }catch(Exception e){
           e.printStackTrace();
           return null;
        }
    }    
    
    public static HashMap<String, Object> getQuantPorCarreta(ArrayList<String> carretas){
        HashMap<String, Object> myMap = new HashMap<>();
        
        for(int i = 0; i < carretas.size(); i++){
            int quantity = 0;
            for(int j = 0; j < aux.size(); j++){
                if(Integer.toString(aux.get(j).getCarreta()).equals(carretas.get(i))){
                    //aux.remove(j);
                    quantity++;
                }
            }
            myMap.put(carretas.get(i), quantity);
        }
        
        return myMap;
    }
    
    public static String removerPedido(String idPedido){
        ClassePedido pedido = getPedidosPorId(idPedido);
        int j = 1;
        for(int i = 0; i < pedido.getIdsMecanicos().size(); i++){
            ControllerAdmin.bd.collection("OSs").document(idPedido).collection("trabalhos").document(pedido.getIdsMecanicos().get(i).toString()).delete();
            j++;
        }
        ControllerAdmin.bd.collection("OSs").document(idPedido).delete();
        //remover a imagem do storage caso tenha
        return "Pedido removido com sucesso!";
    }

    public static Map<String, Object> converterStringMap(String map){
        Map<String, Object> aux = new HashMap<>();
        
        //{mecanico1=pa07Df7e0of4L1hSJxWGd9cLSTN2, mecanico2=scp3Xdt1dQQ1OOC1L78ZInbwjcl2, mecanico3=eyQAJRbS2OhC3WpzMgNLW7PfmVj1}
        String um = map.substring(1, map.length()-1);
        
        if(um.indexOf(",") != -1){
            String[] dois = um.split(", ");
            for(int i = 0; i < dois.length; i++){
                String[] resposta = dois[i].split("\\=");
                aux.put(resposta[0], resposta[1]);
            }
        }else{
            String[] resposta2 = um.split("\\=");
            aux.put(resposta2[0], resposta2[1]);
        }
        
        
        return aux; 
    }

    public static Timestamp converterTimestampDoGoogle(String input){
        /*por algum motivo, com.google.cloud.Timestamp só converte se estiver formatado assim: 9999-12-31T23:59:59Z
        mas na hora de retornar, retorna essa formatação: May 03 20:59:01 BRT 2009*/
        
        String[] meses = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dez"};
        
        String m = input.substring(4);//May 03 20:59:01 BRT 2009
        
        String[] comeca = m.split(" ");
        String mes = " ", dia = " ", ano = " ", hora = " ";
        for(int i = 0; i < meses.length; i++){
            if(comeca[0].equals(meses[i])){
                int j = i+1;
                mes = String.valueOf(j);
                if(j<10){
                    mes = "0"+String.valueOf(j);
                }
            }
        }
        dia = comeca[1];
        ano = comeca[4];
        hora = comeca[2];
        
        String convertida = ano+"-"+mes+"-"+dia+"T"+hora+"Z";
        
        Timestamp resposta = Timestamp.parseTimestamp(convertida);
        
        return resposta;
    }

    public static ArrayList<ClasseUsuarios> pegaMecanicosOS(String id){
        ArrayList<ClasseUsuarios> mecanicos = new ArrayList<>();
        ClassePedido pedido = getPedidosPorId(id);
        String caminho = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fmec.png?alt=media&token=e3f2d7b6-1650-45a1-a662-9866bddce103";
        
        if(pedido.getIdsMecanicos().size() > 0 ){
            ClasseUsuarios mecanico = ControllerUsuarios.retornaUsuarioPorId(pedido.getIdsMecanicos().get(0));
            if(!mecanico.getNome().equals("usuário excluído")){
                mecanicos.add(mecanico);
                if(mecanicos.get(0).getImagem() == null){
                    mecanicos.get(0).setImagem(caminho);
                }   
            }
        }
        if(pedido.getIdsMecanicos().size() > 1 ){
            ClasseUsuarios mecanico = ControllerUsuarios.retornaUsuarioPorId(pedido.getIdsMecanicos().get(1));
            if(!mecanico.getNome().equals("usuário excluído")){
                mecanicos.add(mecanico);
                if(mecanicos.get(1).getImagem() == null){
                    mecanicos.get(1).setImagem(caminho);
                }   
            }
        }
        if(pedido.getIdsMecanicos().size() > 2 ){
            ClasseUsuarios mecanico = ControllerUsuarios.retornaUsuarioPorId(pedido.getIdsMecanicos().get(2));
            if(!mecanico.getNome().equals("usuário excluído")){
                mecanicos.add(mecanico);
                if(mecanicos.get(2).getImagem() == null){
                    mecanicos.get(2).setImagem(caminho);
                }   
            }
        }
        if(pedido.getIdsMecanicos().size() > 4 ){
            ClasseUsuarios mecanico = ControllerUsuarios.retornaUsuarioPorId(pedido.getIdsMecanicos().get(3).toString());
            if(!mecanico.getNome().equals("usuário excluído")){
                mecanicos.add(mecanico);
                if(mecanicos.get(3).getImagem() == null){
                    mecanicos.get(3).setImagem(caminho);
                }   
            }
        }
        
        return mecanicos;
    }
    
    public static ArrayList<ClassePedido> pegaProximoDeFinalizarDuasSemanas(ArrayList<ClassePedido> al){
        LocalDateTime now = LocalDateTime.now();  
        ArrayList<ClassePedido> meHelp = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dtf.format(now);
        String ts = now.toString();//2022-10-29T16:18:00.837
        
        
        //pega Dia, Mês e ano atuais:
        String amd = ts.split("T")[0];
        int anoA = Integer.parseInt(amd.split("-")[0]);
        int mesA = Integer.parseInt(amd.split("-")[1]);
        int diaD = Integer.parseInt(amd.split("-")[2]);
        System.out.println(diaD);
        
        //auxiliares
        int valorASubtrair = 0;
        ClassePedido meHelpPls = new ClassePedido();
        int diaLimite = 0;
        int mesLimite = 0;
        int anoLimite = 0;
        
        //no caso de ser fevereiro
        boolean bissexto = meHelpPls.isBissexto(anoA);
        
        int val = 0;
        
        if(mesA == 2 && diaD <= 14){
            valorASubtrair = diaD - 14;
            int res = 31 + valorASubtrair;
            diaLimite = res;
            mesLimite = mesA - 1;
            anoLimite = anoA;
        }else if(mesA == 2 && diaD > 14){
            int res = diaD - 14;
            diaLimite = res;
            mesLimite = mesA; 
            anoLimite = anoA;
        }
        
        
        val = meHelpPls.terminaCom31(mesA - 1)?31:30;
        if(mesA != 2){
            if(diaD > 14){
                diaLimite  = diaD - 14;
                mesLimite = mesA;
                anoLimite = anoA;
            }
            else if(diaD <= 14){
                valorASubtrair = diaD - 14;
                int res = val + valorASubtrair;
                diaLimite = res;
                if(mesA == 1){
                    mesLimite = 12;
                    anoLimite = anoA-1;
                }else if(mesA == 3){
                    mesLimite = 2;
                    anoLimite = anoA;
                    int b = bissexto ? 29 : 28;
                    int res2 = b + valorASubtrair;
                    diaLimite = res2;
                }
            }
        }
        for(ClassePedido i : al){
            int dia = Integer.parseInt(i.getDiaMesAno(i.getData().toString()).split(" ")[0]);
            int mes = Integer.parseInt(i.getDiaMesAno(i.getData().toString()).split(" ")[1]);
            int ano = Integer.parseInt(i.getDiaMesAno(i.getData().toString()).split(" ")[2]);
            if(anoA >= ano && ano >= anoLimite){
                if(mes <= mesA && mes >= mesLimite){
                    if(mes == mesA){
                        if(dia >= diaLimite){
                            meHelp.add(i);
                        }    
                    } else{
                        if(dia >= diaLimite)
                            meHelp.add(i);
                    }    
                }
            }
        }
        return meHelp;
    }
    
    public static ArrayList<String> stringParaList(String arr){
        ArrayList<String> myList = new ArrayList<>();
        
        arr = arr.substring(1, arr.length() - 1);
        myList = new ArrayList<String>(Arrays.asList(arr.split(", ")));
        
        return myList;
    }
}
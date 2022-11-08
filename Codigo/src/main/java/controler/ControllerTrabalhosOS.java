package controler;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import model.ClasseTrabalhosOS;

public class ControllerTrabalhosOS {
    /*
        métodos:
            -- pegar o tempo da OS com base no documento dela;
    */
    public static ArrayList<ClasseTrabalhosOS> getTempoDaOS(String docOS){
        ArrayList<ClasseTrabalhosOS> aux = new ArrayList<>();
        //String idOS, String idMecanico, boolean status, int tempoIndividual
        try{
            CollectionReference trabalhos = ControllerAdmin.bd.collection("OSs").document(docOS).collection("trabalhos");
            ApiFuture<QuerySnapshot> future = trabalhos.get();
            for (DocumentSnapshot document : future.get().getDocuments()) {
                boolean status = document.getBoolean("status");
                long tempoIndividual = document.getLong("tempo");
                int tempo = (int) tempoIndividual;
                
                ClasseTrabalhosOS trabs = new ClasseTrabalhosOS(
                        docOS,
                        document.getId(),
                        status,
                        tempo
                );
                aux.add(trabs);
            }
            return aux;
        }catch(Exception e){
           StringWriter sw = new StringWriter();
           PrintWriter pw = new PrintWriter(sw);
           e.printStackTrace(pw);
	   System.out.println("NullPointerException thrown!\n" + sw.toString());
           return null;
        }
    }
    
}

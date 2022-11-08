/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Users
 */
public class ClasseTrabalhosOS {
    private String idOS = "Nulo";
    private String idMecanico = "Nulo";
    private boolean status = false;
    private int tenpoIndividual = 0;

    public ClasseTrabalhosOS(String idOS, String idMecanico, boolean status, int tempoIndividual) {
        this.idOS = idOS;
        this.idMecanico = idMecanico;
        this.status = status;
        this.tenpoIndividual = tempoIndividual;
    }
    
    public String getIdOS() {
        return idOS;
    }

    public void setIdOS(String idOS) {
        this.idOS = idOS;
    }

    public String getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(String idMecanico) {
        this.idMecanico = idMecanico;
    }
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTenpoIndividual() {
        return tenpoIndividual;
    }

    public void setTenpoIndividual(int tenpoIndividual) {
        this.tenpoIndividual = tenpoIndividual;
    }

    public String getTempoASHmS(int tempo){
        int segundos = 0, minutos = 0, horas = 0;
        String ts = "null:null:null";
        if(tempo < 60){
            
            String t = Integer.toString(tempo);
            if(tempo < 10){
                t = "0" + t;
            }
            
            ts = "00:00:"+t;
            return ts;
        }else if(tempo > 60 && tempo < 3600){
            segundos = tempo%60;
            minutos = tempo/60;
            String s = Integer.toString(segundos), m = Integer.toString(minutos);
            if(segundos < 10){
                s = "0" + s;
            }if(minutos < 10){
                m = "0" + m;
            }
            
            ts = "00:"+m+":"+s;
            return ts;
        }else if(tempo > 3600){
            horas = tempo/3600;
            int resto1 = tempo%3600;
            minutos = resto1/60;
            segundos = resto1%60;
            
            String h = Integer.toString(horas), s = Integer.toString(segundos), m = Integer.toString(minutos);
            if(segundos < 10){
                s = "0" + s;
            }if(minutos < 10){
                m = "0" + m;
            }if(horas < 10){
                h = "0" + h;
            }
            
            ts = h+":"+m+":"+s;
            return ts;
        }
        ts = tempo==3600?"01:00:00":(tempo==60?"00:01:00":ts);
        return ts;
    }
    
}

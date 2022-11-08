package model;

import com.google.cloud.Timestamp;
import java.util.ArrayList;

public class ClassePedido {
    private int cavalo;
    private int carreta;
    private Timestamp data;
    private String detalhes;
    private String idEstoquista;// id do estoquista que aprovou
    private String idSupervisor;
    private boolean validacao = false;//estoquista
    private boolean feita;
    private boolean esperaEst;
    private boolean igm;
    private String itens;
    private String imagem;
    private String titulo;
    //private Map<String, Object> idsMecanicos = new HashMap<>();
    private ArrayList<String> idsMecanicos = new ArrayList<>();
    private String idPedido;//documento da OS
    
    

    public ClassePedido() {}

    public ClassePedido(int cavalo, int carreta, Timestamp data, String detalhes, String idEstoquista, String idSupervisor, boolean validacao, boolean feita, 
            boolean esperaEst, boolean igm, String itens, String imagem, String titulo, ArrayList<String> idsMecanicos, String idPedido) {
        this.cavalo = cavalo;
        this.carreta = carreta;
        this.data = data;
        this.detalhes = detalhes;
        this.idEstoquista = idEstoquista;
        this.idSupervisor = idSupervisor;
        this.validacao = validacao;
        this.feita = feita;
        this.esperaEst = esperaEst;
        this.igm = igm;
        this.itens = itens;
        this.imagem = imagem;
        this.titulo = titulo;
        this.idsMecanicos = idsMecanicos;
        this.idPedido = idPedido;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    public boolean isEsperaEst() {
        return esperaEst;
    }

    public void setEsperaEst(boolean esperaEst) {
        this.esperaEst = esperaEst;
    }

    public boolean isIgm() {
        return igm;
    }

    public void setIgm(boolean igm) {
        this.igm = igm;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCavalo() {
        return cavalo;
    }

    public void setCavalo(int cavalo) {
        this.cavalo = cavalo;
    }

    public int getCarreta() {
        return carreta;
    }

    public void setCarreta(int carreta) {
        this.carreta = carreta;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setStatus(boolean feita) {
        this.feita = feita;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
    

    public ArrayList<String> getIdsMecanicos() {
        return idsMecanicos;
    }

    public void setIdsMecanicos(ArrayList<String> cpfMecanicos) {
        this.idsMecanicos = cpfMecanicos;
    }

    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    
    public String getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getIdEstoquista() {
        return idEstoquista;
    }

    public void setIdEstoquista(String idEstoquista) {
        this.idEstoquista = idEstoquista;
    }
    
    public String getDiaMesAno(String ts){
        //9999-12-31T23:59:59Z
        String dia = ts.substring(8, 10);
        String mes = ts.substring(5 ,7);
        String ano = ts.substring(0, 4);
        String data = dia+" "+mes+" "+ano;
        return data;
    }
    
    public String getHorario(String ts){
        //9999-12-31T23:59:59Z
        String horario = ts.substring(11,19);
        return horario;
    }
    
    public boolean terminaCom31(int mes){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8|| mes == 10 || mes == 12){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isBissexto(int anoA){
        if(anoA % 400 == 0){
            return true;
        } else if((anoA % 4 == 0) && (anoA % 100 != 0)){
            return true;
            //fevereiro tem 29 dias
        } else{
            return false;
            //fevereiro tem 28 dias
        }
    }
    
}

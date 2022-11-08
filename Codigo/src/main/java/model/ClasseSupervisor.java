/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Users
 */
public class ClasseSupervisor {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String imagem;
    private String id;
    private boolean validado;
    
    public ClasseSupervisor() {
      
    }
    public ClasseSupervisor(String nome, String cpf, String email, String senha, String imagem, String id, boolean validado) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.imagem = imagem;
        this.id = id;
        this.validado = validado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getImagem() {
        if(imagem!=null)
            return imagem;
        else
            return "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FsupervisorImagm.png?alt=media&token=2facf663-c6a3-4d8c-828e-f8cb52b8c7f5";
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }
    
    
}

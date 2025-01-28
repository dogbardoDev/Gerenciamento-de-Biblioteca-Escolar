package org.agprojeto.bibliotecaescolar.dto;


public class UsuarioDTO {
    private Integer matricula;
    private String nome;
    private String email;
    private String senha;


    // Construtor padrão
    public UsuarioDTO() {}

    // Construtor com parâmetros
    public UsuarioDTO(Integer matricula, String nome, String email, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "UsuarioDTO {" +
                "Matricula=" + matricula +
                ", Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
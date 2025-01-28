package org.agprojeto.bibliotecaescolar.model.entities;

import java.math.BigInteger;

public class Usuario {
    private Integer matricula;
    private String nome;
    private String email;
    private String senha;

    public Usuario() {}

    public Usuario(BigInteger matricula, String nome, String email, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters
    public BigInteger getMatricula() {
        return matricula;
    }

    public void setMatricula(BigInteger matricula) {
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

    @Override
    public String toString() {
        return "Usuario {" +
                "Matricula=" + matricula +
                ", Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}


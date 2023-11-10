package com.example.manaustour2;

public class UserModel {
    private String nome, number, email;

    public UserModel() {
    }

    public UserModel(String nome, String number, String email) {
        this.nome = nome;
        this.number = number;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

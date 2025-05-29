package com.appgrade.models;

public class Cadeira {

    private final String nome;
    private final int periodo;
    private final int key;

    public Cadeira(String nome,int periodo, int key){
        this.nome = nome;
        this.periodo = periodo;
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getKey() {
        return key;
    }
}

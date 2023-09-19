package com.example.meuprimeiroprojeto.model;

import androidx.annotation.NonNull;

public class Patrimonio {
    private final String nome;
    private final String telefone;
    private final String email;
    private final String endereco;
    private final String patrimonio;

    public Patrimonio(String nome, String telefone, String email,String endereco, String patrimonio){

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.patrimonio = patrimonio;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
    }

}

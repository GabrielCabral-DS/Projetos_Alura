package com.example.meuprimeiroprojeto.dao;

import com.example.meuprimeiroprojeto.model.Patrimonio;

import java.util.ArrayList;
import java.util.List;

public class PatrimonioDAO {
    private final static List<Patrimonio> patrimonios = new ArrayList<>();
    public void salva(Patrimonio patrimonio) {
        patrimonios.add(patrimonio);
    }

    public List<Patrimonio> todos() {
        return new ArrayList<>(patrimonios);
    }
}

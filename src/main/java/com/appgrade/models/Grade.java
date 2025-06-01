package com.appgrade.models;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Grade {

    private final Map<Integer, Cadeira> cadeiras;
    private final Map<Integer, List<Integer>> prerequisitos;
    private final Map<Integer, List<Integer>> dependentes;
    private final int qntPeriodos;

    public Grade(int qntPeriodos){
        this.qntPeriodos = qntPeriodos;
        this.cadeiras = new HashMap<>();
        this.prerequisitos = new HashMap<>();
        this.dependentes = new HashMap<>();
    }

    public void addCadeira(Cadeira cadeira) {
        if(cadeira.periodo() > qntPeriodos) return;
        cadeiras.put(cadeira.key(), cadeira);
    }

    public void addCadeira(Cadeira cadeira, int[] prereqs) {
        addCadeira(cadeira);

        for (int prereq : prereqs) {
            prerequisitos.computeIfAbsent(cadeira.key(), k -> new ArrayList<>()).add(prereq);
            dependentes.computeIfAbsent(prereq, k -> new ArrayList<>()).add(cadeira.key());
        }
    }

    public List<Integer> getPrerequisitos(int key) {
        return prerequisitos.getOrDefault(key, List.of());
    }

    public List<Integer> getDependentes(int key) {
        return dependentes.getOrDefault(key, List.of());
    }

    public Cadeira getCadeira(int key) {
        return cadeiras.get(key);
    }

    public Collection<Cadeira> getTodasCadeiras() {
        return cadeiras.values();
    }
}

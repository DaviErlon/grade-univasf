package com.appgrade.models;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashSet;

public abstract class Grade {

    private final Map<Integer, String> cad;           // cadeiras:       id -> nome
    private final Map<Integer, Set<Integer>> pre;     // prerrequisitos: id -> set de ids
    private final Map<Integer, Set<Integer>> dep;     // dependetes:     id -> set de ids
    private final Map<Integer, Set<Integer>> per;     // periodos:       periodo -> set de ids
    private int p;

    public Grade(){
        this.p = 0;
        this.cad = new HashMap<>();
        this.per = new HashMap<>();
        this.pre = new HashMap<>();
        this.dep = new HashMap<>();
        setNextPeriodo();
    }

    public void addCadeira(int id, String nome){
        this.cad.put(id, nome);
        this.per.get(p).add(id);
    }

    public void addCadeira(int id, String nome, Set<Integer> pre){
        addCadeira(id, nome);

        for(int i : pre){
            this.pre.computeIfAbsent(id , k -> new LinkedHashSet<>()).add(i);
            this.dep.computeIfAbsent(i, k -> new LinkedHashSet<>()).add(id);
        }
    }

    public void setNextPeriodo(){
        this.per.put(++p, new LinkedHashSet<>());
    }

    public Map<Integer, Set<Integer>> getDep() {
        return this.dep;
    }

    public Map<Integer, Set<Integer>> getPer() {
        return this.per;
    }

    public Map<Integer, Set<Integer>> getPre() {
        return this.pre;
    }

    public Map<Integer, String> getCad() {
        return this.cad;
    }

    public int getQntPeriodos(){
        return this.p;
    }
}




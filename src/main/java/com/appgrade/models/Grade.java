package com.appgrade.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class Grade {

    protected Map<Integer, Cadeira> disciplinas;
    protected Map<Integer, int[]> preRequisito;
    protected Map<Integer, int[]> requisitoDe;

    public Grade(){
        this.disciplinas = new HashMap<>();
        this.preRequisito = new HashMap<>();
        this.requisitoDe = new HashMap<>();
    }

    public void addCadeira(Cadeira cadeira){
        this.disciplinas.put(cadeira.getKey(), cadeira);
    }

    public void addCadeira(Cadeira cadeira, int[] pre){
        this.disciplinas.put(cadeira.getKey(), cadeira);
        this.preRequisito.put(cadeira.getKey(), pre);
        updateRequisitoDe(cadeira.getKey(), pre);
    }

    protected void updateRequisitoDe(int cadeira, int[] preReqs) {
        for (int preReq : preReqs) {
            int[] dependentes = requisitoDe.get(preReq);

            if (dependentes == null) {
                requisitoDe.put(preReq, new int[]{cadeira});
            } else if (Arrays.stream(dependentes).noneMatch(d -> d == cadeira)) {
                int[] novoDependentes = Arrays.copyOf(dependentes, dependentes.length + 1);
                novoDependentes[dependentes.length] = cadeira;
                requisitoDe.put(preReq, novoDependentes);
            }
        }
    }

    public Map<Integer, Cadeira> getDisciplinas() {
        return disciplinas;
    }

    public Map<Integer, int[]> getPreRequisito() {
        return preRequisito;
    }

    public Map<Integer, int[]> getRequisitoDe() {
        return requisitoDe;
    }

}

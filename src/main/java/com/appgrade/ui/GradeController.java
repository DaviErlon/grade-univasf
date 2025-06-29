package com.appgrade.ui;

import com.appgrade.models.Grade;
import com.appgrade.utils.Click;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.*;

public class GradeController extends HBox {

    private Map<Integer, CadeiraController> cad;
    private Map<Integer, Set<Integer>> pre;
    private Map<Integer, Set<Integer>> dep;

    public GradeController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/components/grade.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        cad = new HashMap<>();
        pre = new HashMap<>();
        dep = new HashMap<>();

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static GradeController create(Grade g) {
        GradeController v = new GradeController();
        v.init(g);
        return v;
    }

    private void init(Grade g){

        this.pre = g.getPre();
        this.dep = g.getDep();

        Click onCadeiraClicked = id -> {
            CadeiraController c = cad.get(id);

            if (c.isClicado()) {
                // --- LÓGICA PARA DESMARCAR ---
                // Percorre o grafo de DEPENDENTES para desmarcar todos que dependem da cadeira clicada
                for (int dependentId : percorrerGrafo(dep, id, true)) {
                    cad.get(dependentId).desmarcar();
                }
            } else {
                // --- LÓGICA PARA SELECIONAR ---
                // Percorre o grafo de PRÉ-REQUISITOS para marcar todos que são necessários
                for (int preRequisiteId : percorrerGrafo(pre, id, false)) {
                    cad.get(preRequisiteId).selecionar();
                }
                c.selecionar(); // Seleciona a própria cadeira clicada
            }

            // Após qualquer mudança, recalcula a disponibilidade de TODAS as cadeiras.
            atualizarDisponibilidadeDaGrade();
        };

        Map<Integer, Set<Integer>> periodos = g.getPer();
        Map<Integer, String> cadeiras = g.getCad();
        // Sugestão da análise anterior aplicada aqui para obter o número correto de períodos.
        int p = g.getQntPeriodos(); // Supondo que Grade.java foi corrigido para return p;

        for(int i = 1; i <= p; i++){
            PeriodoController x = PeriodoController.create(i);
            // periodos.getOrDefault(i, Set.of()) -> usa o 'i' diretamente se os períodos forem 1-based
            for(int id : periodos.getOrDefault(i, Set.of())){
                boolean podeCursarInicialmente = !this.pre.containsKey(id);
                CadeiraController c = CadeiraController.create(id, cadeiras.get(id), onCadeiraClicked, podeCursarInicialmente);
                x.getChildren().add(c);
                this.cad.put(id, c);
            }
            this.getChildren().add(x);
        }
    }

    /**
     * Verifica se uma cadeira pode ser cursada checando se todos os seus pré-requisitos estão selecionados.
     */
    private boolean podeSerCursado(int k){
        Set<Integer> preRequisitos = pre.get(k);
        if (preRequisitos == null || preRequisitos.isEmpty()) {
            return true; // Não tem pré-requisitos, pode ser cursado.
        }

        for(int preId : preRequisitos){
            if (!cad.get(preId).isClicado()){
                return false; // Encontrou um pré-requisito não selecionado.
            }
        }
        return true; // Todos os pré-requisitos estão selecionados.
    }

    /**
     * Itera por todas as cadeiras e atualiza seu estado de disponibilidade.
     * Centraliza a lógica de atualização da UI.
     */
    private void atualizarDisponibilidadeDaGrade() {
        for (CadeiraController c : cad.values()) {
            c.setPodeCursar(podeSerCursado(c.getKey()));
        }
    }

    private Set<Integer> percorrerGrafo(Map<Integer, Set<Integer>> grafo, int inicio, boolean condicaoClicado) {
        Set<Integer> visitados = new LinkedHashSet<>();
        dfs(inicio, grafo, visitados, condicaoClicado);
        return visitados;
    }

    private void dfs(int atual, Map<Integer, Set<Integer>> grafo, Set<Integer> visitados, boolean condicaoClicado) {
        // A condição de parada agora usa o getter isClicado()
        if (visitados.contains(atual) || cad.get(atual).isClicado() != condicaoClicado) {
            return;
        }

        visitados.add(atual);

        Set<Integer> vizinhos = grafo.getOrDefault(atual, Set.of());
        for (int vizinho : vizinhos) {
            dfs(vizinho, grafo, visitados, condicaoClicado);
        }
    }
}
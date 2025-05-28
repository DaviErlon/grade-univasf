package com.appgrade.models;

import java.util.*;

public class GradeCC extends Grade {

    public GradeCC() {

        this.periodo = new HashMap<>();
        this.prerrequisitos = new HashMap<>();
        this.requisitoDe = new HashMap<>();

        Set<String> disciplinasP1 = new HashSet<>();
        disciplinasP1.add("Introdução a Ciência da Computação");
        disciplinasP1.add("Introdução a Programação");
        disciplinasP1.add("Cálculo I");
        disciplinasP1.add("Geometria Analítica");
        disciplinasP1.add("Matemática Discreta");
        disciplinasP1.add("Metodologia Científica");
        this.periodo.put(1, disciplinasP1);

        Set<String> disciplinasP2 = new HashSet<>();
        disciplinasP2.add("Paradigmas de Linguagem de Programação");
        disciplinasP2.add("Sistemas de Informação");
        disciplinasP2.add("Cálculo II");
        disciplinasP2.add("Física I");
        disciplinasP2.add("Álgebra Linear");
        disciplinasP2.add("Lógica");
        disciplinasP2.add("Administração");
        this.prerrequisitos.put("Cálculo II", Set.of("Cálculo I"));
        this.prerrequisitos.put("Lógica", Set.of("Matemática Discreta"));
        this.prerrequisitos.put("Álgebra Linear", Set.of("Geometria Analítica"));
        this.periodo.put(2, disciplinasP2);

        Set<String> disciplinasP3 = new HashSet<>();
        disciplinasP3.add("Algoritmos e Estrutura de Dados I");
        disciplinasP3.add("Programação Orientada a Objetos");
        disciplinasP3.add("Banco de Dados I");
        disciplinasP3.add("Física II");
        disciplinasP3.add("Estatística Básica");
        disciplinasP3.add("Circuitos Digitais");
        disciplinasP3.add("Planejamento e Gestão");
        this.prerrequisitos.put("Algoritmos e Estrutura de Dados I", Set.of("Introdução a Programação"));
        this.prerrequisitos.put("Programação Orientada a Objetos", Set.of("Introdução a Programação"));
        this.prerrequisitos.put("Física II", Set.of("Física I"));
        this.prerrequisitos.put("Circuitos Digitais", Set.of("Introdução a Ciência da Computação", "Lógica"));
        this.periodo.put(3, disciplinasP3);

        Set<String> disciplinasP4 = new HashSet<>();
        disciplinasP4.add("Algoritmos e Estrutura de Dados II");
        disciplinasP4.add("Redes de Computadores");
        disciplinasP4.add("Banco de Dados II");
        disciplinasP4.add("Análise de Algoritmos");
        disciplinasP4.add("Línguagens Formais e Autômatos");
        disciplinasP4.add("Arquitetura de Computadores");
        disciplinasP4.add("Empreendedorismo");
        this.prerrequisitos.put("Algoritmos e Estrutura de Dados II", Set.of("Algoritmos e Estrutura de Dados I"));
        this.prerrequisitos.put("Redes de Computadores", Set.of("Introdução a Ciência da Computação"));
        this.prerrequisitos.put("Banco de Dados II", Set.of("Banco de Dados I"));
        this.prerrequisitos.put("Análise de Algoritmos", Set.of("Algoritmos e Estrutura de Dados I", "Lógica", "Cálculo I"));
        this.prerrequisitos.put("Línguagens Formais e Autômatos", Set.of("Matemática Discreta"));
        this.prerrequisitos.put("Arquitetura de Computadores", Set.of("Circuitos Digitais"));
        this.prerrequisitos.put("Empreendedorismo", Set.of("Introdução a Ciência da Computação"));
        this.periodo.put(4, disciplinasP4);

        Set<String> disciplinasP5 = new HashSet<>();
        disciplinasP5.add("Inteligência Artificial");
        disciplinasP5.add("Construção de Compiladores");
        disciplinasP5.add("Computabilidade e Decibilidade");
        disciplinasP5.add("Desenvolvimento de Negócios");
        disciplinasP5.add("Sistemas Operacionais");
        disciplinasP5.add("Núcleo Temático");
        this.prerrequisitos.put("Inteligência Artificial", Set.of("Lógica"));
        this.prerrequisitos.put("Construção de Compiladores", Set.of("Línguagens Formais e Autômatos"));
        this.prerrequisitos.put("Computabilidade e Decibilidade", Set.of("Lógica", "Línguagens Formais e Autômatos"));
        this.prerrequisitos.put("Desenvolvimento de Negócios", Set.of("Empreendedorismo"));
        this.prerrequisitos.put("Sistemas Operacionais", Set.of("Arquitetura de Computadores"));
        this.periodo.put(5, disciplinasP5);

        Set<String> disciplinasP6 = new HashSet<>();
        disciplinasP6.add("Ciência de Dados");
        disciplinasP6.add("Engenharia de Software");
        disciplinasP6.add("Sistemas Distribuídos");
        disciplinasP6.add("Eletiva I");
        disciplinasP6.add("Eletiva II");
        disciplinasP6.add("Optativa I");
        disciplinasP6.add("Optativa II");
        this.prerrequisitos.put("Ciência de Dados", Set.of("Inteligência Artificial", "Estatística Básica"));
        this.prerrequisitos.put("Sistemas Distribuídos", Set.of("Redes de Computadores", "Sistemas Operacionais"));
        this.periodo.put(6, disciplinasP6);

        Set<String> disciplinasP7 = new HashSet<>();
        disciplinasP7.add("Trabalho de Conclusão de Curso I");
        disciplinasP7.add("Projeto de Sistemas Computacionais");
        disciplinasP7.add("Interação Homem-Computador");
        disciplinasP7.add("Optativa III");
        disciplinasP7.add("Optativa IV");
        disciplinasP7.add("Optativa V");
        disciplinasP7.add("Eletiva III");
        this.prerrequisitos.put("Projeto de Sistemas Computacionais", Set.of("Banco de Dados II", "Programação Orientada a Objetos", "Engenharia de Software"));
        this.periodo.put(7, disciplinasP7);

        Set<String> disciplinasP8 = new HashSet<>();
        disciplinasP8.add("Trabalho de Conclusão de Curso II");
        disciplinasP8.add("Estágio Supervisionado");
        disciplinasP8.add("Atividades Complementares");
        this.prerrequisitos.put("Trabalho de Conclusão de Curso II", Set.of("Trabalho de Conclusão de Curso I"));
        this.periodo.put(8, disciplinasP8);

        for (Map.Entry<String, Set<String>> entry : prerrequisitos.entrySet()) {
            String disciplina = entry.getKey();
            Set<String> preReqs = entry.getValue();
            for (String preReq : preReqs) {
                requisitoDe.computeIfAbsent(preReq, k -> new HashSet<>()).add(disciplina);
            }
        }

    }
}
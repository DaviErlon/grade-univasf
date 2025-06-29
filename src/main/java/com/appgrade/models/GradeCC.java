package com.appgrade.models;

import java.util.Set;

public class GradeCC extends Grade {

    public GradeCC() {

        addCadeira(1, "Introdução à Ciência da Computação");
        addCadeira(2, "Introdução à Programação");
        addCadeira(3, "Cálculo I");
        addCadeira(4, "Geometria Analítica");
        addCadeira(5, "Matemática Discreta");
        addCadeira(6, "Metodologia Científica");

        setNextPeriodo();
        addCadeira(7, "Paradigmas de Linguagens de Programação");
        addCadeira(8, "Sistemas de Informação");
        addCadeira(9, "Cálculo II", Set.of(3));
        addCadeira(10,"Física I");
        addCadeira(11, "Álgebra Linear", Set.of(4));
        addCadeira(12, "Lógica", Set.of(5));
        addCadeira(13, "Administração");

        setNextPeriodo();
        addCadeira(14, "Algoritmos e Estruturas de Dados I", Set.of(2));
        addCadeira(15,"Programação Orientada a Objetos", Set.of(2));
        addCadeira(16, "Banco de Dados I");
        addCadeira(17, "Física II", Set.of(10));
        addCadeira(18, "Estatística Básica");
        addCadeira(19, "Circuitos Digitais", Set.of(1, 12));
        addCadeira(20, "Planejamento e Gestão");

        setNextPeriodo();
        addCadeira(21, "Algoritmos e Estruturas de Dados II", Set.of(14));
        addCadeira(22, "Redes de Computadores", Set.of(1));
        addCadeira(23, "Banco de Dados II", Set.of(16));
        addCadeira(24, "Análise de Algoritmos", Set.of(3,12,14));
        addCadeira(25, "Linguagens Formais e Autômatos", Set.of(5));
        addCadeira(26, "Arquitetura de Computadores", Set.of(19));
        addCadeira(27, "Empreendedorismo", Set.of(1));

        setNextPeriodo();
        addCadeira(28, "Inteligência Artificial", Set.of(12));
        addCadeira(29, "Construção de Compiladores", Set.of(25));
        addCadeira(30, "Computabilidade e Decidibilidade", Set.of(12,25));
        addCadeira(31, "Desenvolvimento de Negócios", Set.of(27));
        addCadeira(32, "Sistemas Operacionais", Set.of(26));
        addCadeira(33, "Núcleo Temático");

        setNextPeriodo();
        addCadeira(34, "Ciência de Dados", Set.of(18, 28));
        addCadeira(35, "Engenharia de Software");
        addCadeira(36, "Sistemas Distribuídos", Set.of(22,32));
        addCadeira(37, "Eletiva I");
        addCadeira(38, "Eletiva II");
        addCadeira(39, "Optativa I");
        addCadeira(40, "Optativa II");

        setNextPeriodo();
        addCadeira(41, "Trabalho de Conclusão de Curso");
        addCadeira(42, "Projeto de Sistemas Computacionais", Set.of(23,15,35));
        addCadeira(43, "Interação Homem Computador");
        addCadeira(44, "Optativa III");
        addCadeira(45, "Optativa IV");
        addCadeira(46, "Optativa V");
        addCadeira(47, "Eletiva III");

        setNextPeriodo();
        addCadeira(48, "Trabalho de Conclusão de Curso II", Set.of(41));
        addCadeira(49, "Estágio Supervisionado");
        addCadeira(50, "Atividades Complementares");
    }
}
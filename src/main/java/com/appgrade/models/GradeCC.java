package com.appgrade.models;

public class GradeCC extends Grade {

    public GradeCC() {
        super(8);
        int key = 1;

        addCadeira(new Cadeira("Introdução à Ciência da Computação", 1, key++));
        addCadeira(new Cadeira("Introdução à Programação", 1, key++));
        addCadeira(new Cadeira("Cálculo I", 1, key++));
        addCadeira(new Cadeira("Geometria Analítica", 1, key++));
        addCadeira(new Cadeira("Matemática Discreta", 1, key++));
        addCadeira(new Cadeira("Metodologia Científica", 1, key++));

        addCadeira(new Cadeira("Paradigmas de Linguagens de Programação", 2, key++));
        addCadeira(new Cadeira("Sistemas de Informação", 2, key++));
        addCadeira(new Cadeira("Cálculo II", 2, key++), new int[]{3});
        addCadeira(new Cadeira("Física I", 2, key++));
        addCadeira(new Cadeira("Álgebra Linear", 2, key++), new int[]{4});
        addCadeira(new Cadeira("Lógica", 2, key++), new int[]{5});
        addCadeira(new Cadeira("Administração", 2, key++));

        addCadeira(new Cadeira("Algoritmos e Estruturas de Dados I", 3, key++), new int[]{1});
        addCadeira(new Cadeira("Programação Orientada a Objetos", 3, key++), new int[]{1});
        addCadeira(new Cadeira("Banco de Dados I", 3, key++));
        addCadeira(new Cadeira("Física II", 3, key++), new int[]{10});
        addCadeira(new Cadeira("Estatística Básica", 3, key++));
        addCadeira(new Cadeira("Circuitos Digitais", 3, key++), new int[]{1, 12});
        addCadeira(new Cadeira("Planejamento e Gestão", 3, key++));

        addCadeira(new Cadeira("Algoritmos e Estruturas de Dados II", 4, key++), new int[]{14});
        addCadeira(new Cadeira("Redes de Computadores", 4, key++), new int[]{1});
        addCadeira(new Cadeira("Banco de Dados II", 4, key++), new int[]{16});
        addCadeira(new Cadeira("Análise de Algoritmos", 4, key++), new int[]{14, 12, 3});
        addCadeira(new Cadeira("Linguagens Formais e Autômatos", 4, key++), new int[]{5});
        addCadeira(new Cadeira("Arquitetura de Computadores", 4, key++), new int[]{19});
        addCadeira(new Cadeira("Empreendedorismo", 4, key++), new int[]{1});

        addCadeira(new Cadeira("Inteligência Artificial", 5, key++), new int[]{12});
        addCadeira(new Cadeira("Construção de Compiladores", 5, key++), new int[]{25});
        addCadeira(new Cadeira("Computabilidade e Decidibilidade", 5, key++), new int[]{12,25});
        addCadeira(new Cadeira("Desenvolvimento de Negócios", 5, key++), new int[]{27});
        addCadeira(new Cadeira("Sistemas Operacionais", 5, key++), new int[]{26});
        addCadeira(new Cadeira("Núcleo Temático", 5, key++));

        addCadeira(new Cadeira("Ciência de Dados", 6, key++), new int[]{28, 18});
        addCadeira(new Cadeira("Engenharia de Software", 6, key++));
        addCadeira(new Cadeira("Sistemas Distribuídos", 6, key++), new int[]{22, 32});
        addCadeira(new Cadeira("Eletiva I", 6, key++));
        addCadeira(new Cadeira("Eletiva II", 6, key++));
        addCadeira(new Cadeira("Optativa I", 6, key++));
        addCadeira(new Cadeira("Optativa II", 6, key++));

        addCadeira(new Cadeira("Trabalho de Conclusão de Curso", 7, key++));
        addCadeira(new Cadeira("Projeto de Sistemas Computacionais", 7, key++), new int[]{23,15,35});
        addCadeira(new Cadeira("Interação Homem-Computador", 7, key++));
        addCadeira(new Cadeira("Optativa III", 7, key++));
        addCadeira(new Cadeira("Optativa IV", 7, key++));
        addCadeira(new Cadeira("Optativa V", 7, key++));
        addCadeira(new Cadeira("Eletiva III", 7, key++));

        addCadeira(new Cadeira("Trabalho de Conclusão de Curso II", 8, key++), new int[]{41});
        addCadeira(new Cadeira("Estágio Supervisionado", 8, key++));
        addCadeira(new Cadeira("Atividades Complementares", 8, key++));
    }
}
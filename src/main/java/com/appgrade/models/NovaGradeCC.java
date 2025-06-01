package com.appgrade.models;

public class NovaGradeCC extends Grade {

	public NovaGradeCC() {
		super(8);
		int key = 1;

		addCadeira(new Cadeira("Pragramação Imperativa", 1, key++));
		addCadeira(new Cadeira("Fundamentos da Lógica Matemática", 1, key++));
		addCadeira(new Cadeira("Introdução à Ciência da Computação", 1, key++));
		addCadeira(new Cadeira("Matemática Elementar", 1, key++));
		addCadeira(new Cadeira("Metodologia Científica", 1, key++));

		addCadeira(new Cadeira("Algoritmos e Estruturas de Dados", 2, key++), new int[] { 1 });
		addCadeira(new Cadeira("Programação Orientada a Objetos", 2, key++));
		addCadeira(new Cadeira("Geometria Analítica e Vetores ", 2, key++));
		addCadeira(new Cadeira("Cálculo I", 2, key++), new int[] { 4 });
		addCadeira(new Cadeira("Sistemas de Informação ", 2, key++));
		addCadeira(new Cadeira("Projeto e Desenvolvimento de Software I", 2, key++));

		addCadeira(new Cadeira("Sistemas Operacionais", 3, key++));
		addCadeira(new Cadeira("Redes de Computadores", 3, key++));
		addCadeira(new Cadeira("Banco de Dados", 3, key++));
		addCadeira(new Cadeira("Cálculo II", 3, key++), new int[] { 9 });
		addCadeira(new Cadeira("Administração Aplicada Projetos de Sistemas", 3, key++));
		addCadeira(new Cadeira("Projeto e Desenvolvimento de Software II", 3, key++));

		addCadeira(new Cadeira("Arquitetura e Organização de Computadores", 4, key++));
		addCadeira(new Cadeira("Sistemas Distribuidos", 4, key++), new int[] { 12, 13 });
		addCadeira(new Cadeira("Computação Inteligente", 4, key++), new int[] { 6 });
		addCadeira(new Cadeira("Álgebra Linear", 4, key++), new int[] { 9 });
		addCadeira(new Cadeira("Engenharia de Software", 4, key++), new int[] { 7 });
		addCadeira(new Cadeira("Projeto e Desenvolvimento de Software III", 4, key++));

		addCadeira(new Cadeira("Linguagens Formais, Autômatos", 5, key++), new int[] { 2 });
		addCadeira(new Cadeira("Análise de Algoritmos", 5, key++), new int[] { 6, 2 });
		addCadeira(new Cadeira("Mecânica Clássica", 5, key++), new int[] { 8, 9, 15 });
		addCadeira(new Cadeira("Estatística Básica", 5, key++), new int[] { 4, 9 });
		addCadeira(new Cadeira("Empreendedorismo Tecnológico e Inovação Computacional", 5, key++));
		addCadeira(new Cadeira("Projeto e Desenvolvimento de Software IV", 5, key++));

		addCadeira(new Cadeira("Computabilidade e Decibilidade", 6, key++), new int[] { 24 });
		addCadeira(new Cadeira("Construção de Compiladores", 6, key++), new int[] { 24 });
		addCadeira(new Cadeira("Aprendizado de Máquina", 6, key++), new int[] { 20, 27 });
		addCadeira(new Cadeira("Eletromagnetismo Clássico", 6, key++), new int[] { 26 });
		addCadeira(new Cadeira("Auditoria e Segurança de Dados", 6, key++));
		addCadeira(new Cadeira("Projeto e Desenvolvimento de Software V", 6, key++));

		addCadeira(new Cadeira("Interação Humano-Computador", 7, key++), new int[] { 22 });
		addCadeira(new Cadeira("Núcleo Temático", 7, key++));
		addCadeira(new Cadeira("Projeto e Desenvolvimento de Software VI", 3, key++));
		addCadeira(new Cadeira("Optativa I", 7, key++));
		addCadeira(new Cadeira("Optativa II", 7, key++));
		addCadeira(new Cadeira("Eletiva I", 7, key++));

		addCadeira(new Cadeira("Trabalho de Conclusão de Curso", 8, key++));
		addCadeira(new Cadeira("Optativa III", 8, key++));
		addCadeira(new Cadeira("Optativa IV", 8, key++));
		addCadeira(new Cadeira("Eletiva II", 8, key++));
		addCadeira(new Cadeira("Atividades Complementares", 8, key++));

	}

}

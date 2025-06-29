package com.appgrade.models;

import java.util.Set;

public class NovaGradeCC extends Grade {

	public NovaGradeCC() {

		addCadeira(1, "Programação Imperativa");
		addCadeira(2, "Fundamentos da Lógica Matemática");
		addCadeira(3, "Introdução à Ciência da Computação");
		addCadeira(4, "Matemática Elementar");
		addCadeira(5, "Metodologia Científica");

		setNextPeriodo();

		addCadeira(6, "Algoritmos e Estruturas de Dados", Set.of(1));
		addCadeira(7, "Programação Orientada a Objetos");
		addCadeira(8, "Geometria Analítica e Vetores");
		addCadeira(9, "Cálculo I", Set.of(4));
		addCadeira(10, "Sistemas de Informação");
		addCadeira(11, "Desenvolvimento de Software I");

		setNextPeriodo();
		addCadeira(12, "Sistemas Operacionais");
		addCadeira(13, "Redes de Computadores");
		addCadeira(14, "Banco de Dados");
		addCadeira(15, "Cálculo II", Set.of(9));
		addCadeira(16, "Administração");
		addCadeira(17, "Desenvolvimento de Software II");

		setNextPeriodo();
		addCadeira(18, "Arquitetura de Computadores");
		addCadeira(19, "Sistemas Distribuídos", Set.of(12, 13));
		addCadeira(20, "Computação Inteligente", Set.of(6));
		addCadeira(21, "Álgebra Linear", Set.of(9));
		addCadeira(22, "Engenharia de Software", Set.of(7));
		addCadeira(23, "Desenvolvimento de Software III");

		setNextPeriodo();
		addCadeira(24, "Linguagens Formais, Autômatos", Set.of(2));
		addCadeira(25, "Análise de Algoritmos", Set.of(6, 2));
		addCadeira(26, "Mecânica Clássica", Set.of(8, 9, 15));
		addCadeira(27, "Estatística Básica", Set.of(4, 9));
		addCadeira(28, "Empreendedorismo");
		addCadeira(29, "Desenvolvimento de Software IV");

		setNextPeriodo();
		addCadeira(30, "Computabilidade e Decidibilidade", Set.of(24));
		addCadeira(31, "Construção de Compiladores", Set.of(24));
		addCadeira(32, "Aprendizado de Máquina", Set.of(20, 27));
		addCadeira(33, "Eletromagnetismo Clássico", Set.of(26));
		addCadeira(34, "Auditoria e Segurança de Dados");
		addCadeira(35, "Desenvolvimento de Software V");

		setNextPeriodo();
		addCadeira(36, "Interação Humano Computador", Set.of(22));
		addCadeira(37, "Núcleo Temático");
		addCadeira(38, "Desenvolvimento de Software VI");
		addCadeira(39, "Optativa I");
		addCadeira(40, "Optativa II");
		addCadeira(41, "Eletiva I");

		setNextPeriodo();
		addCadeira(42, "Trabalho de Conclusão de Curso");
		addCadeira(43, "Optativa III");
		addCadeira(44, "Optativa IV");
		addCadeira(45, "Eletiva II");
		addCadeira(46, "Atividades Complementares");
	}
}

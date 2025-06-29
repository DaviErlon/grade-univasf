package com.appgrade.models;

import java.util.Set;

public class GradeProd extends Grade {

	public GradeProd() {

		addCadeira(1, "Cálculo I");
		addCadeira(2, "Geometria Analítica");
		addCadeira(3, "Humanidade e Cidadania");
		addCadeira(4, "Química Teórica");
		addCadeira(5, "Química Prática");
		addCadeira(6, "Metodologia e Expr. Técnica e Científica");
		addCadeira(7, "Introdução a Engenharia de Produção");

		setNextPeriodo();
		addCadeira(8, "Cálculo II", Set.of(1));
		addCadeira(9, "Álgebra Linear", Set.of(2));
		addCadeira(10, "Física Teórica I");
		addCadeira(11, "Desenho Técnico");
		addCadeira(12, "Economia");
		addCadeira(13, "Evolução das Técnicas de Gestão");
		addCadeira(14, "Ética e Exercício Profissional");

		setNextPeriodo();
		addCadeira(15, "Cálculo III", Set.of(8));
		addCadeira(16, "Introdução a Ciência dos Materiais");
		addCadeira(17, "Física Teórica II");
		addCadeira(18, "Algoritmo e Programação");
		addCadeira(19, "Estatística Básica");
		addCadeira(20, "Custos Industriais");

		setNextPeriodo();
		addCadeira(21, "Fenômenos de Transporte", Set.of(15, 17));
		addCadeira(22, "Física Experimental A");
		addCadeira(23, "Mecânica dos Sólidos");
		addCadeira(24, "Cálculo Numérico");
		addCadeira(25, "Engenharia Financeira");
		addCadeira(26, "Estatística Para Engenharia de Produção", Set.of(19));

		setNextPeriodo();
		addCadeira(27, "Física Teórica III");
		addCadeira(28, "Resistência dos Materiais");
		addCadeira(29, "Pesquisa Operacional I");
		addCadeira(30, "Engenharia de Métodos");
		addCadeira(31, "Segurança do Trabalho");
		addCadeira(32, "Análise de Investimentos", Set.of(26));
		addCadeira(33, "Eletiva I");

		setNextPeriodo();
		addCadeira(34, "Eletrotécnica");
		addCadeira(35, "Logística");
		addCadeira(36, "Planejamento e Controle da Produção I", Set.of(19));
		addCadeira(37, "Gestão da Qualidade");
		addCadeira(38, "Ergonomia");
		addCadeira(39, "Pesquisa Operacional II", Set.of(29));
		addCadeira(40, "Optativa I");

		setNextPeriodo();
		addCadeira(41, "Planejamento e Controle da Produção II");
		addCadeira(42, "Gestão Ambiental");
		addCadeira(43, "Engenharia do Produto");
		addCadeira(44, "Simulação de Processos Produtivos", Set.of(18));
		addCadeira(45, "Logística de Suprimentos");
		addCadeira(46, "Optativa II");

		setNextPeriodo();
		addCadeira(47, "Processos Industriais", Set.of(4, 5));
		addCadeira(48, "Avaliação do Desempenho Organizacional", Set.of(26));
		addCadeira(49, "Projeto de Fábrica", Set.of(11, 36));
		addCadeira(50, "Gestão de Serviços");
		addCadeira(51, "Eletiva II");
		addCadeira(52, "Logística de Distribuição");

		setNextPeriodo();
		addCadeira(53, "Inovação e Informação");
		addCadeira(54, "Controle Estatístico de Qualidade", Set.of(26));
		addCadeira(55, "Gestão de Projetos");
		addCadeira(56, "Empreendedorismo");
		addCadeira(57, "Projeto de TCC");
		addCadeira(58, "Núcleo Temático");

		setNextPeriodo();
		addCadeira(59, "Trabalho de Conclusão de Curso (TCC)");
		addCadeira(60, "Estágio Curricular");
	}
}

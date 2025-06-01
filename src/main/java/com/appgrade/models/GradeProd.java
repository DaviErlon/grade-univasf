package com.appgrade.models;

public class GradeProd extends Grade {

	public GradeProd() {
		super(10);
		int key = 1;

		addCadeira(new Cadeira("Cálculo I", 1, key++));
		addCadeira(new Cadeira("Geometria Analítica", 1, key++));
		addCadeira(new Cadeira("Humanidade e Cidadania", 1, key++));
		addCadeira(new Cadeira("Química Teórica", 1, key++));
		addCadeira(new Cadeira("Química Prática", 1, key++));
		addCadeira(new Cadeira("Metodologia e Expr. Técnica e Científica", 1, key++));
		addCadeira(new Cadeira("Introdução a Engenharia de Produção", 1, key++));

		addCadeira(new Cadeira("Cálculo II", 2, key++), new int[] { 1 });
		addCadeira(new Cadeira("Álgebra Linear", 2, key++), new int[] { 2 });
		addCadeira(new Cadeira("Física Teórica I", 2, key++));
		addCadeira(new Cadeira("Desenho Técnico", 2, key++));
		addCadeira(new Cadeira("Economia", 2, key++));
		addCadeira(new Cadeira("Evolução das Técnicas de Gestão", 2, key++));
		addCadeira(new Cadeira("Ética e Exercício Profissional", 2, key++));

		addCadeira(new Cadeira("Cálculo III", 3, key++), new int[] { 8 });
		addCadeira(new Cadeira("Introdução a Ciência dos Materiais", 3, key++));
		addCadeira(new Cadeira("Física Teórica II", 3, key++));
		addCadeira(new Cadeira("Algoritmo e Programação", 3, key++));
		addCadeira(new Cadeira("Estatística Básica", 3, key++));
		addCadeira(new Cadeira("Custos Industriais", 3, key++));

		addCadeira(new Cadeira("Fenômenos de Transporte", 4, key++), new int[] { 15, 17 });
		addCadeira(new Cadeira("Física Experimental A", 4, key++));
		addCadeira(new Cadeira("Mecânica dos Sólidos", 4, key++));
		addCadeira(new Cadeira("Cálculo Numérico", 4, key++));
		addCadeira(new Cadeira("Engenharia Financeira", 4, key++));
		addCadeira(new Cadeira("Estatística Para Engenharia de Produção", 4, key++), new int[] { 19 });

		addCadeira(new Cadeira("Física Teórica III", 5, key++));
		addCadeira(new Cadeira("Resistência dos Materiais", 5, key++));
		addCadeira(new Cadeira("Pesquisa Operacional I", 5, key++));
		addCadeira(new Cadeira("Engenharia de Métodos", 5, key++));
		addCadeira(new Cadeira("Segurança do Trabalho", 5, key++));
		addCadeira(new Cadeira("Análise de Investimentos", 5, key++), new int[] { 26 });
		addCadeira(new Cadeira("Eletiva I", 5, key++));

		addCadeira(new Cadeira("Eletrotécnica", 6, key++));
		addCadeira(new Cadeira("Logística", 6, key++));
		addCadeira(new Cadeira("Planejamento e Controle da Produção I", 6, key++), new int[] { 19 });
		addCadeira(new Cadeira("Gestão da Qualidade", 6, key++));
		addCadeira(new Cadeira("Ergonomia", 6, key++));
		addCadeira(new Cadeira("Pesquisa Operacional II", 6, key++), new int[] { 29 });
		addCadeira(new Cadeira("Optativa I", 6, key++));

		addCadeira(new Cadeira("Planejamento e Controle da Produção II", 7, key++));
		addCadeira(new Cadeira("Gestão Ambiental", 7, key++));
		addCadeira(new Cadeira("Engenharia do Produto", 7, key++));
		addCadeira(new Cadeira("Simulação de Processos Produtivos", 7, key++), new int[] { 18 });
		addCadeira(new Cadeira("Logística de Suprimentos", 7, key++));
		addCadeira(new Cadeira("Optativa II", 7, key++));

		addCadeira(new Cadeira("Processos Industriais", 8, key++), new int[] { 4, 5 });
		addCadeira(new Cadeira("Avaliação do Desempenho Organizacional", 8, key++), new int[] { 26 });
		addCadeira(new Cadeira("Projeto de Fábrica", 8, key++), new int[] { 11, 36 });
		addCadeira(new Cadeira("Gestão de Serviços", 8, key++));
		addCadeira(new Cadeira("Eletiva II", 8, key++));
		addCadeira(new Cadeira("Logística de Distribuição", 8, key++));

		addCadeira(new Cadeira("Inovação e Informação", 9, key++));
		addCadeira(new Cadeira("Controle Estatístico de Qualidade", 9, key++), new int[] { 26 });
		addCadeira(new Cadeira("Gestão de Projetos", 9, key++));
		addCadeira(new Cadeira("Empreendedorismo", 9, key++));
		addCadeira(new Cadeira("Projeto de TCC", 9, key++));
		addCadeira(new Cadeira("Núcleo Temático", 9, key++));

		addCadeira(new Cadeira("Trabalho de Conclusão de Curso (TCC)", 10, key++));
		addCadeira(new Cadeira("Estágio Curricular", 10, key++));

	}

}

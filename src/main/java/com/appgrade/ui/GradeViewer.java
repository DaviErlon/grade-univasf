package com.appgrade.ui;

import com.appgrade.models.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class GradeViewer extends JPanel {

	private static final long serialVersionUID = 1L;
	private final Map<Integer, Estado> estados = new HashMap<>();
	private final Map<Integer, CadeiraViewer> botoes = new HashMap<>();

	public GradeViewer(Grade grade) {
		int maxPeriodo = grade.getTodasCadeiras().stream().mapToInt(Cadeira::periodo).max().orElse(8);

		setLayout(new GridLayout(1, maxPeriodo, 30, 10));

		for (int periodo = 1; periodo <= maxPeriodo; periodo++) {
			final int periodoFinal = periodo;

			JPanel col = new JPanel();
			col.setLayout(new BoxLayout(col, BoxLayout.Y_AXIS));
			col.setBorder(BorderFactory.createTitledBorder("Período " + periodo));

			List<Cadeira> cadeiras = grade.getTodasCadeiras().stream().filter(c -> c.periodo() == periodoFinal)
					.collect(Collectors.toList());

			for (Cadeira c : cadeiras) {
				CadeiraViewer btn = new CadeiraViewer(c);
				botoes.put(c.key(), btn);
				estados.put(c.key(), Estado.PADRAO);

				List<Integer> prereqs = grade.getPrerequisitos(c.key());
				if (!prereqs.isEmpty()) {
					String texto = "Pré-requisitos:\n" + prereqs.stream().map(id -> grade.getCadeira(id))
							.filter(Objects::nonNull).map(Cadeira::nome).collect(Collectors.joining("\n"));
					btn.setToolTipText("<html>" + texto.replaceAll("\n", "<br>") + "</html>");
				}

				btn.addActionListener(e -> {
					Estado atual = estados.get(c.key());

					if (atual == Estado.CONCLUIDA) {
						desmarcarEDependentes(grade, c.key());
					} else {
						marcarComPreRequisitos(grade, c.key());
					}

					atualizarEstados(grade);
					atualizarCores();
				});

				col.add(btn);
				col.add(Box.createRigidArea(new Dimension(0, 5)));
			}

			add(col);
		}

		atualizarEstados(grade);
		atualizarCores();
	}

	private void marcarComPreRequisitos(Grade grade, int key) {

		if (estados.getOrDefault(key, Estado.PADRAO) == Estado.CONCLUIDA)
			return;

		estados.put(key, Estado.CONCLUIDA);

		for (int prereq : grade.getPrerequisitos(key)) {
			marcarComPreRequisitos(grade, prereq);
		}
	}

	private void desmarcarEDependentes(Grade grade, int key) {
		if (estados.getOrDefault(key, Estado.PADRAO) != Estado.CONCLUIDA)
			return;

		estados.put(key, Estado.PADRAO);

		for (int dependente : grade.getDependentes(key)) {

			List<Integer> prereqs = grade.getPrerequisitos(dependente);
			boolean algumNaoConcluido = prereqs.stream()
					.anyMatch(id -> estados.getOrDefault(id, Estado.PADRAO) != Estado.CONCLUIDA);

			if (algumNaoConcluido) {
				desmarcarEDependentes(grade, dependente);
			}
		}
	}

	private void atualizarEstados(Grade grade) {
		for (Cadeira cadeira : grade.getTodasCadeiras()) {
			int key = cadeira.key();

			if (estados.get(key) == Estado.CONCLUIDA)
				continue;

			List<Integer> prereqs = grade.getPrerequisitos(key);
			boolean liberada = prereqs.stream()
					.allMatch(id -> estados.getOrDefault(id, Estado.PADRAO) == Estado.CONCLUIDA);

			if (liberada) {
				estados.put(key, Estado.LIBERADA);
			} else {
				estados.put(key, Estado.PADRAO);
			}
		}
	}

	private void atualizarCores() {
		for (Map.Entry<Integer, CadeiraViewer> entry : botoes.entrySet()) {
			int key = entry.getKey();
			CadeiraViewer viewer = entry.getValue();
			viewer.atualizarCor(estados.getOrDefault(key, Estado.PADRAO));
		}
	}
}

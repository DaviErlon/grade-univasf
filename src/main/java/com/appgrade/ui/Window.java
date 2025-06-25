package com.appgrade.ui;

import com.appgrade.models.*;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	public Window(String titulo, Grade grade, JFrame telaAnterior) {
		setTitle(titulo);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);
		setSize(1100, 600);
		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel legenda = new JPanel();
		legenda.setLayout(new FlowLayout(FlowLayout.LEFT));
		legenda.setBorder(BorderFactory.createTitledBorder("Legenda"));

		legenda.add(criarIndicador("Concluída", new Color(0x4DA6FF)));
		legenda.add(criarIndicador("Liberada", new Color(0xA9A9A9)));
		legenda.add(criarIndicador("Padrão", Color.WHITE));

		mainPanel.add(legenda, BorderLayout.SOUTH);

		JButton voltar = new JButton("Voltar");
		voltar.setPreferredSize(new Dimension(100, 30));
		voltar.addActionListener(e -> {
			dispose(); 
			telaAnterior.setVisible(true); 
		});

		JPanel topo = new JPanel(new FlowLayout(FlowLayout.LEFT));
		topo.add(voltar);

		mainPanel.add(topo, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(new GradeViewer(grade));
		mainPanel.add(scrollPane, BorderLayout.CENTER);

		setContentPane(mainPanel);
		setVisible(true);
	}

	private JPanel criarIndicador(String texto, Color cor) {
		JPanel indicador = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel corLabel = new JLabel("  ");
		corLabel.setOpaque(true);
		corLabel.setBackground(cor);
		corLabel.setPreferredSize(new Dimension(20, 20));
		corLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel textoLabel = new JLabel(texto);
		textoLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 10));

		indicador.add(corLabel);
		indicador.add(textoLabel);

		return indicador;
	}

}

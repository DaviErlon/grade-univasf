package com.appgrade.ui;

import javax.swing.*;
import java.awt.*;

public class GradeCCSelector extends JFrame {

    private static final long serialVersionUID = 1L;
	private final JFrame telaAnterior;

    public GradeCCSelector(JFrame telaAnterior) {
        this.telaAnterior = telaAnterior;

        setTitle("Selecionar Grade");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel titulo = new JLabel("Escolha a grade:", SwingConstants.CENTER);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        Dimension tamanhoBotao = new Dimension(250, 90);

        JButton antigaButton = new JButton("PPC Atual");
        antigaButton.setPreferredSize(tamanhoBotao);
        antigaButton.setMaximumSize(tamanhoBotao);
        antigaButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton novaButton = new JButton("Novo PPC");
        novaButton.setPreferredSize(tamanhoBotao);
        novaButton.setMaximumSize(tamanhoBotao);
        novaButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton voltarButton = new JButton("Voltar");
        voltarButton.setPreferredSize(tamanhoBotao);
        voltarButton.setMaximumSize(tamanhoBotao);
        voltarButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        antigaButton.addActionListener(e -> {
            dispose();
            new Window("CC - Grade Antiga", new com.appgrade.models.GradeCC(), this);
        });

        novaButton.addActionListener(e -> {
            dispose();
            new Window("CC - Nova Grade", new com.appgrade.models.NovaGradeCC(), this);
        });

        voltarButton.addActionListener(e -> {
            dispose();
            telaAnterior.setVisible(true);
        });

        panel.add(Box.createVerticalGlue());
        panel.add(titulo);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(antigaButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(novaButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(voltarButton);
        panel.add(Box.createVerticalGlue());

        setContentPane(panel);
        setVisible(true);
    }
}

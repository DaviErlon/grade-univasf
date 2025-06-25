package com.appgrade.ui;

import javax.swing.*;
import java.awt.*;

public class CourseSelector extends JFrame {

    private static final long serialVersionUID = 1L;

	public CourseSelector() {
        setTitle("Selecionar Curso");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel titulo = new JLabel("Escolha o curso:", SwingConstants.CENTER);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        Dimension tamanhoBotao = new Dimension(250, 90);

        JButton ccButton = new JButton("Ciência da Computação");
        ccButton.setPreferredSize(tamanhoBotao);
        ccButton.setMaximumSize(tamanhoBotao);
        ccButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton engButton = new JButton("Engenharia de Produção");
        engButton.setPreferredSize(tamanhoBotao);
        engButton.setMaximumSize(tamanhoBotao);
        engButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        ccButton.addActionListener(e -> {
            setVisible(false);
            new GradeCCSelector(this);
        });

        engButton.addActionListener(e -> {
            setVisible(false);
            new Window("Engenharia de Produção", new com.appgrade.models.GradeProd(), this);
        });

        panel.add(Box.createVerticalGlue());
        panel.add(titulo);
        panel.add(Box.createRigidArea(new Dimension(0, 40)));
        panel.add(ccButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(engButton);
        panel.add(Box.createVerticalGlue());

        setContentPane(panel);
        setVisible(true);
    }
}

package com.appgrade.ui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private final ImageIcon icone = new ImageIcon("src/main/resources/imagens/icone.png");

    public Window(){
        initialize();
    }

    public void initialize(){
        setTitle("Grade Ciência da Computação");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(1100,600);
        setLocationRelativeTo(null);
        setIconImage(icone.getImage().getScaledInstance(128, 128, Image.SCALE_SMOOTH));
        setLayout(new FlowLayout(FlowLayout.CENTER));

        setVisible(true);
    }

}


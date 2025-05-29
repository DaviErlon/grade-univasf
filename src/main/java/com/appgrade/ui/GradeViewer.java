package com.appgrade.ui;

import com.appgrade.models.GradeCC;
import javax.swing.*;
import java.awt.*;

public class GradeViewer extends JPanel {
    // contem label 1 e 2 em forma de linhas

    // -> label1
    // contem a barra de porcentagem

    // -> label2 em forma de colunas
    // contem os botões dos periodos
    // contem os periodos em coluna
    // periodos contem os botoes das cadeiras
    private final GradeCC dadosGrade;
    JPanel[] periodos;

    public GradeViewer(){

        dadosGrade = new GradeCC();
        periodos = new JPanel[8];
        setLayout(new FlowLayout(FlowLayout.CENTER));

        for(int i = 0; i < 8; i++) {
            periodos[i] = new JPanel();
            periodos[i].setLayout(new BoxLayout(periodos[i], BoxLayout.Y_AXIS));
            periodos[i].setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        dadosGrade.getDisciplinas().forEach((chave, valor) -> {
            JButton button = new CadeiraViewer(valor.getNome());
            periodos[valor.getPeriodo() - 1].add(button);
            });

        for(JPanel periodo : periodos){
            add(periodo);
            add(Box.createRigidArea(new Dimension(0, 10)));
        }

    }
}

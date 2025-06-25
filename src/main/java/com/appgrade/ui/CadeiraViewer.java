package com.appgrade.ui;

import com.appgrade.models.Cadeira;
import com.appgrade.models.Estado;

import javax.swing.*;
import java.awt.*;

public class CadeiraViewer extends JButton {

    private static final long serialVersionUID = 1L;
	private final int key;

    public CadeiraViewer(Cadeira cadeira) {
        super("<html><center>" + cadeira.nome() + "</center></html>");
        this.key = cadeira.key();
        setFocusable(false);
        setMargin(new Insets(10, 10, 10, 10));
        setPreferredSize(new Dimension(150, 60));
        setMinimumSize(new Dimension(150, 60));
        setMaximumSize(new Dimension(200, 80));

        setFont(new Font("SansSerif", Font.BOLD, 12));
        setForeground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        setOpaque(true);
        setContentAreaFilled(true);

        atualizarCor(Estado.PADRAO);
    }

    public int getKey() {
        return key;
    }

    public void atualizarCor(Estado estado) {
        switch (estado) {
            case CONCLUIDA -> setBackground(new Color(0x007BFF));
            case LIBERADA -> setBackground(new Color(0xD3D3D3));
            default -> setBackground(new Color(0xF0F0F0));
        }
    }
}

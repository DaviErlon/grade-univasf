package com.appgrade;

import javax.swing.SwingUtilities;
import com.appgrade.ui.Window;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Window::new);
    }
}
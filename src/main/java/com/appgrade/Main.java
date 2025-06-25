package com.appgrade;

import javax.swing.SwingUtilities;

import com.appgrade.ui.CourseSelector;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CourseSelector());
    }
}

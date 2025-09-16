package com.fmajka.compat.j2se.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GamePanel panel;

    public GameFrame() {
        panel = new GamePanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Fixes weird white borders on the left and bottom of the frame
        this.getContentPane().setLayout(new BorderLayout());
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

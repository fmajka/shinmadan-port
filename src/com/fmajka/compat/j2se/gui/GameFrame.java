package com.fmajka.compat.j2se.gui;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GamePanel panel;

    public GameFrame() {
        panel = new GamePanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

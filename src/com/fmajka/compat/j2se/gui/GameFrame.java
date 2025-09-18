package com.fmajka.compat.j2se.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GamePanel panel;

    public GameFrame() {
        panel = new GamePanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Touhou Shinmadan port");
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        pack();
        setMinimumSize(new Dimension(getWidth(), getHeight()));
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

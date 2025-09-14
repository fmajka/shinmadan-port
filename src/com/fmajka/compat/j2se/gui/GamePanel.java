package com.fmajka.compat.j2se.gui;

import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    GamePanel() {
        this.setPreferredSize(new Dimension(240, 240));
    }
}

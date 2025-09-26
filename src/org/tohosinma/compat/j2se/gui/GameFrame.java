package org.tohosinma.compat.j2se.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class GameFrame extends JFrame {
    public GamePanel panel;
    private boolean fullscreen = false;
    private GraphicsDevice device = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getDefaultScreenDevice();

    public GameFrame() {
        panel = new GamePanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Touhou Shinmadan port");
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        pack();
        setMinimumSize(new Dimension(getWidth(), getHeight()));

        // Toggle fullscreen bound to F11
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
             .put(KeyStroke.getKeyStroke("F11"), "toggleFullscreen");
        this.getRootPane().getActionMap()
             .put("toggleFullscreen", new AbstractAction() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     toggleFullscreen();
                 }
             });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void toggleFullscreen() {
        fullscreen = !fullscreen;
        this.dispose();
        if (fullscreen) {
            this.setUndecorated(true);
            device.setFullScreenWindow(this);
        } else {
            this.setUndecorated(false);
            device.setFullScreenWindow(null);
            this.setVisible(true);
        }
    }
}

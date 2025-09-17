package com.fmajka.compat.j2se.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.fmajka.compat.Context;

public class GamePanel extends JPanel {
    public Image backBuffer;

        // The keys you want to track
    private final int[] trackedKeys = {
        KeyEvent.VK_SHIFT, KeyEvent.VK_Z, KeyEvent.VK_X, KeyEvent.VK_ESCAPE,
        KeyEvent.VK_UP, KeyEvent.VK_DOWN, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT
    };

    private final HashMap<Integer, Integer> keyMap = new HashMap<Integer, Integer>();

    public GamePanel() {
        setPreferredSize(new Dimension(240, 240));
        setFocusable(true);

        keyMap.put(KeyEvent.VK_SHIFT, 1);
        keyMap.put(KeyEvent.VK_X, 4);
        keyMap.put(KeyEvent.VK_Z, 20);
        keyMap.put(KeyEvent.VK_ESCAPE, 21);
        keyMap.put(KeyEvent.VK_LEFT, 16);
        keyMap.put(KeyEvent.VK_UP, 17);
        keyMap.put(KeyEvent.VK_RIGHT, 18);
        keyMap.put(KeyEvent.VK_DOWN, 19);

        InputMap im = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getActionMap();

        for (int keyCode : trackedKeys) {
            for (int modifiers : new int[] {
                    0,
                    InputEvent.SHIFT_DOWN_MASK,
                    InputEvent.CTRL_DOWN_MASK,
                    InputEvent.ALT_DOWN_MASK,
                    InputEvent.META_DOWN_MASK
            }) {
                String pressedAction = "pressed " + keyCode + " mod " + modifiers;
                String releasedAction = "released " + keyCode + " mod " + modifiers;

                // Pressed
                im.put(KeyStroke.getKeyStroke(keyCode, modifiers, false), pressedAction);
                am.put(pressedAction, new KeyAction(keyCode, 1));

                // Released
                im.put(KeyStroke.getKeyStroke(keyCode, modifiers, true), releasedAction);
                am.put(releasedAction, new KeyAction(keyCode, 0));
            }
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth(), h = getHeight();
        int size = Math.min(w, h);
        int x = (w - size) / 2, y = (h - size) / 2;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);
        g.drawImage(backBuffer, x, y, size, size, null);
    }

    // This is the callback for all keys
    private void onKeyChanged(int keyCode, int state) {
        System.out.println(keyCode + " -> " + state);
        Context.changeKeypadState(keyMap.get(keyCode), state);
    }

    private class KeyAction extends AbstractAction {
        private final int keyCode;
        private final int state;

        KeyAction(int keyCode, int state) {
            this.keyCode = keyCode;
            this.state = state;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            onKeyChanged(keyCode, state);
        }
    }
}

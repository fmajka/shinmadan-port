package com.fmajka.compat.j2se.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
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

        // The keys you want to track
    private final int[] trackedKeys = {
        /* KeyEvent.VK_SHIFT, */ KeyEvent.VK_Z, KeyEvent.VK_X,
        KeyEvent.VK_UP, KeyEvent.VK_DOWN, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT
    };

    private final HashMap<Integer, Integer> keyMap = new HashMap<Integer, Integer>();

    public GamePanel() {
        setPreferredSize(new Dimension(240, 240));
        setFocusable(true);

        keyMap.put(KeyEvent.VK_Z, 20);
        keyMap.put(KeyEvent.VK_X, 21);
        keyMap.put(KeyEvent.VK_LEFT, 16);
        keyMap.put(KeyEvent.VK_UP, 17);
        keyMap.put(KeyEvent.VK_RIGHT, 18);
        keyMap.put(KeyEvent.VK_DOWN, 19);

        InputMap im = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getActionMap();

        for (int keyCode : trackedKeys) {
            String pressedAction = "pressed_" + keyCode;
            String releasedAction = "released_" + keyCode;

            // Pressed
            im.put(KeyStroke.getKeyStroke(keyCode, 0, false), pressedAction);
            am.put(pressedAction, new KeyAction(keyCode, 1));

            // Released
            im.put(KeyStroke.getKeyStroke(keyCode, 0, true), releasedAction);
            am.put(releasedAction, new KeyAction(keyCode, 0));
        }
    }

    // This is the callback for all keys
    private void onKeyChanged(int keyCode, int state) {
        // System.out.println("Key " + KeyEvent.getKeyText(keyCode) + " -> " + state);
        // TODO: store state of each key, calculate bitmask
        System.out.println("Key " + keyMap.get(keyCode) + " -> " + state);
        Context.processEvent(keyMap.get(keyCode), state);
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

package com.fmajka.compat;

import com.fmajka.compat.j2se.MediaSoundJ2SE;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.MediaImage;
import com.nttdocomo.ui.MediaSound;

import shinmadan.tohoSINMACanvas;

public class Context {
	static Graphics g;
    static MediaImageFactory mediaImageFactory;
    static tohoSINMACanvas canvas;
    static int keypadState = 0;

	public static void init(Graphics g, MediaImageFactory mediaImageFactory) {
		Context.g = g;
        Context.mediaImageFactory = mediaImageFactory;
	}

    public static void setCanvas(tohoSINMACanvas canvas) {
        Context.canvas = canvas;
    }

	public static Graphics getGraphics() {
		return g;
	}

    public static MediaImage getImage(String location) {
        String[] parts = location.split("///");
        String path = "assets/" + parts[parts.length - 1];
        return mediaImageFactory.getImage(path);
    }

    // TODO: properly implement
    public static MediaSound getSound(String location) {
        return new MediaSoundJ2SE(location);
    }

    public static int getKeypadState() {
        return keypadState;
    }

    public static void changeKeypadState(int keyCode, int state) {
        if(state == 1) {
            keypadState |= (1 << keyCode);
        } 
        else {
            keypadState &= ~(1 << keyCode);
        }
        // KEY_PRESSED_EVENT = 0, Value of pressed key
        // KEY_RELEASED_EVENT = 1, Value of released key
        canvas.processEvent(1 - state, keyCode);
    }
}

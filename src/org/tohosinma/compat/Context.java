package org.tohosinma.compat;

import org.tohosinma.compat.j2se.AudioPresenterJ2SE;
import org.tohosinma.decompiled.tohoSINMACanvas;

import com.nttdocomo.ui.AudioPresenter;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.MediaImage;
import com.nttdocomo.ui.MediaSound;

public class Context {
	static Graphics g;
    static MediaImageFactory mediaImageFactory;
    static MediaSoundFactory mediaSoundFactory;
    static tohoSINMACanvas canvas;
    static AudioPresenter audioPresenter;
    static int keypadState = 0;

	public static void init(Graphics g, MediaImageFactory mediaImageFactory, MediaSoundFactory mediaSoundFactory) {
		Context.g = g;
        Context.mediaImageFactory = mediaImageFactory;
        Context.mediaSoundFactory = mediaSoundFactory;
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

    public static MediaSound getSound(String location) {
        String[] parts = location.split("///");
        String[] fileParts = parts[parts.length - 1].split("\\.");
        fileParts[fileParts.length - 1] = "mid";
        String path = "assets/" + String.join(".", fileParts);
        return mediaSoundFactory.getSound(path);
    }

    public static AudioPresenter getAudioPresenter() {
        if(audioPresenter == null) {
            audioPresenter = new AudioPresenterJ2SE();
        }
        return audioPresenter;
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

    public static void terminate() {
        System.exit(0);
    }
}

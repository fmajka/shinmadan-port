package com.fmajka.compat;

import com.fmajka.compat.j2se.MediaSoundJ2SE;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.MediaImage;
import com.nttdocomo.ui.MediaSound;

public class Context {
	static Graphics g;
    static MediaImageFactory mediaImageFactory;

	public static void init(Graphics g, MediaImageFactory mediaImageFactory) {
		Context.g = g;
        Context.mediaImageFactory = mediaImageFactory;
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
}

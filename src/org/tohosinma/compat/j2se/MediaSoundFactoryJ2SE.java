package org.tohosinma.compat.j2se;

import org.tohosinma.compat.MediaSoundFactory;

import com.nttdocomo.ui.MediaSound;

public class MediaSoundFactoryJ2SE implements MediaSoundFactory {
    public MediaSound getSound(String location) {
        return new MediaSoundJ2SE(location);
    }
}
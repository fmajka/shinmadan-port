package com.fmajka.compat.j2se;

import com.nttdocomo.ui.MediaSound;
import com.fmajka.compat.MediaSoundFactory;

public class MediaSoundFactoryJ2SE implements MediaSoundFactory {
    public MediaSound getSound(String location) {
        return new MediaSoundJ2SE(location);
    }
}
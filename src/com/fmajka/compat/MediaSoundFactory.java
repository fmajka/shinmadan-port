package com.fmajka.compat;

import com.nttdocomo.ui.MediaSound;

public interface MediaSoundFactory {
    MediaSound getSound(String location);
}

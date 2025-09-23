package com.fmajka.compat.j2se;

import com.nttdocomo.ui.MediaImage;
import com.fmajka.compat.MediaImageFactory;

public class MediaImageFactoryJ2SE implements MediaImageFactory {
    public MediaImage getImage(String location) {
        return new MediaImageJ2SE(location);
    }
}
package org.tohosinma.compat.j2se;

import org.tohosinma.compat.MediaImageFactory;

import com.nttdocomo.ui.MediaImage;

public class MediaImageFactoryJ2SE implements MediaImageFactory {
    public MediaImage getImage(String location) {
        return new MediaImageJ2SE(location);
    }
}
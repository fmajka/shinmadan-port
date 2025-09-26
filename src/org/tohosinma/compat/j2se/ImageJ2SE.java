package org.tohosinma.compat.j2se;

import com.nttdocomo.ui.Image;

public class ImageJ2SE extends Image {
    ImageJ2SE(Object platformImage) {
        super(platformImage);
    }

    @Override
    public void dispose() {}
    
}

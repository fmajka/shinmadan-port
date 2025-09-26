package org.tohosinma.compat.j2se;

import javax.swing.ImageIcon;

import com.nttdocomo.ui.Image;
import com.nttdocomo.ui.MediaImage;

public class MediaImageJ2SE implements MediaImage {
    ImageIcon imageIcon;

    MediaImageJ2SE(String location) {
        System.out.println("MediaImageJ2SE location: " + location);
        imageIcon = new ImageIcon(location);
    }

    @Override
    public void use() {}

    @Override
    public Image getImage() {
        return new ImageJ2SE(imageIcon.getImage());
    }
    
}

package com.nttdocomo.ui;

public abstract class Image {
    public final Object platformImage;

    public Image(Object platformImage) {
        this.platformImage = platformImage;
    }

    /**
     *  Sets the alpha value of this image.
     * @param alpha - alpha value (0-255)
     */
    public void setAlpha(int alpha) {

    }

    // TODO: may need to do something with this
    public abstract void dispose();
}

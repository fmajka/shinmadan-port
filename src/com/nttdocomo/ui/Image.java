package com.nttdocomo.ui;

public abstract class Image {
    public final Object platformImage;
    public int alpha = 255;

    public Image(Object platformImage) {
        this.platformImage = platformImage;
    }

    /**
     *  Sets the alpha value of this image.
     * @param alpha - alpha value (0-255)
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getAlpha() {
        return alpha;
    }

    // TODO: may need to do something with this
    public abstract void dispose();
}

package com.fmajka.compat.j2se;

import java.awt.Graphics2D;

import com.nttdocomo.ui.Image;

public class GraphicsJ2SE extends com.nttdocomo.ui.Graphics {
    Graphics2D g;

    public GraphicsJ2SE(Graphics2D g) {
        this.g = g;
    }

    public void drawImage(Image image, int x, int y) {
        g.drawImage((java.awt.Image)image.platformImage, x, y, null);
    }
}

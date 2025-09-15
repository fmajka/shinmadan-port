package com.fmajka.compat.j2se;

import java.awt.Color;
import java.awt.Graphics2D;

import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.Image;

public class GraphicsJ2SE extends Graphics {
    Graphics2D g;

    public GraphicsJ2SE(Graphics2D g) {
        this.g = g;
    }

    public void drawImage(Image image, int x, int y) {
        g.drawImage((java.awt.Image)image.platformImage, x, y, null);
    }

    public void drawString(String text, int x, int y) {
        g.drawString(text, x, y);
    }

    public void fillRect(int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    public void setColor(int color) {
        g.setColor(new Color(color));
    }
}

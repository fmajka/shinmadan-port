package org.tohosinma.compat.j2se;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;

import org.tohosinma.compat.j2se.gui.GamePanel;

import com.nttdocomo.ui.Font;
import com.nttdocomo.ui.Graphics;
import com.nttdocomo.ui.Image;

public class GraphicsJ2SE extends Graphics {
    java.awt.Image backBuffer;
    Graphics2D g;
    Graphics2D frontBufferG;
    Graphics2D backBufferG;
    GamePanel panel;
    int lockCount = 0;

    public GraphicsJ2SE(GamePanel panel) {
        this.panel = panel;
        g = frontBufferG = (Graphics2D)panel.getGraphics();
        backBuffer = panel.createImage(panel.getWidth(), panel.getHeight());
        backBufferG = (Graphics2D)backBuffer.getGraphics();
        panel.backBuffer = backBuffer;
    }

    private void setAlpha(Image image) {
        this.g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, image.getAlpha() / 255.0f));
    }

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        g.drawArc(x, y, width, height, startAngle, arcAngle);
    }

    public void drawImage(Image image, int x, int y) {
        setAlpha(image);
        g.drawImage((java.awt.Image)image.platformImage, x, y, null);
    }

    public void drawImage(Image image, int dx, int dy, int sx, int sy, int width, int height) {
        setAlpha(image);
        g.drawImage((java.awt.Image)image.platformImage,
            dx, dy, dx + width, dy + height,
            sx, sy, sx + width, sy + height, 
            null
        );
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        g.drawPolyline(xPoints, yPoints, nPoints);
    }

    public void drawScaledImage(Image image, int dx, int dy, int width, int height, int sx, int sy, int swidth, int sheight) {
        setAlpha(image);
        g.drawImage((java.awt.Image)image.platformImage,
            dx, dy, dx + width, dy + height,
            sx, sy, sx + swidth, sy + sheight, 
            null
        );
    }

    public void drawString(String text, int x, int y) {
        g.drawString(text, x, y);
    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        g.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        g.fillPolygon(xPoints, yPoints, nPoints);
    }

    public void fillRect(int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    public void setColor(int color) {
        g.setColor(new Color(color, true));
    }

    public void setFont(Font font) {
        int type = font.getType(), size;
        switch (type) {
            case Font.SIZE_TINY:
                size = 10; break;
            case Font.SIZE_SMALL:
                size = 14; break;
            default:
                size = 12; break;
        }
        java.awt.Font f = new java.awt.Font("SansSerif", 0, size);
        g.setFont(f);
    }

    public void lock() {
        if(lockCount == 0) {
            g = backBufferG;
        }
        lockCount++;
    }

    public void unlock(boolean force) {
        lockCount = (force || lockCount == 0) ? 0 : lockCount - 1;
        if(lockCount == 0) {
            panel.repaint();
            g = frontBufferG;
        }
    }
}

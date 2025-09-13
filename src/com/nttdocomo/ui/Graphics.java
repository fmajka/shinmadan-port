package com.nttdocomo.ui;

// TODO: implement drawing to platform-specific Graphics
public class Graphics {

    static public int getColorOfRGB(int r, int g, int b) {
        return (r << 24) | (g << 16) | (b << 8);
    }

    static public int getColorOfRGB(int r, int g, int b, int a) {
        return (r << 24) | (g << 16) | (b << 8) | a;
    }

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

    }

    public void drawImage(Image image, int x, int y) {

    }

    public void drawImage(Image image, int dx, int dy, int sx, int sy, int width, int height) {

    }

    public void drawLine(int x1, int y1, int x2, int y2) {

    }

    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

    }

    public void drawScaledImage(Image image, int dx, int dy, int width, int height, int sx, int sy, int swidth, int sheight) {

    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

    }

    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
        
    }

    public void fillRect(int x, int y, int width, int height) {

    }

    public void lock() {

    }

    public void unlock(boolean force) {

    }

    public void setColor(int color) {

    }

    // TODO: there seems to be no documentation for this method
    public void setFont(Font font) {

    }

}

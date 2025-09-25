package com.nttdocomo.ui;

public class Font {
    public static final int SIZE_TINY = 0x70000400;
    public static final int SIZE_SMALL = 0x70000100;
    public static final int SIZE_MEDIUM = 0x70000200;
    public static final int SIZE_LARGE = 0x70000300;
    private int type;
    
    public static Font getFont(int type) {
        return new Font(type);
    }

    private Font(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}

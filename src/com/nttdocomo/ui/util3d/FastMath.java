package com.nttdocomo.ui.util3d;

public class FastMath {

    public static float atan2(float x, float y) {
        // System.out.println("atan2: " + (float)Math.atan2(y, x));
        return (float)(180.0 / Math.PI * Math.atan2(y, x));
    }
    
}

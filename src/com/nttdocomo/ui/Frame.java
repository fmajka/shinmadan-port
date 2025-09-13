package com.nttdocomo.ui;

public abstract class Frame {
    public static int SOFT_KEY_1 = 0;
    public static int SOFT_KEY_2 = 1;

    // public final int getWidth();
    // public final int getHeight();
    // public void setBackground(int c);

    /**
     * Sets the softkey label string. The label string you set will be displayed when this frame becomes the current frame. The position where the softkey label string is displayed is automatically set. When this frame is the current frame, If you change the label string using this method, the display will change immediately.
     * @param key Specify the number of the softkey for which you want to set the label string. Specify one of the following: SOFT_KEY_1, SOFT_KEY_2
     * @param label Specify the label string. If null is specified, the softkey label string will not be displayed. If an empty string ("") is specified, a label of the empty string ("") will be displayed. 
     * @throws IllegalArgumentException This error occurs when an invalid value is specified for the key argument. 
     */
    public void setSoftLabel(int key, String label) {

    }

    // [i-appli Option API]
    // public void setSoftLabelVisible(boolean b)  
}

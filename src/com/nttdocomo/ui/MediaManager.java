package com.nttdocomo.ui;

public class MediaManager {

    public static MediaSound getSound(String location) {
        // TODO: custom implementation of MediaSound
        return null;
    }

    // TODO: custom implementation of MediaImage
    public static MediaImage getImage(String location) {
        return new MediaImage() {
            @Override
            public void use() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public Image getImage() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getImage'");
            }
        };
    }
}

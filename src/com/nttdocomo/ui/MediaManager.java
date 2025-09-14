package com.nttdocomo.ui;

import com.fmajka.compat.Context;

public class MediaManager {

    public static MediaSound getSound(String location) {
        return Context.getSound(location);
    }
    
    public static MediaImage getImage(String location) {
        return Context.getImage(location);
    }
}

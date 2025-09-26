package com.nttdocomo.ui;

import org.tohosinma.compat.Context;

public class MediaManager {

    public static MediaSound getSound(String location) {
        return Context.getSound(location);
    }
    
    public static MediaImage getImage(String location) {
        return Context.getImage(location);
    }
}

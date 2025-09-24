package com.nttdocomo.ui;

import com.fmajka.compat.Context;

public class AudioPresenter implements MediaPresenter {

    public static AudioPresenter getAudioPresenter() {
        return Context.getAudioPresenter();
    }

    // listener = tohoSINMACanvas
    @Override
    public void setMediaListener(MediaListener listener) {

    }

    @Override
    public void setAttribute(int attrib, int value) {
        System.out.println("audioPresenter.setAttribute(" + attrib + ", " + value + ")");
    }

    @Override
    public void play() {
        System.out.println("audioPresenter.play()");
    }

    public void pause() {
        
    }

    public void restart() {

    }

    @Override
    public void stop() {
        System.out.println("audioPresenter.stop()");
    }
    
    public void setSound(MediaSound sound) {
        System.out.println("audioPresenter.setSound(" + sound + ")");
    }
}

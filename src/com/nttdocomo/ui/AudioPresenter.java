package com.nttdocomo.ui;

public class AudioPresenter implements MediaPresenter {

    public static AudioPresenter getAudioPresenter() {
        System.out.println("AudioPresenter.getAudioPresenter()");
        return new AudioPresenter();
    }

    // listener = tohoSINMACanvas
    @Override
    public void setMediaListener(MediaListener listener) {
        System.out.println("audioPresenter.setMediaListener(" + listener + ")");
    }

    @Override
    public void setAttribute(int attrib, int value) {
        System.out.println(
            "audioPresenter.setAttribute(attrib=" + attrib + ", value=" + value + ")"
        );
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

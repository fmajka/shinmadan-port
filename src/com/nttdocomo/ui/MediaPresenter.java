package com.nttdocomo.ui;

public interface MediaPresenter {
    void setMediaListener(MediaListener listener);
    void setAttribute(int attrib, int value);
    void play();
    void stop();
}

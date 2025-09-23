package com.nttdocomo.ui;

public interface MediaSound extends MediaResource {
    @Override
    public void use();
    Object getPlatformSound();
}

package org.tohosinma.compat.j2se;

import org.tohosinma.compat.Context;
import org.tohosinma.compat.j2se.gui.GameFrame;
import org.tohosinma.decompiled.tohoSINMA;

public class MainJ2SE {
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        Context.init(new GraphicsJ2SE(gameFrame.panel), new MediaImageFactoryJ2SE(), new MediaSoundFactoryJ2SE());

        tohoSINMA app = new tohoSINMA();
        Context.setCanvas(app.canvas);

        app.start();
    }
}

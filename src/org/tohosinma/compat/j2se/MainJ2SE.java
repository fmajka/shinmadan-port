package org.tohosinma.compat.j2se;

import org.tohosinma.compat.Context;
import org.tohosinma.compat.j2se.gui.GameFrame;
import org.tohosinma.decompiled.tohoSINMA;
import org.tohosinma.decompiled.tohokaiwa;
import org.tohosinma.localization.ConversationJP;
import org.tohosinma.localization.ConversationEN;

public class MainJ2SE {
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        Context.init(new GraphicsJ2SE(gameFrame.panel), new MediaImageFactoryJ2SE(), new MediaSoundFactoryJ2SE());

        tohokaiwa.conversation = new ConversationEN();
        tohoSINMA app = new tohoSINMA();
        Context.setCanvas(app.canvas);

        app.start();
    }
}

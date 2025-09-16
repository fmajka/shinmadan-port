import com.fmajka.compat.Context;
import com.fmajka.compat.j2se.GraphicsJ2SE;
import com.fmajka.compat.j2se.MediaImageFactoryJ2SE;
import com.fmajka.compat.j2se.gui.GameFrame;

import shinmadan.tohoSINMA;

public class LauncherPC {
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        Context.init(new GraphicsJ2SE(gameFrame.panel), new MediaImageFactoryJ2SE());

        tohoSINMA app = new tohoSINMA();
        Context.setCanvas(app.canvas);

        app.start();
    }
}

import java.awt.Graphics2D;

import com.fmajka.compat.Context;
import com.fmajka.compat.j2se.GraphicsJ2SE;
import com.fmajka.compat.j2se.MediaImageFactoryJ2SE;
import com.fmajka.compat.j2se.gui.GameFrame;

import shinmadan.tohoSINMA;

public class LauncherPC {
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        Graphics2D g = (Graphics2D)gameFrame.panel.getGraphics();
        Context.init(new GraphicsJ2SE(g), new MediaImageFactoryJ2SE());

        tohoSINMA app = new tohoSINMA();
        Context.setCanvas(app.canvas);

        app.start();
    }
}

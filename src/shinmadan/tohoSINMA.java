package shinmadan;

import com.nttdocomo.ui.Display;
import com.nttdocomo.ui.IApplication;

public class tohoSINMA extends IApplication {
   // Added so it is possible to inject events
   public tohoSINMACanvas canvas;

   public tohoSINMA() {
      canvas = new tohoSINMACanvas();
   }

   public void start() {
      Display.setCurrent(canvas);
      canvas.exe();
   }

   public void resume() {
      tohoSINMACanvas.saiflag = 1;
   }
}

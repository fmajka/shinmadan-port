import com.nttdocomo.ui.Display;
import com.nttdocomo.ui.IApplication;

public class tohoSINMA extends IApplication {
   public void start() {
      tohoSINMACanvas canvas = new tohoSINMACanvas();
      Display.setCurrent(canvas);
      canvas.exe();
   }

   public void resume() {
      tohoSINMACanvas.saiflag = 1;
   }
}

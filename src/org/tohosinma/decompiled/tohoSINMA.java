package org.tohosinma.decompiled;

import com.nttdocomo.ui.Display;
import com.nttdocomo.ui.IApplication;

public class tohoSINMA extends IApplication {
   // Added so it is possible to inject events
   public tohoSINMACanvas canvas;

   public tohoSINMA() {
      canvas = new tohoSINMACanvas();
      // Unlocks practice and extra stages
      for(int i = 0; i < 7; i++) {
         canvas.stageopen[i] = 1;
         canvas.stageopenH[i] = 1;
      }
   }

   public void start() {
      Display.setCurrent(canvas);
      canvas.exe();
   }

   public void resume() {
      tohoSINMACanvas.saiflag = 1;
   }
}

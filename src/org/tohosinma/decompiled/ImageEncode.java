package org.tohosinma.decompiled;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;

import com.nttdocomo.io.ConnectionException;
import com.nttdocomo.system.ImageStore;
import com.nttdocomo.system.InterruptedOperationException;
import com.nttdocomo.ui.EncodedImage;
import com.nttdocomo.ui.Image;
import com.nttdocomo.ui.ImageEncoder;
import com.nttdocomo.ui.MediaImage;
import com.nttdocomo.ui.MediaManager;

class ImageEncode {
//    Image image = null;
//    MediaImage mImage = null;
//    ImageStore store;

//    void setting(tohoSINMACanvas canvas) {
//       ImageEncoder imageEncoder = ImageEncoder.getEncoder("JPEG");
//       EncodedImage encodedImage = imageEncoder.encode(canvas, 0, 0, canvas.getWidth(), canvas.getHeight());
//       InputStream inputStream = encodedImage.getInputStream();

//       try {
//          OutputStream outputStream = Connector.openOutputStream("scratchpad:///0;pos=2000");
//          int read = inputStream.read();
//          outputStream.write((byte)read);

//          while (read >= 0) {
//             read = inputStream.read();
//             outputStream.write((byte)read);
//          }

//          inputStream.close();
//          outputStream.flush();
//          outputStream.close();
//       } catch (IOException exception) {
//          return;
//       }

//       this.mImage = MediaManager.getImage("scratchpad:///0;pos=2000");

//       try {
//          this.mImage.use();
//       } catch (ConnectionException exception) {
//          return;
//       }

//       this.image = this.mImage.getImage();

//       try {
//          this.store = ImageStore.selectEntry();
//          ImageStore.addEntry(this.mImage);
//       } catch (InterruptedOperationException exception) {
//       }
//    }
}

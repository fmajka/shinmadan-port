package com.nttdocomo.ui;

import org.tohosinma.compat.Context;

public abstract class Canvas extends Frame {
    // processIMEEvent Used as the type argument to the method. 
    public static int IMA_CANCELED = 1;
    public static int IME_COMMITTED = 0;

    /**
     * Gets a graphics object to draw on the canvas. The obtained graphics object is in its initial state.
     * [DoJa-1.0 only]
     * Whether a new object is generated each time the getGraphics method is called, or whether a pre-allocated object is reused, is device-dependent.
     * [DoJa-2.0 or later]
     * Each time you call the getGraphics method, a new object is created and returned. 
     * @return a graphics object for drawing on the canvas.
     */
    public Graphics getGraphics() {
        return Context.getGraphics();
    }

    /**
     * The graphics object passed as an argument must not be disposed of by the application programmer using the Graphics.dispose method. The caller of the paint method will call the dispose method to discard the object after performing any device-dependent processing. When the application programmer calls the dispose method, the behavior is device-dependent. 
     * @param g The Graphics object to use for drawing is passed.
     */
    public abstract void paint(Graphics g);

    // public void repaint();

    // public void repaint (int x, int y, int width, int height);

    /**
     * This method is called when a low-level event is notified. 
     * @param type - The type of event is passed.
     * @param param - The event parameters are passed. The meaning of the parameters varies depending on the event. For events that do not have parameters, 0 is passed.
     * if (type == 0) {
     *   (tohoSINMACanvas)this.keyEvent = param;
     * }
     */
    public void processEvent(int type, int param) {

    }

    /**
     * This method returns the keypad state.
     * Each bit position in the returned value corresponds to a key defined in the Display class. The correspondence between bits and keys is 1<<(key value defined in the Display class), The MSB corresponds to 31 and the LSB corresponds to 0. For example, the bit corresponding to KEY_0 is bit 0, The bit corresponding to KEY_1 is bit 1.
     * The bit corresponding to the pressed key is set to 1, The bits corresponding to keys that are not pressed are set to 0.
     * The application programmer can call this method during timer-driven processing, or Display.KEY_PRESSED_EVENT, Display.KEY_RELEASED_EVENTWhen an event occurs, call this method to get the state of multiple keys.
     * If you call this method, whether the canvas is visible or not, The current keypad state is returned as the return value.

     * [DoJa-3.0 (505iS) or later]
     * This method returns the same result as calling getKeypadState(0)
     * @return the keypad state
     */
    public int getKeypadState() {
        return Context.getKeypadState();
    }
}

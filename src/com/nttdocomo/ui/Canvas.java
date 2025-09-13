package com.nttdocomo.ui;

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
        return new Graphics();
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
}

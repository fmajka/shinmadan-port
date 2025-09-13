package javax.microedition.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Connector {

    // TODO: how do we handle scratchpad?
    public static DataInputStream openDataInputStream(String name) {
        return new DataInputStream(null);
    }

    public static DataOutputStream openDataOutputStream(String name) {
        return new DataOutputStream(null);
    }

}

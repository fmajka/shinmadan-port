package org.tohosinma.compat.j2se;

import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

import com.nttdocomo.ui.MediaSound;

public class MediaSoundJ2SE implements MediaSound {
    // Track number used for setting the soundtrack's loop start position
    int trackNum = -1;
    Sequence sequence;

    public MediaSoundJ2SE(String location) {
        try {
            System.out.println("Creating MIDI sequence from location: " + location);
            trackNum = Integer.parseInt(location.replaceAll("\\D+", ""));
            File midiFile = new File(location);
            sequence = MidiSystem.getSequence(midiFile);
        } catch(Exception e) {
            System.out.println("MediaSoundJ2SE: " + e.getMessage());
        }
    }

    @Override
    public void use() {

    }

    @Override
    public Object getPlatformSound() {
        return sequence;
    }
}

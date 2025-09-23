package com.fmajka.compat.j2se;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import com.nttdocomo.ui.AudioPresenter;
import com.nttdocomo.ui.MediaSound;

public class AudioPresenterJ2SE extends AudioPresenter {
    Sequence sequence;
    Sequencer sequencer;
    long pausePosition = 0;

    public AudioPresenterJ2SE() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
        } catch(Exception e) {
            System.out.println("AudioPresenterJ2SE: " + e.getMessage());
        }
    }

    @Override
    public void setAttribute(int attrib, int value) {
        // TODO: implement volume manipulation
        System.out.println(
            "audioPresenter.setAttribute(attrib=" + attrib + ", value=" + value + ")"
        );
    }

    @Override
    public void play() {
        sequencer.start();
    }

    public void pause() {
        pausePosition = sequencer.getTickPosition();
        sequencer.stop();
    }

    public void restart() {
        sequencer.setTickPosition(pausePosition);
        sequencer.start();
    }

    @Override
    public void stop() {
        sequencer.stop();
    }
    
    public void setSound(MediaSound sound) {
        sequence = (Sequence)sound.getPlatformSound();
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch(Exception e) {
            System.out.println("setSound: " + e.getMessage());
        }

    }
}

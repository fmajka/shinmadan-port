package org.tohosinma.compat.j2se;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Transmitter;

import com.nttdocomo.ui.AudioPresenter;
import com.nttdocomo.ui.MediaSound;

public class AudioPresenterJ2SE extends AudioPresenter {
    Sequence sequence;
    Sequencer sequencer;
    Synthesizer synthesizer;
    long pausePosition = 0;

    public AudioPresenterJ2SE() {
        try {
            sequencer = MidiSystem.getSequencer(false);
            sequencer.open();
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            Transmitter seqTransmitter = sequencer.getTransmitter();
            Receiver synthReceiver = synthesizer.getReceiver();
            seqTransmitter.setReceiver(synthReceiver);
        } catch(Exception e) {
            System.out.println("AudioPresenterJ2SE: " + e.getMessage());
        }
    }

    @Override
    public void setAttribute(int attrib, int value) {
        if(attrib == 4) {
            setVolume(value);
        }
        else {
            System.out.println("AudioPresenterJ2SE.setAttribute(" + attrib + ", " + value + ")");
        }
    }

    private void setVolume(int volume) {
        volume = Math.max(0, Math.min(100, volume));
        volume = (int)(volume * 1.27 / 1.0);
        try {
            MidiChannel[] channels = synthesizer.getChannels();
            for (MidiChannel channel : channels) {
                if(channel == null) { continue; }
                channel.controlChange(7, volume); // 7 = volume controller
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void play() {
        sequencer.start();
    }

    @Override
    public void pause() {
        pausePosition = sequencer.getTickPosition();
        sequencer.stop();
    }

    @Override
    public void restart() {
        sequencer.setTickPosition(pausePosition);
        sequencer.start();
    }

    @Override
    public void stop() {
        sequencer.stop();
    }
    
    @Override
    public void setSound(MediaSound sound) {
        // Get loop offset (hardcoded for every track...)
        MediaSoundJ2SE soundJ2SE = (MediaSoundJ2SE)sound;
        long beatOffset;
        switch (soundJ2SE.trackNum) {
            case 0:
                beatOffset = 10; break;
            case 1:
                beatOffset = 8; break;
            case 2:
                beatOffset = 4; break;
            case 3:
                beatOffset = 20; break;
            case 4:
                beatOffset = 16; break;
            case 5:
                beatOffset = 4; break;
            case 6:
                beatOffset = 16; break;
            case 7:
                beatOffset = 64; break;
            case 8:
                beatOffset = 24; break;
            case 9:
                beatOffset = 64; break;
            case 10:
                beatOffset = 8; break;
            case 11:
                beatOffset = 20; break;
            case 12:
                beatOffset = 4; break;
            case 13:
                beatOffset = 24; break;
            case 14:
                beatOffset = 4; break;
            case 15:
                beatOffset = 4; break;
            case 16:
                beatOffset = 8; break;
            case 17:
                beatOffset = 4; break;
            default:
                beatOffset = 0; break;
        }
        // Set and play the sound
        sequence = (Sequence)sound.getPlatformSound();
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopStartPoint(sequence.getResolution() * beatOffset);
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch(Exception e) {
            System.out.println("setSound: " + e.getMessage());
        }
    }
}

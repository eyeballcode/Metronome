package com.edward.metronome;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.net.URL;

/**
 * Created by edward on 26/10/14.
 */
public class TickPlayer implements Ticker {

    private int ticked = 0;

    @Override
    public int timesCalled() {
        return ticked;
    }

    @Override
    public void tick() {
        ticked++;
        try {
            java.awt.Toolkit.getDefaultToolkit().beep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

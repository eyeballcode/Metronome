package com.edward.metronome.impl;

import java.awt.Toolkit;

/**
 * Created by kyeung on 26/10/14.
 */
public class Beeper implements Ticker {
    private int ticked = 0;

    @Override
    public int timesCalled() {
        return ticked;
    }

    @Override
    public void tick() {
        ++ticked;
        Toolkit.getDefaultToolkit().beep();
    }
}

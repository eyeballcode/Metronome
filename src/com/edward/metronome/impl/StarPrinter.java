package com.edward.metronome.impl;

/**
 * Created by edward on 26/10/14.
 */
public class StarPrinter implements Ticker {

    private int ticked = 0;

    @Override
    public int timesCalled() {
        return ticked;
    }

    @Override
    public void tick() {
        ticked++;
        System.out.print("* ");
    }
}

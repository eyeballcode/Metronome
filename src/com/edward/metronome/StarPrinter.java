package com.edward.metronome;

/**
 * Created by edward on 26/10/14.
 */
public class StarPrinter {

    private int ticked = 0;

    public int timesCalled() {
        return ticked;
    }

    public void tick() {
        ticked++;
        System.out.print("* ");
    }
}

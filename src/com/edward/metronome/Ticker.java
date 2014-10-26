package com.edward.metronome;

/**
 * Created by edward on 26/10/14.
 */
public interface Ticker {
    int timesCalled();

    void tick();
}

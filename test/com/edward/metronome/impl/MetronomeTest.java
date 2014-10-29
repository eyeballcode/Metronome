package com.edward.metronome.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by edward on 22/10/14.
 */
public class MetronomeTest {

    @Test
    public void metronome_calls_action_listener_20_times_in_10s_if_120_bpm() throws Exception {
        TickPlayer starPrinter = new TickPlayer();
        Metronome m = new Metronome(120, starPrinter);

        m.start();
        Thread.sleep(10000);
        m.stop();

        assertEquals("Did not call star printer 20 times in 10 seconds", 20, starPrinter.timesCalled());
    }

    @Test
    public void metronome_beeps_20_times_in_10s_if_120_bpm() throws Exception {
        Beeper beeper = new Beeper();
        Metronome m = new Metronome(120, beeper);

        m.start();
        Thread.sleep(10000);
        m.stop();

        assertEquals("Did not beep 20 times in 10 seconds", 20, beeper.timesCalled());
    }
}

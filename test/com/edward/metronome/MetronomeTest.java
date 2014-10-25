package com.edward.metronome;

import static org.junit.Assert.assertEquals;

/**
 * Created by edward on 22/10/14.
 */
public class MetronomeTest {
    public void ticks_2_times_in_1s_if_120_bpm() throws Exception {
        Metronome m = new Metronome(120);
        m.startMetronome();

        m.start();
        Thread.sleep(1000);
        m.stopMetronome();

        assertEquals("Did not tick 2 times in 1 second", 2, m.ticked());
    }
    public static void main(String args []) throws Exception {
        new MetronomeTest().ticks_2_times_in_1s_if_120_bpm();
    }
}

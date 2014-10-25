package com.edward.metronome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by edward on 22/10/14.
 */
public class MetronomeTest {
    @Test
    public void ticks_20_times_in_10s_if_120_bpm() throws Exception {
        Metronome m = new Metronome(120);

        m.startMetronome();
        Thread.sleep(10000);
        m.stopMetronome();

        assertEquals("Did not tick 20 times in 10 seconds", 20, m.ticked());
    }
}

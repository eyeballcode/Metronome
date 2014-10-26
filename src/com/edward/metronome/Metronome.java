package com.edward.metronome;

import com.edward.metronome.impl.Beeper;

public class Metronome {

    public static void main(String[] args) {
        checkArgs(args);

        new com.edward.metronome.impl.Metronome(getBpm(args), new Beeper()).start();

        try {
            Thread.sleep(1000 * getSleepSeconds(args));
            System.exit(0);
        } catch (InterruptedException e) {
            System.exit(100);
        }
    }

    private static int getSleepSeconds(String[] args) {
        int seconds = 0;
        try {
            seconds = Integer.parseInt(args[1]);
            if (seconds <= 0) {
                System.err.println("how_long_to_run_for_in_second cannot be smaller than or equal to 0");
                System.exit(5);
            }
        } catch (NumberFormatException nfe) {
            System.err.println("how_long_to_run_for_in_second must be an integer");
            System.exit(4);
        }
        return seconds;
    }

    private static int getBpm(String[] args) {
        int bpm = 0;
        try {
            bpm = Integer.parseInt(args[0]);
            if (bpm <= 0) {
                System.err.println("bpm cannot be smaller than or equal to 0");
                System.exit(3);
            }
        } catch (NumberFormatException nfe) {
            System.err.println("bpm must be an integer");
            System.exit(2);
        }
        return bpm;
    }

    private static void checkArgs(String[] args) {
        if (args.length != 2) {
            System.err.println("usage: java com.edward.metronome.Metronome bpm how_long_to_run_for_in_second");
            System.exit(1);
        }
    }
}

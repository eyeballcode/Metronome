package com.edward.metronome;

public class Metronome implements Runnable {
    private boolean shouldContinue = true;
    private int bpm = 0;
    private StarPrinter sp;

    public Metronome(int bpm, StarPrinter starPrinter) {
        this.bpm = bpm;
        sp = starPrinter;
    }

    public void start() {
        shouldContinue = true;
        new Thread(this).start();
    }

    public void stop() {
        shouldContinue = false;
    }

    @Override
    public void run() {
        while (shouldContinue) {
            sp.tick();
            try {
                Thread.sleep(msBetweenBeats());
            } catch (InterruptedException e) {
            }
        }
    }

    private int msBetweenBeats() {
        return (int) ((60.0 / bpm) * 1000);
    }
}

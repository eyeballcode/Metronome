package com.edward.metronome;

public class Metronome implements Runnable {
    private boolean shouldContinue = true;
    private int bpm = 0;
    private Ticker ticker;

    public Metronome(int bpm, Ticker ticker) {
        this.bpm = bpm;
        this.ticker = ticker;
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
            ticker.tick();
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

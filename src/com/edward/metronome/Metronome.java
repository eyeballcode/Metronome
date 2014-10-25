package com.edward.metronome;

public class Metronome extends Thread {
    private int ticked = 0;
    private boolean shouldContinue = true;
    private int bpm = 0;

    public Metronome(int bpm) {
        this.bpm = bpm;
    }

    public void startMetronome() {
        ticked = 0;
        shouldContinue = true;
        new Thread(this).start();
    }

    public void stopMetronome() {
        shouldContinue = false;
    }

    public int ticked() {
        return ticked;
    }

    @Override
    public void run() {
        while (shouldContinue) {
            ticked++;
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

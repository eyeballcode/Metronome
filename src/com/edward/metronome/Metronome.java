package com.edward.metronome;

public class Metronome extends Thread  {
    private int bpm = 0;
    static int ticked = 0;
    static boolean shouldContinue = true;

    public void startMetronome() {
        ticked = 0;
        shouldContinue = true;
        new Thread(this).run();
        return;
    }

    public Metronome(int bpm) {
        this.bpm = bpm;
    }



    public int ticked() {
        return ticked;
    }

    private int msBetweenBeats() {
        return 60/bpm * 1000;
    }

    public void stopMetronome() {
        shouldContinue = false;
    }

    @Override
    public void run() {
        while (shouldContinue == true) try {
            this.sleep(msBetweenBeats());
            ticked++;
        } catch (InterruptedException e) {
        }
    }
}

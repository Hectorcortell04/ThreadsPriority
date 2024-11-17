package com.hectorcortell04;

import java.io.IOException;

public class TicTacPrinter implements Runnable {
    private String word;

    public TicTacPrinter(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(word);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

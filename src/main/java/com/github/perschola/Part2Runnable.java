package com.github.perschola;

public class Part2Runnable implements Runnable {
    public void run() {
        // TODO
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
        }
    }
}

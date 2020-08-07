package com.github.perschola;

public class Part1Runnable implements Runnable {
    public void run() {
        // TODO
        for (int i = 1; i <= 4; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
        }
    }
}

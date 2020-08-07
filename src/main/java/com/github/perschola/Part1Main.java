package com.github.perschola;

public class Part1Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Part1Runnable(), "Ghassan");
        Thread thread2 = new Thread(new Part1Runnable(), "Omar");

        thread1.start();
        thread2.start();
    }
}

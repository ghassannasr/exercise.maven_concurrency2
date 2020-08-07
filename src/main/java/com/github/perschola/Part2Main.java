package com.github.perschola;

public class Part2Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Part2Runnable(), "Ghassan");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(new Part2Runnable(), "Omar");
        Thread thread3 = new Thread(new Part2Runnable(), "Maram");
        thread2.start();
        thread3.start();
    }
}
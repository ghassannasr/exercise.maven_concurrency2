package com.github.perschola;

public class Part4Runnable implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("running thread name is: " + Thread.currentThread().getName());
            System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
            System.out.println("=======================================");
        }
    }
}

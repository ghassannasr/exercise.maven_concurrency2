package com.github.perschola;

public class Part4Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Part4Runnable(), "Ghassan");
        thread1.setPriority(Thread.MIN_PRIORITY);
        Thread thread2 = new Thread(new Part4Runnable(), "Omar");
        thread2.setPriority(Thread.NORM_PRIORITY);
        Thread thread3 = new Thread(new Part4Runnable(), "Maram");
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

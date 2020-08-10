package com.github.perschola;


import java.util.Date;

public class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message message) {
        this.msg = message;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        synchronized (msg) {
            System.out.println("Thread " + threadName + " waiting to get notified at time " + new Date().getTime());
            try {
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " waiter thread got notified at time " + new Date().getTime());
            System.out.println(threadName + " processed: " + msg.getMessage());
        }
    }
}

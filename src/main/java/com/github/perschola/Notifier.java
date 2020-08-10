package com.github.perschola;

public class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message message) {
        this.msg = message;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread " + threadName + " started.");
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (msg) {
            msg.setMessage(threadName + " Notifier word done.");
            msg.notifyAll();
        }
    }
}

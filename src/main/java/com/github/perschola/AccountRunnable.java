package com.github.perschola;

import javax.sound.midi.Soundbank;

public class AccountRunnable implements Runnable {

    @Override
    public void run() {
        Account account = new Account();

            for (int i=0; i < 5; i++)  {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Account.class) {
                    String name = Thread.currentThread().getName();
                    if (account.getBalance() >= 10) {
                        System.out.println(name + " is going to withdraw.");
                        account.withdraw(10D);
                        System.out.println(name + " completes the withdrawal.");
                    }
                    else {
                        System.out.println("Not enough in the account for " + name + " to withdraw.");
                    }
                }
        }
    }
}

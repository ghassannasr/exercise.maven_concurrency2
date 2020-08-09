package com.github.perschola;

public class AccountTest {
    public static void main(String[] args) {
        Thread Ranjeet = new Thread(new AccountRunnable(), "Ranjeet");
        Thread Reema = new Thread(new AccountRunnable(), "Reema");
        Ranjeet.start();
        Reema.start();
    }
}

package com.github.perschola;

public class AccountRunnable implements Runnable {

    @Override
    public void run() {
        Account account = new Account();
        while(account.getBalance() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is withdrawing $10.");
            account.withdraw(10D);
            System.out.println("The remaining is balance is: " + account.getBalance());
        }
    }
}

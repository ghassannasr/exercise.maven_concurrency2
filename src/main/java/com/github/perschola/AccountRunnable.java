package com.github.perschola;

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
                    if (account.getBalance() >= 10) {
                        System.out.println(Thread.currentThread().getName() + " is withdrawing $10.");
                        account.withdraw(10D);
                        System.out.println("The remaining balance is: " + account.getBalance());

                    }
                }
        }
    }
}

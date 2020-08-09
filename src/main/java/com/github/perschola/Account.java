package com.github.perschola;

public class Account {
    private static Double balance;

    public Account() {
        balance = 50D;
    }

    public void withdraw(Double withdrawalAmount) {
        balance -= withdrawalAmount;
    }

    public Double getBalance() {
        return balance;
    }
}

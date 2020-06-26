package org.jabingp.state;

public abstract class AccountState {
    protected Account acc;
    protected double balance;

    public void deposit(double amount) {
        System.out.printf("%s存款%f\n", this.acc.getOwner(), amount);
        this.balance += amount;
    };

    public void withdraw(double amount) {
        System.out.printf("%s取款%f\n", this.acc.getOwner(), amount);
        this.balance -= amount;
    }

    public void showBalance() {
        System.out.printf("现在余额为%f\n", this.balance);
    }

    public abstract void showState();

    public abstract void stateCheck();
}
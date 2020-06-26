package org.jabingp.state;

public class Account {
    private AccountState state;
    private String owner;

    public Account(String owner, double init) {
        System.out.printf("%s开户，初始金额为%f\n", owner, init);
        this.owner = owner;

        if (init >= 0) {
            this.state = new GreenState(init, this);
        } else {
            System.out.printf("开户金额%f不符合要求（>=0）\n", init);
        }
        System.out.printf("------------------------------\n");
    }

    public String getOwner() {
        return this.owner;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        this.state.deposit(amount);
        this.state.stateCheck();
        this.showInfo();
        System.out.printf("------------------------------\n");
    }

    public void withdraw(double amount) {
        this.state.withdraw(amount);
        this.state.stateCheck();
        this.showInfo();
        System.out.printf("------------------------------\n");
    }

    public void showInfo() {
        this.state.showBalance();
        this.state.showState();
    }

}
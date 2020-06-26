package org.jabingp.state;

public class RedState extends AccountState {

    public RedState(AccountState state) {
        this.balance = state.balance;
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        System.out.printf("账户%s处于红色状态，无法存钱\n", this.acc.getOwner());
    }

    @Override
    public void withdraw(double amount) {
        System.out.printf("账户%s处于红色状态，无法取钱\n", this.acc.getOwner());
    }

    @Override
    public void stateCheck() {
        if (this.balance < 0 && this.balance >= -1000) {
            this.acc.setState(new YellowState(this));
        } else if (this.balance < -1000) {
            this.acc.setState(new RedState(this));
        }
    }

    @Override
    public void showState() {
        System.out.printf("现在账户状态为RedState\n");
    }

}
package org.jabingp.state;

public class GreenState extends AccountState {
    public GreenState(double balance, Account acc) {
        this.balance = balance;
        this.acc = acc;
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
        System.out.printf("现在账户状态为GreenState\n");
    }

}
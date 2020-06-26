package org.jabingp.state;

public class YellowState extends AccountState {
    public YellowState(AccountState state) {
        this.acc = state.acc;
        this.balance = state.balance;
    }

    @Override
    public void stateCheck() {
        if (this.balance >= 0) {
            this.acc.setState(new GreenState(this.balance, this.acc));
        } else if (this.balance < -1000) {
            this.acc.setState(new RedState(this));
        }
    }

    @Override
    public void showState() {
        System.out.printf("现在账户状态为YelloState\n");
    }

}
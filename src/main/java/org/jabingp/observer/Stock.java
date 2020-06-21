package org.jabingp.observer;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Investor> investors;
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.investors = new ArrayList<Investor>();
    }

    public void attach(Investor investor) {
        this.investors.add(investor);
    }

    public void detach(Investor investor) {
        this.investors.remove(investor);
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setPrice(double price) {
        Double changeRate = Math.abs(price - this.price) / this.price;
        this.price = price;
        if (changeRate >= 0.05) {
            this.notifyInvestor();
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void notifyInvestor() {
        this.investors.forEach(inv -> {
            inv.response(this);
        });
    }
}
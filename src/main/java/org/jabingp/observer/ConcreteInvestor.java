package org.jabingp.observer;

public class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void response(Stock stock) {
        System.out.println(String.format("提示股民：%s ------ 股票：%s 波动幅度超过5%% ------ 新价格是：%f。", this.name,
                stock.getStockName(), stock.getPrice()));
    }
}
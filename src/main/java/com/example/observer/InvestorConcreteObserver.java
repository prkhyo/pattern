package com.example.observer;

// ConcreteObserver 클래스: 투자자
public class InvestorConcreteObserver implements InvestorObserver {

    private String name;

    public InvestorConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, float stockPrice) {
        System.out.println(name + "님, " + stockSymbol + " 주식의 새로운 가격: $" + stockPrice);
    }

    @Override
    public String toString() {
        return name;
    }

}

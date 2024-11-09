package com.example.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject 클래스: 주식 데이터
public class StockConcreteSubject implements StockSubject{
    private List<InvestorObserver> observers;
    private String stockSymbol;
    private float stockPrice;

    public StockConcreteSubject(String stockSymbol) {
        this.stockSymbol = stockSymbol;
        this.observers = new ArrayList<>();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }


    // 주식 가격 변경 시 옵저버들에게 알림
    public void setStockPrice(float price) {
        this.stockPrice = price;
        notifyObservers();
    }

    public float getStockPrice() {
        return stockPrice;
    }


    @Override
    public void addObserver(InvestorObserver observer) {
        observers.add(observer);
        System.out.println(observer + "님이 " + stockSymbol + " 주식 구독을 시작했습니다.");
    }

    @Override
    public void removeObserver(InvestorObserver observer) {
        observers.remove(observer);
        System.out.println(observer + "님이 " + stockSymbol + " 주식 구독을 취소했습니다.");
    }

    @Override
    public void notifyObservers() {
        for (InvestorObserver observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }
}

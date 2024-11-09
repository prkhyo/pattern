package com.example.observer;

// Subject 인터페이스: 주식 데이터 (주체)
public interface StockSubject {
    void addObserver(InvestorObserver observer);
    void removeObserver(InvestorObserver observer);
    void notifyObservers();

}

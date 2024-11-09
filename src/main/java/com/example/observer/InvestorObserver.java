package com.example.observer;

// Observer 인터페이스: 투자자(옵저버)
public interface InvestorObserver {
    void update(String stockSymbol, float stockPrice);
}

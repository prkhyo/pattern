package com.example.observer;

public class StockMarketApplication {

    public static void main(String[] args) {

        // 주식 데이터 생성
        StockConcreteSubject googleStock = new StockConcreteSubject("GOOGL");

        // 투자자 생성 및 등록
        InvestorConcreteObserver investor1 = new InvestorConcreteObserver("김철수");
        InvestorConcreteObserver investor2 = new InvestorConcreteObserver("이영희");

        // 구독
        googleStock.addObserver(investor1);
        googleStock.addObserver(investor2);

        // 주식 가격 갱신 - 구독자들에게 알림이 전달
        googleStock.setStockPrice(1340.75f);
        googleStock.setStockPrice(1365.50f);

        // 특정 투자자 구독 취소
        googleStock.removeObserver(investor2);

        // 주식 가격 갱신 - 구독을 유지하고 있는 투자자들에게만 알림이 전달
        googleStock.setStockPrice(1320.00f);
    }
}

package com.example.memento;

import java.util.Stack;

// Caretaker 객체: 메멘토를 관리하며 저장/복구 기능 제공
class CareTaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    // 상태 저장 (메멘토 객체를 받아 히스토리 관리를 위한 스택에 저장)
    public void saveState(Memento memento) {
        mementoStack.push(memento);
        System.out.println("[CareTaker] 상태 저장");
    }

    // 상태 복구 (가장 최근에 저장된 메멘토 객체 반환)
    public Memento undo() {
        if (!mementoStack.isEmpty()) {
            System.out.println("[CareTaker] 이전 상태로 복구...");
            return mementoStack.pop();
        }
        System.out.println("[CareTaker] 복구할 상태 데이터 없음");
        return null;
    }
}

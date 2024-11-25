package com.example.memento;

// Memento 객체: 캐릭터의 상태를 저장
class Memento {
    private final int health;
    private final int mana;
    private final int experience;

    public Memento(int health, int mana, int experience) {
        this.health = health;
        this.mana = mana;
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getExperience() {
        return experience;
    }
}

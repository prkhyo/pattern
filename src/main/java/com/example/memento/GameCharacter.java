package com.example.memento;

// Originator 객체:  현재 시점의 캐릭터의 상태를 관리하고 저장/복구를 제공
class GameCharacter {
    private int health;
    private int mana;
    private int experience;

    public GameCharacter(int health, int mana, int experience) {
        this.health = health;
        this.mana = mana;
        this.experience = experience;
    }

    // 상태 저장
    public Memento saveState() {
        System.out.println("[Originator] (메멘토 객채에) 캐릭터 상태 저장...");
        return new Memento(health, mana, experience);
    }

    // 상태 복구
    public void restoreState(Memento memento) {
            this.health = memento.getHealth();
            this.mana = memento.getMana();
            this.experience = memento.getExperience();
            System.out.println("[Originator] (메멘토 객체로부터) 캐릭터 상태 복원: " + this);
    }

    // 캐릭터 상태 업데이트 (게임 내 활동으로 인한 상태 변화)
    public void updateState(int healthChange, int manaChange, int experienceGain) {
        this.health += healthChange;
        this.mana += manaChange;
        this.experience += experienceGain;
        System.out.println("[Originator] 캐릭터 상태 업데이트: " + this);
    }

    @Override
    public String toString() {
        return "GameCharacter [Health=" + health + ", Mana=" + mana + ", Experience=" + experience + "]";
    }

}

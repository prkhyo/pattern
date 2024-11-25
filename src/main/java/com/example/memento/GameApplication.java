package com.example.memento;

// 게임 캐릭터 상태 관리 애플리케이션
public class GameApplication {

    public static void main(String[] args) {
        // 캐릭터 초기 상태 설정
        GameCharacter character = new GameCharacter(100, 50, 0);
        System.out.println("초기 캐릭터 상태: " + character);

        // Caretaker 생성
        CareTaker caretaker = new CareTaker();

        // 첫 번째 상태 저장
        caretaker.saveState(character.saveState());

        // 상태 변경 (예: 전투 또는 아이템 사용)
        character.updateState(-20, -10, 15); // 체력 -20, 마나 -10, 경험치 +15

        // 두 번째 상태 저장
        caretaker.saveState(character.saveState());

        // 추가 상태 변경
        character.updateState(-50, -30, 20); // 체력 -50, 마나 -30, 경험치 +20

        // 복구: 가장 최근 상태로 되돌리기
        character.restoreState(caretaker.undo());

        // 복구: 초기 상태로 되돌리기
        character.restoreState(caretaker.undo());
    }

}

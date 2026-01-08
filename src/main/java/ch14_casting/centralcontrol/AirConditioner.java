package ch14_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨의 전원을 끕니다.");
    }

    // 고유 메서드 정의(downcasting을 위해서)
    public void changedMode() {
        System.out.println("에어컨 모드를ㅇ나ㅓㄹㅇ");
    }
}

package ch14_casting.centralcontrol;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }

    public void changedColor() {
        System.out.println("색깔 모드를ㅇ나ㅓㄹㅇ");
    }
}




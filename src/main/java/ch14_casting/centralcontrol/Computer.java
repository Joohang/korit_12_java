package ch14_casting.centralcontrol;

public class Computer implements Power {
    @Override
    public void on() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터를 끕니다.");
    }

    public void changedMonitor() {
        System.out.println("컴퓨터 모드를ㅇ나ㅓㄹㅇ");
    }
}
// AirConditioner / LED / Mouse 클래스를 만들어서 Power interface를 각각 기기에 맞게 구현하시오.
// CentralControl 클래스 하나 만들어두세요
// CentralControlMain

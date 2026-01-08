package ch13_abstraction.interfaces;

public class AcPower extends AirConditionerButton{
    boolean power;
    @Override
    public void onPressed() {
        if (power) {
            power = false;
            System.out.println("전원을 끕니다.");
        } else {
            power = !power;
            System.out.println("전원을 켭니다.");
        }
    }
}

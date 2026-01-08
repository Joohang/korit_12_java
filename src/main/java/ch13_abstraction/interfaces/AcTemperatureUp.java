package ch13_abstraction.interfaces;

public class AcTemperatureUp extends AirConditionerButton{
    @Override
    public void onPressed() {

        System.out.println("온도를 한 칸 올립니다.");
    }

    @Override
    public void pressed() {

        System.out.println("온도를 계속 올립니다.");
    }
}

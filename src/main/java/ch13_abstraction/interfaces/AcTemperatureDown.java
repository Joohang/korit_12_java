package ch13_abstraction.interfaces;

public class AcTemperatureDown extends AirConditionerButton{
    @Override
    public void onPressed() {

        System.out.println("온도를 한 칸 내립니다.");
    }

    @Override
    public void pressed() {

        System.out.println("온도를 계속 내립니다.");
    }
}

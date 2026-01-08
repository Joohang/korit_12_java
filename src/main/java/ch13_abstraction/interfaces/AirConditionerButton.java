package ch13_abstraction.interfaces;

public class AirConditionerButton {
    public void onPressed() {
        System.out.println("온도를 ");
    }

    public void modChange() {}
    public void pressed() {
        System.out.println("온도를");
    }
}

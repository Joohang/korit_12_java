package ch13_abstraction.interfaces;

public class AcMain {
    public static void main(String[] args) {
        AirConditionerController airConditionerController = new AirConditionerController(
                new AcPower(), new AcTemperatureUp(), new AcTemperatureDown(), new AcModChange()
        );

        airConditionerController.onPressAcPowerButton();
        airConditionerController.onPressAcTempDownButton();
        airConditionerController.pressedAcTempDownButton();
        airConditionerController.onPressAcTempUpButton();
        airConditionerController.pressedAcTempUpButton();
        airConditionerController.acModChangeButton();
        airConditionerController.acModChangeButton();
        airConditionerController.onPressAcPowerButton();
    }
}

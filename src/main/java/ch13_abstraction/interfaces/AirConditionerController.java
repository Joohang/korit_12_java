package ch13_abstraction.interfaces;
/*
    PowerButton 포함시킬 것
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한 번 누를 때 마다 모드가 변환되어야겠네요
        냉방 <-> 난방
        : Press 버튼을 활용하여 한 번 누르면 그 다음 모드로 이동해야 함.
        (PowerButton의 로직을 활용하여 메서드 작성하시면 됩니다)

    AllArgsConstructor를 정의하고,

    실행 예
    에어컨 리모컨 객체가 생성되었습니다
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다
    온도를 계속 올립니다
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    private AcPower acPower ;
    private AcTemperatureUp acTemperatureUp;
    private AcTemperatureDown acTemperatureDown;
    private AcModChange acModChange;

    public AirConditionerController(AcPower acPower, AcTemperatureUp acTemperatureUp, AcTemperatureDown acTemperatureDown, AcModChange acModChange) {
        this.acPower = acPower;
        this.acTemperatureUp = acTemperatureUp;
        this.acTemperatureDown = acTemperatureDown;
        this.acModChange = acModChange;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void onPressAcPowerButton () {
        acPower.onPressed();
    }
    public void onPressAcTempDownButton() {
        acTemperatureDown.onPressed();
    }
    public void pressedAcTempDownButton() {
        acTemperatureDown.pressed();
    }
    public void onPressAcTempUpButton() {
        acTemperatureUp.onPressed();
    }
    public void pressedAcTempUpButton( ) {
        acTemperatureUp.pressed();
    }
    public void acModChangeButton() {
        acModChange.onPressed();
    }
}

package ch13_abstraction.interfaces;

public class AcModChange extends AirConditionerButton{
    boolean modChange ;

    @Override
    public void onPressed() {

        if (modChange) {
            modChange = false;
            System.out.println("난방으로 바뀝니다.");
        } else {
            modChange = !modChange;
            System.out.println("냉방으로 바뀝니다.");
        }
    }
}

package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();
        // 이하의 코드는 비어있는 배열을 CentralControl 클래스의 field인 deviceArray에 집어넣었네요.
        CentralControl centralControl1 = new CentralControl(new Power[10]);
        // 이하의 코드는 powers 배열을 만든 다음에 내부에 Power의 하위 클래스들의 객체를 집어넣었습니다.
        Power[] powers = {new AirConditioner(), new Computer(), new Mouse(), new LED()}; // 여기서 이루어졌습니다.

        /*
            근데 저희는 여기서 각 전자기기들의 객체를 생성하고 여기서 집어넣는 것까지 전체 다 실험할 예정이기 때문에
            powers를 직접 쓰지는 않을거고, Power가 interface이기 때문에 객체 생성이 안되는데 배열을 만들 수 있는가를
            검증하기 위해 코드를 남겨두겠습니다.


         */
//        centralControl1.deviceArray   에 접근하는 것이 불가능합니다. 접근 제어자가 private이기 때문에
        // 그렇다면 centralControl1.deviceArray에 Power의 하위 클래스인 AirConditioner 등의 객체를 집어넣기 위해서는
        // public method를 경유해야할 것 같습니다. -> CentralControl 클래스에 public method를 정의해야만 하겠다.

        centralControl1.addDevice(airConditioner1); // 여기서 업캐스팅이 이루어졌습니다.
        centralControl1.addDevice(computer1);
        centralControl1.addDevice(mouse1);
        centralControl1.addDevice(led1);
        centralControl1.addDevice(led1);
        centralControl1.addDevice(led1);

        centralControl1.powerOn();
        centralControl1.powerOff();

        centralControl1.showInfo();
        centralControl1.performSpecificMethod();


        System.out.println("------------------------------------------------------");

        centralControl1.addDevice(printer1);
        centralControl1.addDevice(speaker1);

        centralControl1.powerOn();
        centralControl1.powerOff();

        centralControl1.showInfo();
        centralControl1.performSpecificMethod();
        System.out.println("------------------------------------------------------");
        centralControl1.deleteDevice1("ㄴㅇㄹ");


        centralControl1.deleteDevice4();
        centralControl1.deleteDevice5();





    }
}
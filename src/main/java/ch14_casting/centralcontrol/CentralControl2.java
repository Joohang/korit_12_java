package ch14_casting.centralcontrol;

import java.util.Scanner;

public class CentralControl2 {
    private Power[] deviceArray;

    public CentralControl2(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }


    public void addDevice(Power device) {

        int emptyIndex = checkEmpty();
//
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");

    }

    // 비어있는 인덱스를 굳이 외부로 노출할 필요가 없기 때문에
    private int checkEmpty() {
        for ( int i = 0 ; i < deviceArray.length ; i++ ) {
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }




    public void powerOn() {

        for ( int i = 0 ; i  < deviceArray.length ; i++ ) {
            if (deviceArray[i] ==null){
                System.out.println("장치가 없어 실행하지 못했습니다.");
                continue;  // return; 으로 마무리 했을때와의 콘솔 상에서의 차이점을 확인하면 더 명확해집니다.

            }
            deviceArray[i].on();
        }



    }
    public void powerOff () {
        for (Power device : deviceArray) {
            if (device == null) {
                System.out.println("장치가 없어 전원을 끌 수 없습니다.");
                continue;  // return; 으로 마무리 했을때와의 콘솔 상에서의 차이점을 확인하면 더 명확해집니다.
            }
            device.off();
        }
    }


    public void showInfo() {
        for (int i = 0 ; i < deviceArray.length ; i ++) {
            if (deviceArray[i] == null) {
                System.out.println("슬롯 [" + (i + 1) + "] 번 :" + "Empty");
                continue;
            }
            System.out.println( "슬롯 [" + (i + 1) + "] 번 :" + deviceArray[i].getClass().getSimpleName());
        }

    }
    public void showInfo1() {

    }


    public void performSpecificMethod() {
        for (Power device : deviceArray ) {
            if (device instanceof AirConditioner) {
                AirConditioner airConditioner = (AirConditioner) device;
                airConditioner.changedMode();
            } else if (device instanceof Computer) {
                //컴퓨터로 다운캐스팅 명시적으로 해줘야 하고.
                Computer computer = (Computer) device;
                // 컴퓨터의 고유 메서드를 실행하면 되겠네요.
                computer.changedMonitor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changedColor();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device ==null) {
                System.out.println("연결되지 않습니다.");
            } else {
                System.out.println("아직 지원되지 않는 기기입니다.");
            }

        }
    }
    public void deleteDevice1 (int delete) {

        delete = delete - 1 ;
        if (delete < 0 || delete >= deviceArray.length) {
            System.out.println("잘못된 번호 입력");

        }
        else if (deviceArray[delete] == null ) {
            System.out.println("이미 삭제된 기기번호");
        } else {
            String name = deviceArray[delete].getClass().getSimpleName();
            deviceArray[delete] = null;
            System.out.println(name + "가 삭제되었습니다.");
        }

    }
    public void deleteDevice1 (String delete) {
        boolean found = false;
        for (int i = 0 ; i<deviceArray.length ; i++) {
            if(deviceArray[i] == null) {
                continue;
            }
            String name = deviceArray[i].getClass().getSimpleName();
            if (name.equals(delete)) {
                deviceArray[i] = null;
                System.out.println(name + "기기를 삭제했습니다.");

                break;
            }



        }
        if (!found) {
            System.out.println("잘못된 기기명입니다.");
        }
    }
    public String deleteDevice2 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삭제할 기기의 이름을 입력하세요 >>>> ");
        String delete = scanner.next();
        return delete;
    }
    public int deleteDevice3 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삭제할 기기의 숫자를 입력하세요 >>>> ");
        int delete = scanner.nextInt();
        return delete;
    }

    public void deleteDevice4() {
        String delete = deleteDevice2();
        boolean found = false;
        for (int i = 0 ; i<deviceArray.length ; i++) {
            if(deviceArray[i] == null) {
                continue;
            }
            String name = deviceArray[i].getClass().getSimpleName();
            if (name.equals(delete)) {
                deviceArray[i] = null;
                System.out.println(name + "기기를 삭제했습니다.");

                break;
            }



        }
        if (!found) {
            System.out.println("잘못된 기기명입니다.");
        } else System.out.println(delete + " 가 삭제되었습니다.");

        showInfo();
    }

    public void deleteDevice5 () {
        int delete = deleteDevice3();
        delete = delete - 1 ;
        if (delete < 0 || delete >= deviceArray.length) {
            System.out.println("잘못된 번호 입력");

        }
        else if (deviceArray[delete] == null ) {
            System.out.println("이미 삭제된 기기번호");
        } else {
            String name = deviceArray[delete].getClass().getSimpleName();
            deviceArray[delete] = null;
            System.out.println(name + "가 삭제되었습니다.");
        }

        showInfo();
    }
    public void deleteDevice6 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("기기의 번호나 이름을 입력하세요");
        if (scanner.hasNextInt()) {

        }
    }
}

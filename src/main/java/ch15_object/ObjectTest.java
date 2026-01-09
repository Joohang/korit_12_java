package ch15_object;

public class ObjectTest {
    //field 선언
    private String name;
    private String address;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름 :" + name + "\n주소" + address );
    }

    @Override
    public String toString() {
        return "이름 :" + name + "\n주소" + address ;
    }
}

/*
    ObjectTestMain 클래스에
    object1 객체를 기본 생성자를 통해 생성하고 이름에 김일 / 주서에 부산광역시 연제구를 입력
    showInfo()를 호출하시오
 */

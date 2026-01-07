package ch13_abstraction.abstract_classes;

public class PhoneFactory extends Factory{

    // 무조건 자식 클래스에 맞게 재정의를 '강제'한다.
    @Override
    public void produce(String model) {
        System.out.println("모바일폰 공장 : " + this.getName() + "에서 [ " + model + " ]을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("모바일 폰 공장을 관리합니다.");
    }
}

package ch13_abstraction.abstract_classes;

public abstract class Factory {
    // field 선언
    private String name;

    // 추상 메서드 정의
    public abstract void produce(String model);
    public abstract void manage();

    // Getter / Setter 정의
    public String getName() {
        System.out.println("현재 공장은 " + name + " 공장으로 변경되었습니다.");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 고유 메서드 정의
    public void showInfo() {
        System.out.println("공장의 정보를 출력합니다. \n공장이름 : " + name);
    }
}

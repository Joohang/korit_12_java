package ch18_generic.wildcard;

public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 뜁니다.");
    }

    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }

}

/*
    Tiger 클래스에 가서 Animal 상속 받고,
    호랑이가 네발로 뜁니다. 라고 구현
    hunt() 메서드 정의
    호랑이가 사냥을 합니다 라고 출력할 수 있도록 작성

    Car 클래스는  Animal상속을 받지 말고
    mov(_) 클래스를 통해 차가 움직입니다 라고 정의
    break()
    차가 멈춥니다
 */
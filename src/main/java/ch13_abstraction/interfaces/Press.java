package ch13_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface이기 때문에 변수 앞에 뭐 귿이 접근 제어자 명시할 필요 x
        final 키워드로 적을 필요가 없습니다.
        하지만 기본적으로 public final이 생량되어있습니다.
        그래서 String 얖에 final을 적더라도 Intellij 상에서 불필요하다고
        안내가 나옵니다,

        이하는 안되는 예시들.
     */
//    int age;  // 객체마다 다른 값을 적용하기 위한 field선언 불가능 초기화가 필수 -> 상수라서
//    public press(){} //생성자 정의 불가능 -> 객체 생성이 불가능하겠네요.
//    void popOut() {)
//        System.out.println("일반 메서드 정의");
//    }  // 인터페이스 상에서는 추상 메서드만 가능합니다. 추상 메서드가 뭐다? 메서드 본문이 없는 메서드.
    // 나머지 로직은 서브 클래스에서 '구현'해야 했습니다.

    // 되는 예시
    void onPressed();       // 이거 call1() ~ call4() 중에 무슨 유형이고 그 근거는 무엇일까요?

    /*
        Up interface를 생성하고  onUp() 이라는 추상메서드를 정의 하시오 -> call1()
        Down interface 생성하고  onDown() 이라는 추상메서드를 정의 하시오 -> call1()
     */
}

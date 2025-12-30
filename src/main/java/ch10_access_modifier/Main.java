package ch10_access_modifier;
// 이하의 클래스는 default가 생략되어 있겠네요.
class AccessModifierExample { // 간판 클래스는 public이 명시돼야 함.
    // field 선언                 -필드긴 한데, 선언 및 초기화하겠습니다. 처음보는 예시입니다.
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privatedVar = 40 ;

    public int getPrivatedVar() {
        return privatedVar;
    }
    // 생성자 선언

    // setter / getter etc

    // 해당 클래스의 고유 methods
}


public class Main {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
//        System.out.println(example.privatedVar); private 접근 제어자이기때문에 오류 발생합니다. field 직접 조회 불가능
        System.out.println(example.getPrivatedVar());

    }
}

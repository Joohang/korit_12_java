package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);
        // 아까 전에는 myCar 객체를 생성하고 그 다음에 빨강이라는 값을 color에
        // 대입했습니다.
        // 근데 잘 생각해보면 아니 만들면서 곧장 color는 빨강이라고 지정할 수 없는건가
        // 에 해당하는겁니다.
        // Car myCar = new Car("빨강");
        Constructor constructor3 = new Constructor(3);
        System.out.println(constructor3.num);
        Constructor constructor4 = new Constructor("김사");
        // name은 field / title 은 parameter / "김사"는 argument
        // 근데 field를 name으로 잡았을 때, 매개변수를  ㅜ믇dmfh wkqdkqjflaus
        // this.name = name; 형태로 작성될겁니다.
        System.out.println(constructor4.name);
        Constructor constructor5 = new Constructor(5, "김오") ;
        System.out.println(constructor5.num);
        System.out.println(constructor5.name);
        constructor5.displayInfo();
    }
}


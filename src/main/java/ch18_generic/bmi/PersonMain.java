package ch18_generic.bmi;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("김일" , 166, 70);
        Bmi bmi1 = new Bmi();
        bmi1.printResult(person);

        // 이상과 같이 작성했을 때 멀쩡하게 동작합니다.

        // 근데 밑에 예시를 보겠습니다.
//        Dog dog1 = new Dog("강아지", 52, 12);
//        bmi1.printResult(dog1);
        // 이상의 두 줄은 현재 오류가 생깁니다. 이를 해결하기 위한 방법으로 printResult() 메서드를 method overload하는
        // 법이 있겠네요.
    }
}

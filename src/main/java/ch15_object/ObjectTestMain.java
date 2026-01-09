package ch15_object;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest object1 = new ObjectTest();
        object1.setName("김일");
        object1.setAddress("부산광역시 연제구");
        ObjectTest object2 = new ObjectTest("김이","서울특별시 종로구");
        object1.showInfo();
        object2.showInfo();
        System.out.println(object1);
        System.out.println("-----------");
        System.out.println(object1);
        System.out.println("-------(equals)--------");

        String example = "안녕하세요";

        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);    // true

        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2);    // true
        System.out.println(result3);    // true

        ObjectTest test1 = new ObjectTest("안녕하세요", "안녕");
        boolean result4 = "안녕하세요" == test1.getName();
        System.out.println(result4);    // true
        boolean result5 = strArray[0] == test1.getName();
        boolean result6 = example == test1.getName();
        System.out.println(result5);    // true
        System.out.println(result6);    // true

        String example2 = new String("안녕하세요");  //객체를 만든다는 것은 주소값을 설정한다는 것!!!!(Java의 대원칙)
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);    //false
        String example3 = new String(example);
        boolean result8 = example3 == example;
        System.out.println(result8);    //false

        boolean result71 = "안녕하세요".equals(example2);
        System.out.println(result71);
        boolean result81 = example3.equals(example);
        System.out.println(result81);
    }
}

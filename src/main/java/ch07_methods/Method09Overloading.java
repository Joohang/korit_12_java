package ch07_methods;

import java.util.Scanner;

/*
    method overloading
        매개변수의 유무 및 자료형의 차이, 개수의 차이를 나눠서
        동일한 매서드 명을 지닌 매서드'들'을 정의할 수 있다.

        즉, 매서드 명은 동일하고, 매개변수에 들어가는 자료형, 개수를
        달리하게 되면 서로 다른 메서드로 인지하게 됩니다.

        예를 들어서 숫자끼리 더하는 메서드가 있다고 가정하겠습니다.
        걔를 add()라고 정했다고 칩시다.
        public int add(int a, int b) {
            return a + b;
        }

        근데 문자열끼리 더하는게 필요해서 add는 못 쓰니까 connect를 씁시다.
        public String connect(String a, String b) {
            return a + b;
        }

        근데 뒤집어서 연결해야 할 때가 있어서
        public String connect(String a, String b) {
            return b + a;
        }

        근데 정수 더하기 실수 해야해서
        public String connect(int a, double b) {
            return a + b;
        }

        이런 부분이 문제가 됩니다.

        method overloading의 장점 :
            동일한 기능을 하는 매서드를 정의할 때 매서드 명이 필요한데,
            예를 들어 String 자료형끼리 연결해주는 메서드와
            int 끼리의 합 연산을 하는 메서드를 나눈다고 가정했을 때.
            add,
            plus,
            connect 등을 정의했다면,
            다음 합 연산을 하는 (예를 들어 double 자료형을 지니는) 메서드 명을 정하려고
            하면 번거롭습니다.
            이러한 부분을
            public void add(String example1, String example2) {
                로직
            }
            public void add(int example1, int example2) {
                로직
            }
            public void add(double example1, double example2) {
                로직
            }
            과 같이 자료형을 달리 하는 '동일한 이름을 가지는 메서드들'을 정의하거나,
            public void add(double example1, double example2, double example3) {
                로직
            }
            와 같은 식으로 매개변수의 개수의 차이를 두더라도 '동일한 기능을 하는
            서로 다른 메서드'들로 인식하게끔 하는 방식입니다.

            그러면 메서드 명들도 동일하고, 걔네가 뭐 매개변수 유형이나 개수가 차이가 있겠지만
            기능도 같으니까 머리가 안아프다는 장점이 있다고 할 수 있습니다.


 */
public class Method09Overloading {
    // call1() 유형으로 정의
    public void add(){
        System.out.println("add()");
    }
    //  overloading 적용
    // call2() 유형 # 1
    public void add(String s) {
        System.out.println("add(String s");
        System.out.println(s + "$");
    }

    // call2() 유형 # 2
    public  void add (int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println(a + b);
    }

    // call2() 유형 # 3
    public  void  add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s+ " / " +a);
    }
    // 이하의 코드는  overloading에서 매개변수의 자료형이 아니라 return 타입도
    // 바꿔서 작성했습니다.

    public String add (String s1, String s2) {
      String result = s1 + s2;
      return result;
    }

    public static void main(String[] args) {
        //객체 생성
        Method09Overloading method1 = new Method09Overloading();
        //method 호출
        method1.add();
        method1.add("안녕하세요");
        method1.add(2, 3);
        method1.add("배고프다" , 3);
        System.out.println(method1.add("햄버거가 ","먹고싶다."));
    }
}

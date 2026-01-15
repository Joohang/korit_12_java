package ch21_exception;

import java.util.List;
import java.util.Scanner;

/*
    예외(Exception)란?
        : 개발자가 예측할 수 있고, 그에 대한 대비를 할 수 있는 것들을 예외라고
            정의
    오류(Error)란 ?
        : 개발자가 예측할 수 있지만 해결할 수 없거나 / 예측 불가능한 것을 오류
            라고 정의하는 편

    그러면 모든 자료형이 클래스 형태로 정의되는 Java의 특성 상 자주 일어나는
    예외 클래스들을 이미 개발자들이 정의를 해놓았습니다.
 */
public class Exception1 {
    public static void main(String[] args) {
//        int[] ints = new int[5];
//        ints[5] = 3;
//        int a = 10;     //  피제수 / 나누어지는 수
//        int b = 0;      //  제수 / 나누는 수
//        double result = a / b;
//        System.out.println(result);
//        int c = 0.123;
//        System.out.println(c);
        /*
            고전적 형태의 예외 처리 방식 -> if 문 사용
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("나누어지는 정수를 입력하세요 >>>> ");
//        int a = scanner.nextInt();
//        System.out.println("\n 나누는 수를 입력하세요 >>> ");
//        int b = scanner.nextInt();
        // 그러면 개발자가 나누는 수를 0으로 입력할 것을 예상할 수 있기 때문에

//        int result =  a / b;
//        System.out.println(result);
        // 즉 이상의 코드는 아까 확인한 예외와 관련된 클래스를 사용하지 않는 예시
        // 라고 할 수 있습니다.
        /*
            예외 처리를 적용한 방식의 코드 try / catch / finally
         */
        int a = 10;
        int b = 0;
        try {
            int result = a / b ;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
        } finally {
            System.out.println("예는 예외가 발생하건 말건 끝에 실행됩니다.");
        }
        /*
            왜 예외 처리를 하는가?
                : 멘토 파이썬에서 봤었는데 프로그램을 실행시킬 때 시뻘겋게 되어있으면 기분이
                나쁘기 때문에 예외 처리를 해야함. 이라고 적혀있었습니다.

                    : 프로그램이 정상 종료됨을 보증하기 위하여.
         */
        List<Integer> nums= List.of(1,2,3,4,5);
        System.out.println(nums);

        try {
            System.out.println(nums.get(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {            // catch 문은 나열할 수 있습니다.
            System.out.println(e.getMessage());
        } catch (Exception e) {             // 예외도 서로 상속 처리가 되는데 거의
                                            // 가장 상위의 예외 관련 클래스에 해당합니다.
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("프로그램이 정상 종료되었습니다.");
        }


        // try / catch / finally 를 사용하여 e.getMessage()를 출력
        // finally 파트 "프로그램 정상 종료"
    }
}
/*
    이상의 코드 라인에서 중요한 점은 catch문이 복수로 나올 수 있다는 점.
    근데 예를 들어 catch()를 사용할 때 순서를 고려할 필요가 있습니다.
    leapYear 관련할 때 가장 촘촘한 조건을 앞에 위치시킨 것처럼요.
 */

package ch05_condition;

import java.util.Scanner;

/*
    조건문
    1. if 문 : if 다음에 있는 () 내의 조건식이 true일 때 {} 내의 실행문이 실행됨.
        false면 실행 x

    형식 :
    if(조건식) {   조건식 : true / false로 결론이 날 수 있는 식 또는 문장
        실행문
    }
 */
public class Condition01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;

        // 조건문 적용
        // 실행되는 예시
        if (num1 > 0) {
            System.out.println("num1은 양수입니다.");
        }

        if (num1 > 15)
        {
            System.out.println("num1은 15 초과입니다.");
        }

        // 이상을 봤을 때 변수에 값이 대입되는 순간 이미 19 번 라인의 조건식이나 23 번 조건식의 true / false
        // 가 결정나는 것으로 보여 굳이 이런 코드가 필요할까, 즉 23 번 조건식은 없어도 되지 않나 싶을 수 있습니다.

        System.out.println("정수를 입력하세요 >>> ");
        Scanner scanner = new Scanner(System.in);

        int num2 = scanner.nextInt();

        if (num2 > 0) {
            System.out.println("num2은 양수입니다.");
        }

        if (num2 > 15)
        {
            System.out.println("num2은 15 초과입니다.");
        }
        // Condition02

    }
}
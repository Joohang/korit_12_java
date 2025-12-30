package ch06_loops;
/*
    중첩 for문도 가능합니다
    for ( int i =0 ; i < 100 ; i++) {
        반복실행문1-a
        for (int j = 0 ; j < 100 ; j ++ ) {
            반복실행문2
        }
        반복실행문 1-b
    }

    for 문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
    다 하면 구구단  for문으로 출력하시오
 */

import java.util.Scanner;

public class Loop06NestdeFor {
    public static void main(String[] args) {

//        for (int i = 1 ; i < 6 ; i++) {
//            for (int j = 1; j < 4; j++) {
//                System.out.println(i + "일차"  + j + "교시 입니다." );
//            }
//            System.out.println();
//        }

        /*
         1 2 3 4 5 .... 10
         11...20
         91...100
         */

//        for (int i=1 ; i<101 ; i++) {
//            System.out.println(i + "");    //  반복실행문 1-a
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
//        // 풀이법 # 2 : 10 번 반복
//        for ( int j = 1; j < 101 ; j+=10) {
//            System.out.println(j + "" +);
//        }

        /*
        숫자를 입력 받아서 홀수만 더하는 반복문 for 반복문을 작성하시오
        다 했으면 짝수만 구하는 for 반복문을 작성하시오.
         */

        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("1부터 몇 까지 더하시겠습니까? >>>> ");
        num1 = scanner.nextInt();
        int sumEven = 0;    // 짝수의 합을 저장할 변수
        int sumOdd = 0;     // 홀수의 합을 저장할 변수
        for (int i=1 ; i < (num1+1) ; i++ ) {
            if (i %2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("1부터"+num1+"까지 중 홀수의 합은"+sumOdd + "입니다.");
        System.out.println("1부터"+num1+"까지 중 짝의 합은"+sumEven + "입니다.");
    }
}

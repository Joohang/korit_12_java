package ch11_arrays;
/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5    -> 이거 이후에 배열이 생성됨
    1 번 학생의 이름을 등록하세요 >>> 김일
    2 번 학생의 이름을 등록하세요 >>> 김이
    3 번 학생의 이름을 등록하세요 >>> 김삼
    4 번 학생의 이름을 등록하세요 >>> 김사
    5 번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력할 수 있도록 할겁니다
    1 번 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 점수를 입력하세요 >>> 4.4
    3 번 학생의 점수를 입력하세요 >>> 4.3
    4 번 학생의 점수를 입력하세요 >>> 4.2
    5 번 학생의 점수를 입력하세요 >>> 4.1

    학생들의 점수 총합은 21.5점입니다.
 */

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // 사용할 class 선언
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("몇 명의 학생을 등록하시겠습니까?? >>>");
        // humans 와  scores의 배열 element 개수를 받는 변수 선언 및 초기화
//        int count = scanner.nextInt();
        // 빈 배열들을 선언
//        scanner.nextLine();   // 배리어 역할을 하는 scanner.nextLin();
//
//        String[] humans = new String[count];
//        double[] score = new double[count];
//      // humans의 element 값을 채우기 위한 반복문 작성
//        for (int i = 0; i < humans.length; i ++) {
//            System.out.println((i+1) + "번 학생의 이름을 등록하세요 >>>");
//            humans[i] = scanner.nextLine();
//        }
//
//        for (int i = 0 ; i < humans.length; i ++) {
//            System.out.println((i + 1) + "번 학생의 점수를 등록하세요 >>>");
//            score[i] = scanner.nextDouble();
//        }

        // 이상에서 값을 입력하고 그 걸 그대로 double sum 변수에 더했을 확률이 높습니다.

        // 별개로 해보겠습니다.
//        double total = 0;
//        for (int i = 0 ; i < score.length; i++) {
//            total += score[i];
//        }
//        System.out.println("총 점은 "+ total + "입니다.");
        Array03Method array03Method = new Array03Method();
        array03Method.writNameAndScore();
    }
}

package ch07_methods;

import java.util.Scanner;

public class Method04ScoreCalc2 {

    // method 정의 영역 - 이전의 메서드 03에서 정의한 방식은 하나의 메서드에 총합을 구하는 메서드와
    // 평균을 구하는 메서드가 합쳐져 있었습니다.

    // 이번 단계에서는 1. 합을 구하는 메서드 / 2. 평균을 구하는 메서드를 작성하고
    // 평균을 구하는 메서드 내에서 합을 구하는 메서드를 호출하는 방식으로 작성할겁니다.

    //그리고 메서드 호출 영역에는 '평균을 구하는 메서드'만 호출할겁니다.

    // 1. 합을 구하는 메서드
//    public static int calcSum(int[] score) {
//        int total = 0;
//        for (int i = 0 ; i < score.length ; i ++) {
//            total += score[i];
//        }
//        return total;
//    }

    // 2. 평균을 구하는 메서드
//    public static double calcAvg(int total, int subOfNum) {
//        // 여기서 스캐너로 과목 수를 입력 받습니다.
////        Scanner scanner = new Scanner(System.in);
////        int numOfSubs = scanner.nextInt();
////        double sum = calcSum(); // 그리고 합 구할 때 여기에 argument로 과목 수를 보내줘야 합니다. -> 그러면 정의 영역도 수정해야함
////        // 그리고 return으로 나온 합을 가지고 sum / 과목수를 해서 평균을 구하면 답이 나올 것 같습니다.
////        System.out.println(sum/numOfSubs);
//        return (double) total / subOfNum;
//    }
    //chat gpt
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("과목 수를 입력하세요 : ");
//        int subOfNum = scanner.nextInt();
//
//        int [] scores = new int[subOfNum];
//        for (int i = 0 ; i < subOfNum; i++) {
//            System.out.println((i+1) + "번째 과목 점수 입력 >>");
//            scores[i] = scanner.nextInt();
//        }
//
//        int sum = calcSum(scores);
//        double average = calcAvg(sum, subOfNum );
//
//        System.out.println("점수 총합 : " + sum + ", 점수 평균 : " + average);
//
//        scanner.close();
//
//
//    }

    // 1. 합을 구하는 메서드
    public static int getTotal(int currentTotal, int score) {
        return currentTotal + score;
    }
    // 2. 평균을 구하는 메서드
    public static double getAverage(int total, int subCount) {
        return (double) total/subCount;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("과목 수를 입력하세요 >>>> ");
        int subCount = scanner.nextInt();

        int total = 0;
        for (int j = 0 ; j < subCount ; j++) {
            System.out.print((j+1)+ "번째 과목 점수 입력 : ");
            int score = scanner.nextInt();
            total = getTotal(total, score);
        }
        double average = getAverage(total, subCount);

        System.out.println("점수 총합 : " + total + ", 점수 평균 : " + average);
    }
}

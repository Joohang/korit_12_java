package ch11_arrays;
/*
    int[] scores =
 */

import java.util.Arrays;

public class Array06 {
    private double  calcSum(int[] scores) {

        int sum = 0;
        sum = Arrays.stream(scores).sum();
        return sum;
    }
    private double calcAvg(int[] scores) {
        double avg = 0;
        avg = Arrays.stream(scores).average().getAsDouble();
        return avg;

    }
    public void printSumAndAvg(int[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }

    // method overloading을 통해서 int[] 배열만 받는게 아니라 double[]배열을 받더라도 연산을 할 수 있도록 준비

    public static void main(String[] args) {
        int[] scores = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        int sum = 0;
        double avg = 0;
        for (int i = 0 ; i < scores.length ; i ++) {
            sum += scores[i];
        }
        avg=((double)sum/ scores.length ) ; // sum이 int인 상황에서는 소수점이 나오지 않을 것 같습니다.
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");


        Array06 array06 = new Array06();
        array06.printSumAndAvg(scores);

    }
}

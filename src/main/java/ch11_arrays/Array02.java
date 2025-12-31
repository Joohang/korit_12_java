package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록하시겠습니까?? >>>");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] humans = new String[count];
        double[] score = new double[count];

        for (int i = 0; i < humans.length; i ++) {
            System.out.println((i+1) + "번 학생의 이름을 등록하세요 >>>");
            humans[i] = scanner.nextLine();
        }

        for (int i = 0 ; i < humans.length; i ++) {
            System.out.println((i + 1) + "번 학생의 점수를 등록하세요 >>>");
            score[i] = scanner.nextDouble();
        }
        double total = 0;
        for (int i = 0 ; i < score.length; i++) {
            total += score[i];
        }
        System.out.println("총 점은 "+ total + "입니다.");
    }
}

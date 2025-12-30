package ch06_loops;
/*
 Scanner




    실행 예
    몇 줄의 별을 생성하시겠습니까 >>> 3
 */

import java.util.Scanner;

public class Loop08Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("몇 줄의 별을 생성하시겠습니까? >>>>>>");
        int star = scanner.nextInt();
        for (int i = 0 ; i < star; i++) {
            for (int j= star ; j > i ; j --) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

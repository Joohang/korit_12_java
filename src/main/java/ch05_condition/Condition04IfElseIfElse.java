package ch05_condition;

import java.util.Scanner;

/*
    if - else if - else 문
    형식 :
    if(조건식1) {
        실행문1
    } else if(조건식2) {
        실행문2
    } else if(조건식3) {
        실행문3
    } else {
        실행문4
    }
 */
public class Condition04IfElseIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Condition05Task
        int point;
        final int VIP_POINT = 100;
        final int GOLD_POINT = 80;
        final int SILVER_POINT = 60;
        final int BRONZE_POINT = 40;

        System.out.print("포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        String userGrade = "";
        if (point > VIP_POINT) {
            userGrade = "VIP";
        } else if (point > GOLD_POINT) {
            userGrade = "GOLD";
        } else if (point > SILVER_POINT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade = "BRONZE";
        } else {
            userGrade = "GENERAL";
        }
        System.out.println("회원 등급 : " + userGrade);     //
    }
}
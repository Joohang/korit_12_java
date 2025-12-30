package ch05_condition;

import java.util.Scanner;

public class Condition05Task {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 59점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            이름을 입력하세요 >>> 김일
            김일 학생의 점수는 68점이고, 학점은 D입니다.
         */
        // 입력 받아, 라는 표현 때문에 Scanner 사용해야한다는 점을 알아차리면 좋겠습니다.
        Scanner scanner = new Scanner(System.in);
        // 그리고 제가 위에 score / grade를 굳이 영어로 적어둔 이유는 얘네를 변수명으로 쓰면 되기 때문입니다.
        int score = 0;
        String grade = "F";
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        // 배리어가 필요하겠네요.
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();

        // 조건문 시작
        if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        }

        System.out.println(name + " 학생의 점수는 " + score +"점이고, 학점은 " + grade + "입니다.");


    }
}
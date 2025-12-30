package ch05_condition;

import java.util.Scanner;

/*
    Condition05Task에서 고민해봐야 할 사항이 있습니다.
    예를 들어서 129038점 입력하면 A가 나오긴 하겠네요.
    즉 100 초과 / 0 미만의 점수가 입력됐을 때 A / F라는 결과값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고
    안내를 하려면 어떻게 할 수 있을까요?
    100 초과 / 0 미만의 점수에 대해 grade를 x라고 가정하겠습니다.

    문제를 푸시오(단, 선수학습을 하신 분들의 경우 중첩 if문을 사용하지 않겠습니다)
 */
public class Condition06Task02 {
    public static void main(String[] args) {
        // 이상의 과제에서의 중점은 기본적으로 '순서'입니다.
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "F";
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else if (score > 100) {
            grade = "x";
        }

        System.out.println(name + " 학생의 점수는 " + score +"점이고, 학점은 " + grade + "입니다.");

        // 이상과 같이 기존 코드의 맨 뒤에 else if로 100 초과를 달게 되더라도
        // 여전히 grade = "A" 대입이 일어납니다.
        // 그렇다면 알 수 있는 점은 코드가 '순서대로' 대입이 일어난다는 점입니다.
        // 그래서 789 입력하게 되면 첫 번째 조건문에서 score > 89 가 true가 되기 때문에
        // grade = "A"; 대입하고 조건문을 탈출하게 됩니다.
        // 그래서 다수의 개발자 분들은 보통 안되는걸 걸러내는 조건을 먼저 작성해두는 편입니다.

        if ( score > 100 ) {
            grade = "X";
        } else if ( score < 0 ) {
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        }

        // 와 같이 쓸 수 있는 우리가 어제 논리 연산자를 배웠습니다.

        if ( score > 100 || score < 0 ) {
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        }

        // Condition07NestedIf
    }
}
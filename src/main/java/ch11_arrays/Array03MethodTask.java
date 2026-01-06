package ch11_arrays;
//inputNum() 메서드를 정의해서 배열의 한계값들을 입력 받는 메서드를 구현하고
//inputNames()에서 한계값 설정하는 부분을 다 분리한 후에
// 동일한 실행 예가 나올 수 있도록 개조하시오.

import java.util.Scanner;

// 그 경우 method overloading을 통해 inputScore에 String[] 이 매개변수인 경우와
// int num이 매개변수인 경우로 나누어 inputScore()의 매개변수가 무엇이냐에 따라
// 이름 학생의 점수를 입력하세요 >>> 가 나오거나,
// n 번째 학생의 점수를 입력하세요 >>> 가 나올 수 있도록 하시오.
public class Array03MethodTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int limit = inputNum();
    }
    public int inputNum() {
        System.out.println("학생의 수를 입력하세요 >>> ");

        return scanner.nextInt();
    }

    private static void inputNames(String[] humans) {
       for (int i = 0 ; i < humans.length ; i ++) {
           System.out.println((i+1) + "번 학생의 이름을 입력 하세요 >>> ");
           humans[i] = scanner.next();
       }

    }
    public static void intputScore(String[] humans , double[] scores) {
        for (int i = 0 ; i < humans.length ; i++ ) {
            System.out.println(humans[i] + "학생의 점수를 입력하세요");
            scores[i] = scanner.nextDouble();
        }
    }

    public static void inputScore (int num, double[] scores) {
        for (int i = 0 ; i < num ; i++) {
            System.out.println((i+1) + "번째 학생의 점수를 입력하세요 >>>");
            scores[i] = scanner.nextDouble();
        }
    }

    public static void writeNameAndScore (String[] humans, double[] scores) {
        double total = 0;
        for (double score : scores ) {
            total += score;
        }
        for (int i = 0 ; i < humans.length ; i ++) {
            System.out.println(humans[i] + " : " + scores[i] + "점");
        }
        System.out.println("학생들의 점수 총합은 " + total + "점입니다." );
    }
}

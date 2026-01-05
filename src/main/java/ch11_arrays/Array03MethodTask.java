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
    public static int inputNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생의 수를 입력하세요 >>> ");
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }


}

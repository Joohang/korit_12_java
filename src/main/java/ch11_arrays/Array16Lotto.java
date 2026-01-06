package ch11_arrays;

import java.util.Arrays;

public class Array16Lotto {
    public static void main(String[] args) {
        int[] lottoNums = new int[6];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < lottoNums.length; i++) {
                lottoNums[i] = (int) (Math.random() * 45 + 1);
            }
            Arrays.sort(lottoNums);
            System.out.println(Arrays.toString(lottoNums));
        }
        System.out.println(Arrays.toString(lottoNums));
        // 그럼 현재 이상의 코드에서 중요한 점은 lottoNums 라는 배열을 선언 했을 때
        // 그 배열에 반복문을 통해서 계속 element를 덮어쓰는 방식으로 작성을 했다는 점입니다.
        // 그 결과 반복문 외부에서 sout했을 때 가장 최근 게임의 결과값이 나오는 점이라고 할 수 있겠네요.

    }
}
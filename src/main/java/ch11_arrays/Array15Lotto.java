package ch11_arrays;
/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨. -> 저랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작하겠습니다.

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다.(혹시 while문으로 작성하고싶다면
    그래도 됩니다)
 */
import java.util.Arrays;
import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        // 일단 1~ 45 까지의 임의의 값을 집어 넣기 위해 두 가지 방법을 사용할 수 있습니다.
        // # 1 - random.nextInt(45) + 1 을 사용하는 방법
        // # 2 - Math.random() : 0 ~ 0.9999999 사이의 임의의 실수를 return 함
        System.out.println(Math.random()); // 0 ~ 9까지의 값을 return 하려면
        System.out.println(Math.random()*10 + 1);
        // 그럼 Math.random()을 사용했을 때 1 ~ 45를 return하려면
        System.out.println(Math.random()*45 + 1);
        Random random = new Random();
        boolean duplicate;
        int cnt = 1;
        int temp = 0;
        int[] lotto = new int[6];
        for (int k = 0 ; k < 6 ; k ++) {
            for (int i = 0; i < lotto.length; i++) {
                temp = random.nextInt(44) + 1;
                duplicate = false;
                for (int j = 0 ; j < i; j++) {
                    if (lotto[j] == temp) duplicate = true;
                }
                if (!duplicate) lotto[i] = temp;
                else i--;

            }
            Arrays.sort(lotto);
            System.out.println(Arrays.toString(lotto));
        }
    }
}


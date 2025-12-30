package ch06_loops;
/*
    1부터 100까지 출력하시오.
    실행 예
    1
    2
    3
    ...
    100
 */
public class Loop02While {
    public static void main(String[] args) {
//        int i = 0;
//        while(i < 100) {
//            System.out.println(++i);
//        }

        /*
            2 번 문제
            1 2 3 4 5 6 ... 10
            11 12 13 ... 20
            ...
            91 92 ... 100
            으로 출력하시오.
         */

        // # 1 - 반복을 100번 하는 풀이
        int i = 0;
        while(i < 100) {
            System.out.print(++i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println(" 2 번 풀이 ");
        /*
            힌트 : 1 2 3 4 5 6 ... 10 을 출력하는 게 한 번의 반복
            힌트 # 2 : 첫 번째 반복의 경우 첫 번째 변수가 1로 시작하는데,
                두 번째 반복의 첫 번째 변수는 11이네요.
                세 번째는 21이구요.
                10씩 차이가 나네요.
                그럼 10씩 더하면 되는거 아닌가 하는 생각이 드셨다면 풀 수 있습니다.
                근데 코드가 길고 안예쁘지 않을까 ? -> 안예쁩니다.
         */
        int j = 1;
        while( j < 101 ) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5) + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
            j+=10;
        }

        // Loop03While2
    }
}
package ch06_loops;
/*
    for 반복문 (for loop)
    : 대부분의 경우 횟수가 고정되어 있을 때 사용하는 반복문
    ( 근데 아까 저희는 구구단 하든지 레슨 어쩌고 할 때 횟수를 고정시켜서 사용했었습니다만
    사실for문을 쓰는 편이 훨씬 간단합니다.)

    그럼 무엇을 기준으로 for / while을 선택하는가
    : 횟수를 기준으로 특정 반복횟수가 되었을 때 반복을 정지하고 싶다면 - for
    : 몇 번이나 진행될지 모르지만 특정 상태가 되었을 때 반복을 정지하고 싶다면 - while

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
        반복실행문
    }

     */
public class Loop04for {
    public static void main(String[] args) {
        int i = 1;
        while (i<11) {
            System.out.println(i++ + "");
        }
        System.out.println();

        // for문을 통한 1 - 10 까지 출력
        for (int j = 1 ; j < 11 ; j++) {
            System.out.print(j + " ");
        }

        // 1부터 100까지의 합을 구하시오. (for문으로 해보고 while로도)
        // 제한 : 1 2 3 4 5 ... 100 출력하고 합구하는게 아니라
        // 맨마지막에 합의 값을 한 번만 출력하시오

//        int sum1 = 0;
//        for ( int k = 1  ; k < 101 ; k++ ); {
//            sum1 += k;     // 첫 번째 반복에서는 1이 sum1에 대입될거고
//                            // 두 번째에서는 2가 대입되지 합이 누적되지 않는다.
//        }
//        System.out.println(sum1);

        int sum2 = 0;
        int num1 = 1;
        while (num1 < 101) {
            sum2 += num1++;
        }
        System.out.println(sum2);

        // 1부터 100까지의 숫자 중에서 홀수 합만 구하는 for문을 작성하시오.
        // Loop05for2
    }
}
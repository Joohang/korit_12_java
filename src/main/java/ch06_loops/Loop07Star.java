package ch06_loops;
/*
    Nested for - loop
    for(시작값;한계값;증감값) {
        반복실행문1-a
        for (시작값 ; 한계값; 증감값) {
            반복실행문2
        }
        반복실행문1-b
        for (시작값 ; 한계값; 증감값) {
            반복실행문3
        }
        반복실행문1-c
    }

    *                   고려사항
    **                  반복이 몇 번 일어나는가?
    ***                 무엇을 기준으로 반복이 이루어진다고 판단할 수 있나?
    ****                각 라인마다 별의 개수가 달라진다면 이것은 어떻게 통제해야 하는가?
    *****
 */

public class Loop07Star {
    public static void main(String[] args) {
        System.out.println("별찍기 시작");
        for (int i = 0; i < 6 ; i ++) {
            for (int j = 0 ; j < i ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         별찍기를 통한 for문 구조 학습
                        i = 0, j = 0 일 경우 반복실행문2가 아예 실행되지 않습니다.
                        한계값이 0 < 0이 false라서


         *              i=1, j=0 일때 별이 하나 찍히고, i=1/j=1 일때 false라서 개행
         **             i=2, j=0 일때 각각 별이 하나씩 찍히기 때문에 별이 두 개 되고 개행
         ***
         ****
         *****          i=5m j= 0, 1, 2 ,3 ,4 까지 다섯 개의 별이 찍히고
                        개행이 이루어지겠네요.

         */
        /*
                *****
                ****
                ***
                **
                *

                100부터 1까지 역순으로 출력하시오
         */
        for (int n = 100 ; n > 0 ; n--) {
            System.out.print(n+" ");
        }


        //역순 별찍기 # 1 - 개행 담당을 굳이 -- 할 필요가 없어서 0부터 시작하는 방법
        for (int k = 0; k < 6 ; k ++) {
            for (int l = 6 ; l > k ; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        //역순 별찍기 # 2 - 개행 담당도 --로 처리

    }
}

package ch06_loops;
/*
    중첩 while문(Nested - while)
    형식 :
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
    1일차 1교시입니다.
    ...
    1일차 3교시입니다.
    ...
    5일차 1교시입니다.
    ...
    5일차 3교시입니다.

    - 반복 횟수 : 15 번
 */
public class Loop03While2 {
    public static void main(String[] args) {
        int day = 2;
        while (day < 10) {
            int lesson = 1;         // 반복실행문1-a
            while (lesson < 10) {
                System.out.println(day + "일차 " + lesson + "교시입니다." + day + " x " + lesson + " = " + (day*lesson)); //반복실행문2
                lesson++;
            }
            System.out.println("😊");
            day++;  // 반복실행문1-b
            System.out.println(lesson);
        }

//        System.out.println(lesson);
        // 이상의 코드가 오류가 나는 이유는 추후 설명 예정이지만 도입된 개념은 scope(범위), global(전역), local(지역)에 해당합니다.

        /*
            이상의 중첩 while문을 분석하여
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            9 x 9 = 81
            을 출력하시오.
         */
        System.out.println();
        int dan = 2;
        while (dan < 10) {
            int num = 1;
            while(num < 10) {
                System.out.println(dan + " x " + num + " = " + (dan*num));
                num++;
            }
            dan++;
        }
    }
}
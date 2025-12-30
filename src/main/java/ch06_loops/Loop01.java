package ch06_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사합니다.
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이
    '반복적으로' 이루어집니다.

    그래서 주의할 점이,
    while 내부의 조건식이 특정 시점에 false가 되도록
    미리 설계를 해둘 필요가 있습니다.

    false가 되는 시점을 지정해주지 않는다면 true 상태가 유지되어
    반복실행이 무한히 이루어지기 때문에
    무한 루프라는 표현을 씁니다.        다 작성하셨면 Loop02While 클래스를 생성하시오.
 */
public class Loop01 {
    public static void main(String[] args) {
//        int i = 1;
//        while(i < 10) {
//            i++;
//        }
//        System.out.println(i);

        int j = 0;
        while( j < 10 ) {
            System.out.println(++j);
        }
    }
}
package ch05_condition;
/*
    if - else 문 : if 문 다음에 나오는 조건식이 true일 때는 if 내의 {} 실행문이 실행
        / false일 때는 else에 딸린 {} 실행문이 실행
    형식 :
    if(조건식) {
        실행문1
    } else {        else의 경우 if가 false일 때만 실행되기 때문에
        실행문2      if에서처럼 조건식이 따로 있지 않습니다.
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        } else {
            System.out.println("num1은 음수입니다.");
        }
    }
    // Condition03IfElseIf 생성
}
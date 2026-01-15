package ch21_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    예외 클래스는 별개로 정의했지만 메서드를 호출했을 때
    예외를 처리해야 하기 때문에 특정 예외를 참조한다는 것을
    명시해줘야만 합니다.
 */
public class AgeMain {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age<0||age > 200 ) {
            // 원래는 내부에 하나하나 쓰고 그 다음에 else를 쓰든 아니면 추가 if문을 작성함
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }
    }

//    public static void checkAge (String age) throws InvalidAgeException {
//        if ()
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
        /*
            이전에는 이상의 코드에 바로 scanner 집어넣었습니다.
            근데 생각해보면 여기 부분에 음수 혹은 200점 초과 정수, 그리고 실수를 입력할 수 있습니다.
            예외가 발생할 수 있는 부분의 코드 라인은 뭐로 감싼다?? try - catch
         */
        try {
            int age =  scanner.nextInt();
            checkAge(age); // 예외를 던질 (throw) 가능성이 있는 메서드 호출
        } catch (InvalidAgeException e) {

            System.out.println("나이 입력 오류 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 정수를 입력하세요.");

        }
    }
}

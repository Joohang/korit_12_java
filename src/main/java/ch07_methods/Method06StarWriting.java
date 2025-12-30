package ch07_methods;
/*
    별찍기 관련 부분을 저희가 메서드화 시켜볼 예정입니다.
 */

import java.util.Scanner;

public class Method06StarWriting {
    // call4() 유형으로 작성할 예정 > 몇 줄 짜리 별 찍을 건지
    // 어떤 유형의 별찍기를 할건지 main에서 받을 예정이기 때문에
    // method 정의 영역
    public static String getStar(int row, int option) {


        // 메서드 내에서만 사용되는 지역변수(local variable) 선언 및 초기화
        String result = "";
        // 별이 어떻게 찍히게 될지와 관련된 로직을 작성해야합니다.
        if (option < 1 || option > 4) {
            result = " 불가능한 메뉴 선택입니다. 1-4의 정수만 입력해주세요.";
        } else {
            if (option == 1) {
                for (int i = 0; i < row + 1; i++) { //여기 한계값이 i < row + 1 입니다.
                    //별을 책임지는 안쪽 for문
                    for (int j = 0; j < i; j++) { // i=0, j=0 일때 별이 안찍혀서
                        result += "*";
                    }
                    result += "\n";
                }
            } else if (option == 2) {
                // 개행
                for (int i = 0 ; i < row+1 ; i++) {
                    //공백
                    for (int j = row ; j > i ; j-- ) {
                        result += (" ");
                    } // 별
                    for (int k = 0 ; k < i ; k++) {
                        result += ("*");
                    }
                    result += "\n";
                }
            } else if (option == 3) {
                //개행
                for (int i = 0 ; i < row; i++) {
                    //별
                    for (int j= row ; j > i ; j --) {
                        result += ("*");
                    }
                    result += "\n";
                }

            } else {
                for (int i = 0 ; i < row; i++) {// else if (option == 4) 라고 쓸 필요가 없겠네ㅛ
                    //개행을 책임지는 바깥쪽 for문
                    for (int j = 0; j < i  ; j++) {

                        // 공백을 책임지는 안쪽 1번 for문

                        result += " ";
                    }
                    // 별을 책임지는 안쪽 2번 for문
                    for ( int k = row ; k > i ; k--) {
                        result += "*";
                    }
                }

            }

        }
        return result;

    }
    //method 호출 영역


    public static void main(String[] args) {


        // 사용할 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 사용할 변수 생성
        int rowOfStars = 0; // 몇 줄짜리 만들건지
        int choice = 0;     // 증가하는 별인지 감소하는 별인지 etc
        String starResult = ""; // 별은 String 자료형이라서 이런식으로 선언 및 초기화

        System.out.println("몇 줄 짜리 별을 생성하시겠습니까??? >>>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까 >>> ");
        choice = scanner.nextInt();
        System.out.println(rowOfStars + " " + choice);

        starResult = getStar(rowOfStars, choice);

        /*
            이상의 39 번 라인에 함축되어있는 의미를 파악할 필요가 있습니다.
            1. getStar()라고 하는 정적 메서드가 있다는 점 ('정적'의 의미는 추후 학습)
            2. getStar() 메서드는 매개변수가 있고, return 타입이 있는 call4() 유형이라는 점.
                -() 내에 변수명이 들어가 있다는 점에서, 그리고 그 변수의 자료형까지 고려하면
                - int타입의 변수가 두 개 요구된다는 점을 파악할 수 있습니다.
                - 또한 getStar() 메서드의 호출 결과가 String 자료형의 starResult 에 저장됐다는 점에서
                - return 타입이 String 이라는 점도 알 수 있겠네요.
         */

        // 메서드 호출

        System.out.println(starResult);
    }
}
package ch07_methods;
/*
    이번에 switch문으로 하도록 하겠습니다.
    근데 좀 생각해보면,
    이미 저희는 method 내에서 scanner를 import했었습니다.
    그렇다면 method를 호출할 때 콘솔창에 입력을 하는 것이 가능하다는 걸 아는데,
    굳이 main에다가 변수들 선언해가면서 할 필요가 있을까의 문제가 있습니다.
 */

import java.util.Scanner;

public class Method07StarWriting2 {
    // method 정의 영역
    public static String getStar() {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.println("몇 줄 짜리 별을 생성하시겠습니까??? >>>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까 >>> ");
        choice = scanner.nextInt();
        System.out.println(rowOfStars + " " + choice);


        String result = "";

        switch (choice) {
            case 1:
                for (int i = 0; i < rowOfStars + 1; i++) {

                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0 ; i < rowOfStars+1 ; i++) {
                    for (int j = rowOfStars ; j > i ; j-- ) {
                        result += (" ");
                    }
                    for (int k = 0 ; k < i ; k++) {
                        result += ("*");
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0 ; i < rowOfStars; i++) {
                    for (int j= rowOfStars ; j > i ; j --) {
                        result += ("*");
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0 ; i < rowOfStars; i++) {

                    for (int j = 0; j < i  ; j++) {



                        result += " ";
                    }

                    for ( int k = rowOfStars ; k > i ; k--) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            default:
                result = "잘못된 메뉴 선택입니다. 1 - 4 메뉴 중 선택해 주세요!!";
        }


        return result;

    }
    //method 호출 영역
    public static void main(String[] args) {

        System.out.println(getStar());



        // 메서드 호출


    }
}

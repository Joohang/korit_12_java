package ch21_exception.age_exception.signup;

import java.util.Scanner;

public class SingUpMain {

    public static void checkIdLengt  (String ID)throws InvaildException{
        int count = ID.length();
        if (count<8) {
            throw new InvaildException("아이디는 8자 이상이어야 합니다. 현재 : " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 >>> ");
        try {
            String ID = scanner.nextLine().replace(" ","");
            checkIdLengt(ID);
            System.out.println("아이디 생성 성공 : " + ID );
        } catch (InvaildException e) {
            System.out.println("오류 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}

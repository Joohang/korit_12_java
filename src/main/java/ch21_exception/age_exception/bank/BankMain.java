package ch21_exception.age_exception.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    private int balace = 10000;
    public  void balanceCheck (int amount) throws InsufficientBalanceException {
        if(amount > balace) {
            int gap = amount - balace;
            throw new InsufficientBalanceException("잔액이 부족합니다.(부족 금액 " + gap+"원)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankMain bank = new BankMain();

        try {
            System.out.println("현재 잔액 : " + bank.balace + "원");
            System.out.println("출금할 금액을 입력하세요 >>>");
            int amount = scanner.nextInt();
            bank.balanceCheck(amount);
            bank.balace = bank.balace - amount;  // 데이터 갱신을 위한 재대입 절차
            System.out.println("출금 후 잔액 : " + (bank.balace - amount) + "원");
        } catch (InsufficientBalanceException e) {
            System.out.println("출금 실패 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력");
        }
        finally {
            System.out.println("프로그램 종료");
        }
        System.out.println(bank.balace);
    }
}

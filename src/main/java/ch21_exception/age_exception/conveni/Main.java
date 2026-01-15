package ch21_exception.age_exception.conveni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void order(int quantity)throws InvalidOrderQuantityException {
        if (quantity<1 || quantity > 50) {
            throw new InvalidOrderQuantityException(" 잘못된 수량 입력");

        }System.out.println("상품 " + quantity + "개 주문 완료되었습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("재고 수량을 입력하세요 >>> ");
        try {
            int quantity = scanner.nextInt();
            order(quantity);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("주문 불가 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 주문 입력");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생하였습니다.");
        }
        finally {
            System.out.println("주문 프로세스 완료");
        }
    }
}

package ch19_collections.testitem;

import com.sun.source.tree.WhileLoopTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
    서점에서 판매하는 책 재고를 관리하는 프로그램
    지시 사항
    1. Map을 사용하여 도서명(String)을 key로, 재고를 Integer로 하여 value로 사용
    2. 사용자로부터 새 도서명과 수량을 입력 받아서 Map에 추가.
        - 이미 존재하는 도서라면 "이미 재고에 있는 도서입니다." 출력
    3. 사용자로부터 수량을 변경할 도서명과 새로운 재고 수량을 입력 받아 Map의 값을 '수정'
        - 존재하지 않는 도서라면 "해당 도서가 재고에 없습니다." 출력
    4. Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성.

    실행 예
    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 >>> 10
    자바의 정석 도서가 10 권 추가되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 2
    재고를 변경할 도서명을 입력하세요 >>> 자바의 정석
    새로운 재고 수량을 입력하세요 >>> 9
    자바의 정석 도서가 9 권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 3
    --- 현재 재고 목록 ---
    도서명 : 자바의 정석, 재고 수량 : 9 권
    도서명 : python의 정석, 재고 수량 : 1 권

    --- 도서 재고 관리 프로그램 ---
    1. 도서 추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 >>> 4
    프로그램을 종료합니다.
 */
public class BookMap {
    public static void main(String[] args) {
        Map<String, Integer> bookMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 입력하세요 >>> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice==4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("새 도서명을 입력하세요 >>>");
                    String bookName = scanner.nextLine();
                    System.out.println("재고 수량을 입력하세요 >>>");
                    Integer books = scanner.nextInt();
                    bookMap.put(bookName, books);
                    System.out.println(bookName + " 도서가 " + books + "권 추가되었습니다.");

                    break;
                case 2:
                    System.out.println("재고를 변경할 책 이름을 입력하세요 >>> ");
                    String bookName1 = scanner.nextLine();
                    System.out.println("변경할 재고 수량을 입력하세요 >>> ");
                    Integer books1 = scanner.nextInt();
                    bookMap.replace(bookName1, books1);
                    System.out.println(bookName1 + "의 재고가 " + books1 + "권으로 변경되었습니다.");

                    break;
                case 3:
                    Set<Map.Entry<String, Integer>> entrySet = bookMap.entrySet();
                    System.out.println(entrySet);
                    break;


            }
        }
    }
}

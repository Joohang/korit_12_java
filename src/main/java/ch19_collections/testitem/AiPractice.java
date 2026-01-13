package ch19_collections.testitem;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AiPractice {
    private String itemName;
    private Integer itemLv;

    public int choiceMenu(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 아이템 획득 \n2. 아이템 강화 \n3. 아이템 분해 \n4. 인벤토리 확인 \n5. 게임 종료:"  );
        System.out.print("메뉴를 선택하세요 >>> ");
        choice = scanner.nextInt();

        return choice;
    }




    public static void main(String[] args) {
        Map<String, Integer> g = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice;
            System.out.println("1. 아이템 획득 \n2. 아이템 강화 \n3. 아이템 분해 \n4. 인벤토리 확인 \n5. 게임 종료:"  );
            System.out.print("메뉴를 선택하세요 >>> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            switch (choice) {
                case 1 :
                    System.out.print("획득하고 싶은 아이템 이름을 입력하세요 >>> ");
                    String itemName = scanner.nextLine();
                    inventory.put(itemName,0);
                    System.out.println(itemName+"가 인벤토리에 추가되었습니다.");
                    if (itemName.equals(itemName)) System.out.println("이미 보유중인 아이템입니다.");

                    break;

                case 2 :
                    System.out.println("강화할 아이템 이름을 입력하세요 >>> ");
                    String itemName1 = scanner.nextLine();
                    if(inventory.containsKey(itemName1)) {
                        System.out.println("아이템을 찾았습니다. 강화를 시작합니다.");

                    } else System.out.println("찾을 수 없는 아이템입니다.");

            }

        }
    }
}

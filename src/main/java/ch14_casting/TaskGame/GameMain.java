package ch14_casting.TaskGame;

import ch14_casting.TaskGame.System.Invetory;
import ch14_casting.TaskGame.item.Bow;
import ch14_casting.TaskGame.item.Staff;
import ch14_casting.TaskGame.item.Sword;
import ch14_casting.TaskGame.item.Weapon;

public class GameMain {
    public static void main(String[] args) {
        // AllArgsConstructor를 활용한 Inventory 객체 생성
        Sword sword1 = new Sword();
        Bow bow1 = new Bow();
        Staff staff1 = new Staff();
        Invetory invetory1 = new Invetory(new Weapon[10]);
        Weapon[] weapons = {new Bow(), new Sword(), new Staff()};
        // 추가로 생성한 생성자를 활용한 Inventory 객체 생성
        Invetory myInventory = new Invetory(5);

        invetory1.addWeapon(bow1);
        invetory1.addWeapon(sword1);
        invetory1.addWeapon(staff1);

        // 인벤토리의 addWeapon()의 argument로 바로 생성자 호출 방법
        myInventory.addWeapon(new Bow());
        myInventory.addWeapon(new Sword());
        myInventory.addWeapon(new Staff());

        System.out.println();
        invetory1.attackAll();
        System.out.println();
        invetory1.useSpecialAbilities();
    }
}

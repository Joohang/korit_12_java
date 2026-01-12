package ch14_casting.TaskGame.System;

import ch14_casting.TaskGame.item.*;      // * 의 발음은 애스터리스크(asterisk라고 하고, all의 의미를 가집니다.)
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Invetory {
    private Weapon[] weaponSlots;

    // 다른 방식으로 정의하는 생성자 추가
    public Invetory(int capacity) {
        this.weaponSlots = new Weapon[capacity];
    }

    public void addWeapon(Weapon weapon) {
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("인벤토리가 가득 찼습니다.");
            return;
        }
        weaponSlots[emptyIndex] = weapon;
        System.out.println(weapon.getClass().getSimpleName() + " 장비가 추가되었습니다.");

    }
    private int checkEmpty() {
        for ( int i = 0 ; i < weaponSlots.length ; i++ ) {
            if(weaponSlots[i] == null) return i;
        }
        return -1;
    }

    public void attackAll() {
        for ( int i = 0 ; i  < weaponSlots.length ; i++ ) {
            if (weaponSlots[i] ==null){
                System.out.println("장비가 없어 실행하지 못했습니다.");
                continue;  // return; 으로 마무리 했을때와의 콘솔 상에서의 차이점을 확인하면 더 명확해집니다.
            }
            weaponSlots[i].attack();
        }
    }

    public void useSpecialAbilities() {
        for (Weapon weapon : weaponSlots ) {
            if (weapon instanceof Sword) {
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff) {
                Staff staff = (Staff) weapon;
                staff.castSpell();                // staff가 마지막 무기인데 else에 안넣은 이유는 나중에 단검(Dagger)
                                                    // 등을 추가할 때를 대비
            } else if (weapon ==null) {
                System.out.println("착용하지 않습니다.");
            } else {
                System.out.println("아직 사용할 수 없는 능력입니다");
            }

        }
    }


}

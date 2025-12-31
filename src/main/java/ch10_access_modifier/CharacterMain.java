package ch10_access_modifier;
/*
    목표 : 객체 지향 설계 및 접근 제어자 이해를 바탕으로
   다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의 ,
   이를 CharacterMain 클래스에서 기능 테스트를 수행할겁니다

   Character 클래서 설계
   1. field
        name - 이름 / 공개 가능 -> public
        health- 체력 / 읽기만 허용 -> private
        power - 공격력 / 같은 패키지만 ->default
        skill - 스킬명 / 자식클래스만 -> protected
        exp - 경험치 / 외부에서 차단 -> getter

        character 클래스의 인스턴스인 warrior 생성
        이름 : 전사
        체력 : 100
        공격력 : 200
        스킬 : 세로배기
        exp : 30
        으로 기본 생성자를 통해 생성하고, setter를 통하여 데이터를 설정

    2. method
        getHealth()
        attack() : 공격시 콘솔창에
            name 이(가) power로 공격!
            name 이(가) 경험치 amount을(를) 얻었습니다 - > 라고 두 줄 출력 되게
        heal() : 체력을 10 회복하고, 현재 체력 출력
            체력이 10 회복 되었습니다. 현재 체력 : health(숫자로 출력될 수 있게)
        getExp(int amount) -> call2() 유형인데 경험치를 증가시키는 메서드(내부 전용)
            실행 예
             name 이(가) 경험치 amount을(를) 얻었습니다. 라고 출력되게
 */

class Character {
    public String name;                 // 공개 가능이라서
    private int health = 100;           // 읽기 전용이라서
    int power;                          // 같은 패키지만
    protected String skill= "세로 베기";    // 상속을 받은 자식 클래스까지
    private int exp ;                   // 완전 차단




    public Character() {
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.health = power;
        this.skill = skill;
        this.exp = 0;           // 초기 체력(매개변수 없으니까, 이말은)
        this.health = 100;      // 이상의 매개변수 생성자로 객체를 생성했을 때 체력 100 경험치 0으로 만든다는 의미
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    private void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public String getSkill() {
        return skill;
    }

    public int getExp() {
        return exp;
    }

    // 추가 method들 정의
    private void gainExp(int amount) {
        exp += amount;
        System.out.println(name +"이(가) 경험치" + amount + "을(를) 얻었습니다");
    }
    // 그래서 두 가지 방식 중에 하나만 적용하면 됩니다.

    public void attack() {
        System.out.println( name + "이(가)" + power+ "로 공격!");
        this.gainExp(10); // 그래서 공격 할 때 마다 10씩만 추가되겠네요
        // 이상의 코드는 메서드 내에서 메서드를 호출한 사례인데 걔가 private이라는게
        // 저희 기준으로는 처음 경험하는 부분

        // 이하의 코드는 setter를 private으로 바꾼 다음에 공격할 때 마다 10씩 증가한 상태를 set하는 메서드 양식입니다.
        int currentExp = this.getExp();
        this.setExp(currentExp + 10);
        System.out.println(name +"이(가) 경험치" + 10 + "을(를) 얻었습니다");
    }

    public void Heal() {
        health += 10;
        System.out.println("체력을 10 회복하였습니다." + health);
    }



}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character();
        warrior.setName("전사");
        warrior.setHealth(100);
        warrior.setPower(200);
        warrior.setSkill("세로배기");
       // wariior.setExp(30);  //애매한게 나중에 그냥 날려버릴 수도 있을 것 같습니다.
        // 이상의 setExp의 경우 객체 생성하고 나서 경험치를 설정할 수 있는데
        // 여기에 1000000 같은 식으로 입력하면 부정 사용이 될거 같긴 함
        System.out.println(warrior.getExp());

        // wariior.gainExp(1000); 경험치를 얻는 메서드는 attack() 메서드를
        // 호출함을 통해서만 얻을 수 있도록 하기 위해서는
        // 접근 지정자가 private이 되어야겠네요
        warrior.attack();
        warrior.Heal();

        Character healer = new Character("힐러", 100 , "힐");
        System.out.println(healer.getHealth());
        System.out.println(healer.getExp());
    }
}

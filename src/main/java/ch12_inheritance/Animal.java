package ch12_inheritance;
/*
    상속을 지시하는 키워드 extends


 */
public class Animal {
    // field 정의
    private String animalName;
    private int animalAge;

    // 기본 생성자 하나. 매개 변수 생성자 하나 짜리 두 개

    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    // AllArgsConstructor 생성자 하나 생성하시오

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }



    // getter / setter 생성


    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // Animal 클래스의 고유 매서드 정의
    public void move() {
        System.out.println("움직입니다.");

    }
}

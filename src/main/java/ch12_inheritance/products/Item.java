package ch12_inheritance.products;
/*
    부모클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain

    Item 클래스에
    1. field 선언 private String name/ private String category
    2. AllArgsConstructor 생성
    3. setter / getter /todtjd
    4. product에서 상속하시오

    product 클래스에
    1. field 선언 private int price; / private int stock;
    2. AllArgsConstructor 생성
    3/ 고유 field에 대한 Setter / Getter 생성
 */

public class Item {
    private String name;
    private String category;

    public Item() {
    }

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}

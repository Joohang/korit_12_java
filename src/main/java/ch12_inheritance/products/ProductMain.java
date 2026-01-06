package ch12_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
//        Item item1 = new Item();
//        item1. setName("일반 상품");
//        item1. setCategory("일반");
//        System.out.println("이 상품은 " +item1.getName()+ "입니다.");
//        System.out.println("이 상품은 " +item1.getCategory()+ "카테고리 입니다.");
        Item item1 = new Item("일반 상품","일반 카테고리");
        System.out.println("이 상품은 " +item1.getCategory()+ "카테고리 입니다.");

        Product product1 = new Product("전자 제품","가전 제품",100000,10);
//        product1.setName("전자 제품");
//        product1.setCategory("가전 제품");
//        product1.setPrice(100000);
//        product1.setStock(10);

    }
}

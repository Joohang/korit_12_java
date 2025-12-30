package ch08_classes.products;
/*
    Product 클래스에 여러 가지 생성자를 정의하시오.
    field는
    int productNum;
    String pruductName;

    method는
    showInfo() -> productNum 과 productName 정보가 콘솔에 출력되도록할것

   1. 기본 생성자를 사용하여 객체를 생성하시오.
    product1
    productNum 123456
    productName LG엘패드
    2. 시리얼 넘버를 기본으로하는 매개변수 생성자를 통해 객체를 생성하시오.
    product2
    productNum 987654
    productName 다이소충전기
    3. 제품명을 기본으로 하는 매개변수 생성자를 통해 객체를 생성하시오.
    product3
    productNum 159357
    productName USB-C 케이블
    4. AllArgsConstructor를 이용하여 객체를 생성하시오.
    product4
    productNum 951753
    productName GFlip6
 */

public class Product {
    int productNum ;
    String productName ;

    public Product () {
        productNum = 123456;
        productName = "LG엘패드";

    }
    public Product (int productNum) {
        this.productNum = productNum;
        productName = "다이소충전기";
    }
    public Product (String productName) {
        this.productName = productName;
    }
    public Product (int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }
    public void showInfo () {
        System.out.println("제품 정보");
        System.out.println("시리얼 넘버 : " + productNum );
        System.out.println("제품 타이틀 : " + productName );
        System.out.println();
    }
}

package ch08_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car(); //객체 생성
        myCar. color = "빨강";
        myCar. speed = 160;

        Car yourCar = new Car();//객체 생성
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        myCar.displayInfo();
        yourCar.brake();
        yourCar.displayInfo();


    }
}

package ch09_Classes;

public class CarMain {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        Car yourCar = new Car();

        // 픨드 값 대입
        myCar.color = "빨강";
        myCar.speed = 160;
        myCar.drive();
        myCar.displayInfo();

        System.out.println("---------------");

        yourCar.color = "노랑";
        yourCar.speed = 180;
        yourCar.brake();
        yourCar.displayInfo();



    }
}

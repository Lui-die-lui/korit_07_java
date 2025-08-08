package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이",2);

        System.out.println(animal1.getAnimalName());

        // Tiger 객체 생성
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(3);
        String tigerName = tiger1.getAnimalName();
        int tigerAge = tiger1.getAnimalAge();
        System.out.println("이 호랑이의 이름은 " + tigerName); // Animal(tiger의 부모 클래스)상속받아 사용가능

        tiger1.hunt();
        tiger1.hunt("물고기");
        tiger1.move(); // 호랑이가 네 발로 걷습니다. -> 재정의된 move() 호출
        animal1.move(); // 움직입니다. -> 부모 원본 그대로 호출

        System.out.println();

        Human human1 = new Human();
        human1.move();

        human1.setAnimalAge(30);
        human1.setAnimalName("이슬기");

        String name = human1.getAnimalName();
        int age = human1.getAnimalAge();

        System.out.println("안녕하세요, 제 이름은 " + name + " 이고 나이는 " +
                age + "입니다. \n내년에는 " +(age + 1) + "살이 됩니다." );
        human1.read("자바의 기초");



    }

}

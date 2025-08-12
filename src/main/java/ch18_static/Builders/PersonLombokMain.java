package ch18_static.Builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("이슬기")
                .age(30)
                .address("부산 광역시")
                .build(); // chaining method

        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();

        System.out.println(person2);
    }
}

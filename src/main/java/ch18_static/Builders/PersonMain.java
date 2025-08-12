package ch18_static.Builders;

public class PersonMain {
    public static void main(String[] args) {

        // 기존의 객체생성
//    Person person1 = new Person(); ->  builder 정의할 때 private 해서 이렇게 생성 못함
        // 그리고 여태까지의 방식으로 이름,나이, 주소 라는 필드값을 지니는 객체를 생성한다면,
//    Person person1 = new Person("이름","나이","주소");
        // 일텐데 빌더 패턴을 적용한다면,
        // 이하의 예시는 AllArgs이다.
        Person person1 = new Person.Builder()
                .age(30)
                .address("부산 광역시")
                .name("이름")
                .build();

        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder()
                .address("서울특별시 종로구")
                .build();
        System.out.println(person3);

    }

}

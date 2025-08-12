package ch18_static.Builders;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;


@Data
public class Person {
    private String name;
    private int age;
    private String address;
    private double height;
    private double weight;

    // 생성자를 정의하는 방법은 많은데, Lombok을 도입할 수도 있지만 그 경우에도
    // 몇 번째 argument 로 이름을 넣는지, 나이를 넣는지 골치아픔

    // 이름은 웬만하면 동일하게
    private  Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.height = builder.height;
        this.weight = builder.weight;
    }
    /*
        PersonMain 에서 생성자 호출을 통해서 객체를 생성하는것을 막았음
        그리고 매개변수 부분을 보면 builder 객체의 필드로 name age address가 있음
        역서 중요한 점은 Person의 필드와 Builder의 필드가 동일해야 함.
    */

    public static class Builder {
        public double height;
        private double weight;
        private String name;
        private int age;
        private String address;


        /*
        * 이하의 코드는 method를 정의하는 영역
        * 대부분의 경우 method는 행위를 나타내기 때문에 동사로 시작
        * But 빌더 패턴의 경우
        * 대입될 필드의 이름과 도일한 메서드 명을 지음.
        * 필드는 명사로 지으니, 결국 명사
        * */

        public Builder name(String name) {
            this.name = name;   // 객체가 생성되면 객체 이름으로 치환되는 키워드
            return this;        // 여태까지는 name에 값이 없다가 빌더 내에 있는 name field에
            // 값이 대입된 객체가 리턴됨
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        // 그래서 이 위쪽 코드까지는 field 명과 동일한 메서드들을 정의함
        // 그 효과는 메서드명과 동일한 field에 값이 대입된 Buillder 객체가 리던됨

        // 같은 클래스 내에서만 Person 불러냄
        public Person build() {
            return new Person(this); // 이 this는 Builder 클래스의 인스턴스에 해당
        }
    }
}

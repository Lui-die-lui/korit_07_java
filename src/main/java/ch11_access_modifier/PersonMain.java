package ch11_access_modifier;

class Person {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
    setter / getter 는 default로 access modifier가 public이므로
    클래스 외부에서 사용 가능

    setter / getter 활용하여
    처음 이름을 "김일" -> "이일"로 변경
*/

public class PersonMain {
    public static void main(String[] args) {
        // 객체 생성
        Person person1 = new Person();
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());
    }
}

package ch16_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름 : " + this.getName() + "\n주소 : " + this.getAddress());
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';  // 여기는 우리 마음대로 변경 가능 - 무조건 다 집어넣을 필요 없음
    }
}

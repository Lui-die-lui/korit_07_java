package ch18_static.singleton;

import ch09_Classes.Products.Product;
import lombok.Getter;

/*
    방금 작성한 ProductView와 인터넷에서의 레퍼런스를 참조
    samsung 클래스의 싱글톤 패턴 작성
*/
public class Samsung {
    // 정적 필드
    private static Samsung instance;
    // 일반 필드 (멤버 변수라는 표현을 씀)

    @Getter // getCompany() 만 만듦
    private  String company;
    private int serialNumber;

    // private으로 NaArgsConstructor 정의
    private Samsung() {
        company = getClass().getSimpleName();   // 결과값 결국 Samsung
        serialNumber = 20250000;    // 즉 객체 생성시에 필드값을 초기화 시키겠다
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;  // 싱글톤으로 작성했으니까 어차피 객체 하나만 생성될거고
        // Main 단계에서 다수의 객체에서 createSerialNumber()를 호출하더라도 전혀 serialNumber가 중복되지
        // 않을거라고 볼 수 있다.
        // 그러면 정적 변수로 선언하고 다수의 삼성 객체를 만들어도 serialNumber가 안겹치지 않을까?
        // 라고 생각한다면 맞는말
        // 근데 그러면 Samsung이라는 회사 갯수가 백만개라는 전제하에 가능


    }

}

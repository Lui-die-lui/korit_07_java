package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 정의
    private String factoryName;

    // 메서드 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        // 접근 지정 안써서 default 그리고 {} 영역 내에 있어서 지역변수
        String model = "갤럭시S26";
        String serial;

        // 이것도 지역변수지만,
        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 -> 싱글톤 썼으니까 어차피 동일한 객체가 계속 대입
        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴 타입이 SmartPhone 임. 그러니까 SmartPhone 객체 튀어나와야하는데,
        // 스마트폰 객체 생성할 때 저희가 뭘 해야 하냐면,

        // 지역변수임
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model,serial);

        return smartPhone;
    }
}

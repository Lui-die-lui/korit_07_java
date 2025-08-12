package ch18_static.singleton.products;

public class ProductView {
    // 정적 변수 선언
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instance -> 이게 시험시 인트 중 하나
    private static ProductView instance; // ProductView 클래스의 정적 field인 instance

    // private으로 생성자를 선언 -> 객체가 하나만 생성되는걸 보장하기 위한 접근 지정자이므로 중요
    private ProductView() {
        // 처음 생성될 때 1이기 때문
        int counter = 1; // 이건 객체 생성될 때 만들어지는 지역 변수
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;

    }

    // 정적 메서드 static
    // 여기서 ProductView는 반환타입
    // static 빼면 객체 여러개 생성 가능
    public static ProductView getInstance() {
        if (instance == null) { // 현재 이니스턴스가 없는 시점이라면 22번 코드라인이 true 이므로
//            객체 생성 , instance에 집어넣음 // ProductView() 생성자를 호출하여 instance에 대입
            instance = new ProductView();
        }
        // 객체 반환
        return instance; // 이미 생성되었으면 바로 이쪽 라인 실행
        // 이제 null값이 아니기때문에 더이상 반환 안됨.
    }
}

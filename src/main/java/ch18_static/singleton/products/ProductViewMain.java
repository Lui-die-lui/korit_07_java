package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        // 객체는 한 번만 실행 - singleton
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();

        // 이상 코드는 ProductView.java 를 확인했을 때 객체를 생성하는 method
        // 생성자를 호출하지 않은 이유는 생성자가 private이기 때문
        // 하지만 이상의 코드를 실행했을 때 1 번째 객체가 생성되었습니다 한 줄만 출력

        // 그런데 그 전에 staatic 배웠을대는 1~5 번째 객체가 생성되었습니다로 튀어나왔는데
        // 차이점 : 생성자 내에서 지역변수로 int counter선언하고 초기화 했기 때문

        // 그래서 static 패키지 내부의 코드와 이번의 ProductView 코드를 비교 / 대조해서 확인

        // 그리고 기출에 싱글톤 문제 확인할것
    }
}

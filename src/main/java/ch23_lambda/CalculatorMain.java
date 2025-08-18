package ch23_lambda;

public class CalculatorMain {


    // 정적 메서드 정의
    public static  int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        // 저희가 정의한 interface Calculator를 사용
        // 근데 인터페이스 내부에는 두 개의 매개변수만 정의되어있음
        // 저희는 여기서 추가조작을 통해서 사칙 연산을 시도

        Calculator add = (x, y) -> x + y; // Calculator 인터페이스의 객체명이 add, 내부 메서드는 calculate()
        Calculator sub = (x,y) -> x - y; // Calculator 인터페이스의 객체명이 sub, 내부 메서드는 calculate()
        Calculator mul = (x,y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println(add.calculate(2,3)); // 위 주석을 참고했을때의 올바른 메서드 호출 방식
        System.out.println(sub.calculate(2,3)); // 근데 너무 길어서 저희는 static method를 정의
        System.out.println("--- static method 호출방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2,3,add)); // static method의 로직 을 보면
        // 세번째 매개변수로 Calculator인터페이스의 서브 클래스를 받습니다.
        // 그리고 return 문을 보시면 해당 객체의 .calculate() 메서드를 호출하는 것을 확인 가능
        // 근데 add.calculate() 는 return이 x + y니까, 결과값이 5개 나옴
        // 그러면 우리는
        // 24번 코드 라인의 해석을 위해서
        // Calculator인터페이스와 CalculatorMain 의 static method, 그리고 main에ㅅ의 lambda식을 전부
        // 왔다갔다 하면서 볼 필요가 있다는 의미
        System.out.println("2 * 3 = " + operate(2, 3 ,mul));
    }
}

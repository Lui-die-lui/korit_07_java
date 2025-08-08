package ch09_Classes;

import java.util.Scanner;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
        call1()-call4()
    형식 :
        (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2) {
        메서드 내부에서 순차적으로 실행될 코드들 -> 이 묶음을 비즈니스 로직이라고 함
        }

    ex )
    정의 :
    public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }

    호출 :
        객체명.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
*/



public class ReviewMethod {
// 메서드 정의 영역
public void writeSchedule(String date, String content) {
    System.out.println(date + "일의 스케줄은 다음과 같습니다.");
    System.out.println(content);

}

public void writeSchedule(int date, String content) {
    System.out.println(date + "일의 스케줄은 다음과 같습니다.");
    System.out.println(content);
}




public void dividedBySeven(int number) {

    // 지역변수 선언
    String answer = "";
    if (number % 7 == 0) {
        answer = "7의 배수입니다";
    } else {
        answer = "7의 배수가 아닙니다.";
    }
    System.out.println(number + "(은)는" + answer);
}

// overloading이 적용된 call1() 유형
public void dividedBySeven() {
    Scanner scanner = new Scanner(System.in);
    int number = 0;
    System.out.print("임의의 숫자를 입력해주세요. >>> ");
    number = scanner.nextInt();             // method의 return값이 number라는 변수에 저장되는것

//    String answer = "";
//    if (number % 7 == 0) {
//        answer = "7의 배수입니다";
//    } else {
//        answer = "7의 배수가 아닙니다.";
//    }
//    System.out.println(number + "(은)는 " + answer);

    dividedBySeven(number); // method 내부에서 다른 method를 호출하는것도 가능
}

// 1. writeSchedule을 overloading하여 매개변수1의 자료형을 int로 바꾸고,
// writeSchedule(20250805, "클래스/getter/setter 예습") 을 호출

// 2. call2() 유형으로 작성 -> main에 어떻게 쓸지, 아닐지 고민할 것
// dividedBySeven 메서드를 정의
// 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드 작성
// ex) 임의의 숫자를 입력하세요 >>> 77
    // 77은 7의 배수입니다.
    // 임의의 숫자를 입력하세요 >>> 100
    // 100은 7의 배수가 아닙니다.

    public static void main(String[] args) {
        // 메서드 호출 영역
        ReviewMethod reviewMethod = new ReviewMethod();
//        reviewMethod.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
//        reviewMethod.writeSchedule(20250804,"클래스/getter/setter 예습");

        // argument 가 필수적으로 요구되기 때문에
        // main에서 scanner import
//        Scanner scanner = new Scanner(System.in);
//        int number = 0;
//        System.out.print("임의의 숫자를 입력해주세요. >>> ");
//        number = scanner.nextInt();
//        reviewMethod.dividedBySeven(number);

          reviewMethod.dividedBySeven();
          // 이 경우에는 argument가 없기 때문에 method 내부에서 변수를 사용



    }
}

package ch08_methods;

import java.util.Scanner;

//1. [ x | x ][ 입력값 / 출력값 ]
public class Method01 {
    public static void call1() {
        System.out.println("[ x | x ]");
        // 반복 작업의 경우 훨씬 편해짐
    }

    //2. [ o | x ]
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        // 특정 데이터를 사용할때는 이 유형 사용함 static
        System.out.println("영어 인사 : " + example);

    }

//    3. [ x | o ]
    // ()안에 입력이 요구되지 않음
    public static String call3() {
        String example = "안녕하세요";
        System.out.println("[ x | o ]");
        return example;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3점짜리입니다.");
        return score * 3;
    }

    /*
        return이 있는 이유는 기본적으로 데이터의 조작을 위해서입니다. 그리고 특정 메서드의 결과값이
        다른 메서드의 argument로 사용될 수도 있습니다.

        함수형 프로그래밍(Functional Programming) :
            메서드1의 return 값이 메서드2의 argument가 되고, 메서드2의 return 값이
            메서드3의 argument가 되는 방식으로,

            첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩 방식

            간단 예시
    */

    public static String introduce(String name, int age) {
        return "제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.\n내년에는 " + (age + 1) + "살이 됩니다.";
    }


    public static int call3And1() {
        System.out.println("[ x | o ]");
        return 1;
    }

    public static void main(String[] args) {
        // void - 리턴 값이 없음
        // 메서드 호출 영역
        call1();
        // 1개의 argument 요구 - String 으로 하나 넣어줘야함
        call2("hello");
//        call3();
        // return값을 출력하기 위해서는
        System.out.println(call3());
//        call3And1();
        // 데이터 조작을 위해 사용 - return 값을 연산 하기위해서는 필요함
        System.out.println(call3And1());
        // return값을 출력하기 위해서는 2
        String name = "김일";
        System.out.println(name + "학생의 학점은 " + call4(4.5) + "점 입니다.");

        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;
        System.out.print("이름을 입력하세요. >>> ");
        myName = scanner.nextLine();  // nextLine = 메서드 -> 메서드의 결과값을 myName 변수에 저장
        System.out.print("나이를 입력하세요. >>> ");
        myAge = scanner.nextInt();

        System.out.println(introduce(myName,myAge));
        // 그리고 그 결과값들을 정의한 introduce()메서드의 argument로 사용하여 최종 결과물을 콘솔에 출력
    }
}

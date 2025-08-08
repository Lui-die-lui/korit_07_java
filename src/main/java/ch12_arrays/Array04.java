package ch12_arrays;

import java.util.Scanner;

/*
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것이 목표

    다음 목표
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부 element들의 값을 하나하나 다 입력 받아서 바꾸는 method를 정의하는 것
*/
public class Array04 {
    // 메서드 정의 영역

    public void printNames() {
        String[] names = {"김일", "김이", "김삼", "김사", "김오", "김육"};


        // method화 하기 위한 과정 #1
        // 일단 main 에서 해본다
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }

    // 오버로딩 이용
    // String
    public void printElements(String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }

    // int
    public void printElements(int[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }

    // double
    public void printElements(double[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }

    // 입력 관련 method 정의
    public void writesElements(String[] strArray) {
        // 여기서 스케너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출한 후 내부에서 입력할거라 Scanner를 여기 import
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i + 1) + "번째 element를 입력하시오 >>>");
            strArray[i] = scanner.nextLine();
        }
    }

    public void writesElements(double[] strArray) { // strArray = 받을 값
        // 여기서 스케너를 import 하고, 매개변수로 받은 배열에 값을 입력할 수
        // 있도록 하는 method 정의
        // 메서드 호출한 후 내부에서 입력할거라 Scanner를 여기 import
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print((i + 1) + "번째 element를 입력하시오 >>>");
            strArray[i] = scanner.nextDouble();
        }
    }




    public static void main(String[] args) {
        Array04 array04 = new Array04();
        // 임의의 String[] 배열 생성
        String[] people = new String[2];
        double[] scores = new double[2];
        // 메서드 호출 영역
        array04.writesElements(people); // 입력
        array04.printElements(people); // 출력

        array04.writesElements(scores);
        array04.printElements(scores);



        // method화 하기 위한 과정 #1
        // 일단 main 에서 해본다

        // 여기에 객체 생성하고 메서드 호출해서 김일 김이 ... 김육을 출력하시오.


        array04.printNames(); // 동일하게 나옴
        System.out.println();
        // But, 메서드를 호출했을 때 특정 배열(지역변수 내 배열)의 element만 출력됨 -> 범용성이 떨어짐

        String[] students = {"이일", "이이", "이삼", "이사", "이오"};
        array04.printElements(students); // 어떠한 스트링 배열도 상관없이 스트링 배열 가능
        String[] teachers = {"안일", "안이", "안삼", "안사"};
        System.out.println();
        array04.printElements(teachers);

        System.out.println();
        int[] dates = {2025, 8, 5};
        array04.printElements(dates);


    }
}

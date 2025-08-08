package ch12_arrays;

/*
    1. humans 배열에 이름을 입력할 수 있도록 함
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    김일 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 이름을 등록하세요 >>> 김이
    김이 학생의 점수를 입력하세요 >>> 4.4
    3 번 학생의 이름을 등록하세요 >>> 김삼
    김삼 학생의 점수를 입력하세요 >>> 4.3
    4 번 학생의 이름을 등록하세요 >>> 김사
    김사 학생의 점수를 입력하세요 >>> 4.2
    5 번 학생의 이름을 등록하세요 >>> 김오
    김오 학생의 점수를 입력하세요 >>> 4.1


    학생들의 점수 총합은 21.5점입니다.
*/

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 사용할 변수 목록
        int index = 0; // 이름과 점수의 배열 길이가 같기때문에

        System.out.print("몇명의 학생을 등록하시겠습니까? >>> ");
        index = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[index];
        double[] scores = new double[index];
        double sum = 0;


        for (int i = 0; i < index ; i++) {
            System.out.print((i + 1)+ "번 학생의 이름을 등록하세요. >>> ");
            names[i] = scanner.nextLine();
            System.out.print(names[i] + "학생의 점수를 등록하세요. >>> ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
            sum += scores[i];
        }

        // 각 배열의 element를 출력하는 반복문 작성할 필요 -> name 출력 후에 개행이 이루어지고 그 다음 scores가 출력

        for (int i = 0; i < names.length ; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        System.out.println("학생들의 점수 총합은 " + sum + "점입니다.");
    }
}

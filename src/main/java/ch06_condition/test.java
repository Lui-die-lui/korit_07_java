package ch06_condition;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        💯 문제 1: 점수에 따른 학점 판별기
//        사용자로부터 0~100 사이의 점수를 입력받아, 아래 기준에 따라 학점을 출력하세요.
//        조건:
//        90 이상 → A
//        80 이상 90 미만 → B
//        70 이상 80 미만 → C
//        60 이상 70 미만 → D
//        60 미만 → F
        // 100 초과 0 미만은 출력시 다르게

//        int score = 0;
//        String grade = "";
//        System.out.print("점수를 입력하세요. >>> ");
//        score = scanner.nextInt();

//        if (score > 100 || score < 0) {
//            grade = "X";
//            System.out.println("잘못된 점수입니다. : " + grade);
//        } else if (score > 89) {
//            grade = "A";
//        } else if (score > 79) {
//            grade = "B";
//        } else if (score > 69) {
//            grade = "C";
//        } else if (score > 59) {
//            grade = "D";
//        } else {
//            grade = "C";
//        }
//
//        if (!grade.equals("X")) {
//            System.out.println("점수 : " + score + "\n등급 : " + grade);
//        }


//🧓 문제 2: 나이에 따른 요금 계산기
//        사용자로부터 나이를 입력받아, 놀이공원 입장료를 다음과 같은 규칙으로 계산하세요.
//
//                조건:
//
//        0~3세: 무료
//
//        4~12세: 5,000원
//
//        13~64세: 10,000원
//
//        65세 이상: 7,000원

        int age = 1;

        String result = (!(age > 0)? "나이를 확인해주세요."
                : age > 66 ? "7000"
                : age > 14 ? "10,000"
                : age > 3 ? "5000"
                : age > 0 ? "무료"
                : "나이를 확인해주세요." );


        System.out.println(result);






//📦 문제 3: 택배 요금 계산기
//        사용자로부터 물건의 무게(kg)를 입력받아, 택배 요금을 계산하세요.
//
//        요금 기준:
//
//        2kg 이하: 3,000원
//
//        2~5kg 이하: 5,000원
//
//        5~10kg 이하: 8,000원
//
//        10kg 초과: "배송 불가" 출력


    }
}

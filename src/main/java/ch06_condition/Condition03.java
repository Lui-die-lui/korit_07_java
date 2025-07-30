package ch06_condition;
/*
    if- else - if문 : if-lse 문과 달리 else if에서는 별도의 조건식이 요구됨.
    그리고 else if는 여러개 나올 수 있음
*/

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        //Scanner class
        Scanner scanner = new Scanner(System.in);

        // 변수 / 상수의 선언 및 초기화
        int point = 0;
        // 상수 개념
        final int VIP_PIONT = 100; // final 키워드 붙으면 재대입 불가
        final int GOLD_PIONT = 60;// 즉 변함없는 데이터를 사용하고 싶을때 사용
        final int SILVER_PIONT = 40; // 상수 선언한 데이터 = snake case의 대문자로 작성 (띄어쓰기'_')
        final int BRONZE_PIONT = 20;
        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        int point2;

        final int GENERAL_POINT;

        if (point >= VIP_PIONT) {
            System.out.println("회원등급 : VIP");
        } else if (point >= GOLD_PIONT) {
            System.out.println("회원등급 : GOLD");
        } else if (point >= SILVER_PIONT) {
            System.out.println("회원등급 : SILVER");
        } else if (point >= BRONZE_PIONT) {
            System.out.println("회원등급 : BRONZE");
        }

        // 기능은 동일하지만 개발자 친화적(유지보수가 용이한 형태)으로 재작성
        // 리팩토링
        // 1. sout이 너무 많음
        // 2. 요구 등급에 대한 표인트 규정이 바뀔 경우에 조건문에서 일일이 수정해야 한다. - 변수 상수 사용
        String userGrade = "";
        if (point > VIP_PIONT) {
          userGrade = "VIP";
        } else if (point > GOLD_PIONT) {
          userGrade = "GOLD";
        } else if (point > SILVER_PIONT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_PIONT) {
            userGrade = "BRONZE";
        }
        System.out.println("회원 등급 : " + userGrade );


    }
}

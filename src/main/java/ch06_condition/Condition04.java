package ch06_condition;

import java.util.Scanner;

/*
 if - else if - else 문
*/
public class Condition04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요. >>> ");
        int point = scanner.nextInt();
        String userGrade = "";

        if (point > 80) {
            userGrade = "VIP";
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
            userGrade = "BRONZE";
        } else { // 여기서 추가 - 위의 값에 들어가지 않는 나머지
            userGrade = "GENERAL";
        }
        System.out.println("회원 등급 : " + userGrade );

        /*
         if - else의 경우 if 내의 조건식이 false라면 바로 else의 실행문이 실행 되는 데 반해,
         if - else if - else 의 경우에는 else위의 조건식들을 '차례대로' 검토한 후에,
         그 무엇도 해당되지 않으면 else의 실행문이 실행됩니다.

         그렇다면 개발자들이 신경써야 하는 점이 무엇인가 ?

         조건식의 순서를 설정하는 부분이 됩니다.
        */

    }
}

package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {

        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 50점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D입니다.
        */

        // 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요. >>> ");
        int score = 0;
        double score2 = 0;
//        if (score2 >= 90) - 형태가 될 수 밖에 없음
        String grade = "";
        score = scanner.nextInt();
        score2 = scanner.nextInt();

        if (score > 89) { //  >= 보다 직관적이기 때문에 더욱 선호
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는" + score + "점이고, 학점은 " + grade + "입니다.");

        System.out.println("----------------------------------");

        if (score2 >= 90) { //  double 값 = 이상 이하를 강제적으로 사용해야함
            grade = "A";
        } else if (score2 >= 80) {
            grade = "B";
        } else if (score2 >= 70) {
            grade = "C";
        } else if (score2 >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는" + score2 + "점이고, 학점은 " + grade + "입니다.");

    }
}

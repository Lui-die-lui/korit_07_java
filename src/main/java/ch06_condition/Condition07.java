package ch06_condition;

import java.util.Scanner;

/*
 중첩 if문(Nasted-if)
    if문 내에 if문이 중첩적으로 사용될 수 있습니다. (if문 안에 if문)
*/
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요. >>> ");
        score = scanner.nextInt();

        // 중첩 if문을 활용한 grade 대입
        if (score > 100 || score < 0 ) {
            System.out.println("불가능한 점수 입력입니다. : " + grade); // 실행문 1
            grade = "X";
        } else {
            } if (score > 89) {
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
        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}

package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        String yearType = "";

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
            yearType = "윤년";
        } else {
            yearType = "평년";
        }
        System.out.println(year + "는 " + yearType + "입니다.");
    }
}


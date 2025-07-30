package ch06_condition;

import java.util.Scanner;

/*
 삼항 연산자
 정의 : 조건식을 평가하여 true / false에 따라 두 가지 표현식 중 하나를 선택적으로 실행
 조건식 ? 표현식1 : 표현식2;

 조건식 : true / false로 평가 가능한 식
 표현식1 : 조건식이 true일 때 실행되는 식
 표쳔식2 : 조건식이 false일 때 실행되는 식
*/
public class Condition10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max;
        // a > b 라면 max에 a를 대입 : 아니라면 max에 b를 대입
//        max = (a > b) ? a : b;
//
//        System.out.println("저장된 값 : " + max);
//    }

        // 만약 삼항 연산자가 아닌 if문이라면
//    if (a > b) {
//        max = a;
//    } else {
//        max = b;
//    }
//        System.out.println("저장된 값 : " + max);

        Scanner scanner = new Scanner(System.in);
        System.out.println("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        // is - boolean
//        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
//        String result = isLeapYear ? "윤년입니다" : "윤년이 아닙니다.";
//        System.out.println(year + "년은" + result);


        // 음수 년도를 걸러내기 위한 방법 #1
        String result2 = "";
        boolean isLeapYear2 = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        if (year < 0) {
            result2 = "불가능한 년도 입력입니다.";
        } else {
            result2 = isLeapYear2 ? "윤년입니다." : "윤년이 아닙니다.";
        }
        System.out.println(year + "년은" + result2);

        // 음수 년도를 걸러내기 위한 방법 #2
        // 삼항 연산자의 중첩
        String result3 = year < 0 ? "불가능한 년도 입력입니다" // 0보다 year가 작으면 - 음수 걸러냄 - 0보다 크면 false값으로(오른쪽)
                : ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) // 여기서 값이 true - 윤년 / false - 평년
                ? "윤년입니다."
                : "윤년이 아닙니다.";
        System.out.println(year + "년은" + result3);



    }
}

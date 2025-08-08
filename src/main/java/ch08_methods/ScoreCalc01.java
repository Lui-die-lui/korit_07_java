package ch08_methods;

import java.util.Scanner;

/*
     점수들을 입력 받아서 총합 및 평균을 내는 프로그램 작성
*/


public class ScoreCalc01 {

//    public static void addAndAvg(double a, double b, int c) {
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;

        /*
        * 3과목의 점수를 입력 받아서, 총합과 평균 점수를
        * 콘솔창에 표시하시오
        *
        * 실행 계
        * 몇 과목의 점수를 입력하시겠습니까> >>> 3
        * 1과목의 점수를 입력하세요 >>> 100
        * 2과목의 점수를 입력하세요 >>> 90
        * 3과목의 점수를 입력하세요 >>> 95
        * 총 합은 285.0이며, 평균은 95.0입니다.
        * */
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();

        for (int i = 0; i < numOfSubs ; i++) {
            System.out.print( (i + 1) + "과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextInt();
            avg = sum/numOfSubs;
        }
        System.out.println("총 합은 " + sum +"이며, 평균은 " + avg + "입니다.");





    }
}

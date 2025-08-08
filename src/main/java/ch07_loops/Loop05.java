package ch07_loops;

/*
 중첩 for문도 가능
*/

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {

//        for문을 활용하여 1일차 1교시 - 5일차 3교시까지
//        for (int i = 1; i < 6 ; i++) {
//            for (int j = 1; j < 4 ; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//            System.out.println();
//        }
//
//        // 구구단 for문 활용
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10 ; j++) {
//                System.out.println(i + " x " + j + " = "  + (i * j));
//            }
//            System.out.println();
//        }

//         1234 ...
        //... 100
//        for (int i = 1; i < 101; i++) {
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//            System.out.print(i + " ");
//        }
//
//        for (int i = 1; i < 101 ; i += 10) {
//            System.out.println(i + " "+ (i+1)+ " "+ (i+2)+ " "+ (i+3)+ " "+ (i+4)+ " "+ (i+5)+ " "+ (i+6)+ " "+ (i+7)+ " "+ (i+8)+ " "+ (i+9));
//        }

        /*
        숫자를 입력 받아서 n까지 더하는 반복문을 for문으로 작성하시오
        1부터 몇까지 더하시겠습니까?
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하겠습니까? >>> ");
        int n = 0;
        int sum3 = 0;
        int sumE = 0;
        int sumO = 0;
        n = scanner.nextInt();

        for (int i = 1; i < (n + 1) ; i++) {
            sum3 += i;
            if (i % 2 == 0) {
                sumE += i;
            }
            if (i % 2 == 1) {
                sumO += i;
            }
//            else { // 강사 풀이
//                sumO += i;
//            }
        }

        System.out.println("1부터" + n + "까지의 합은 " + sum3 + "입니다.");
        System.out.println("1부터" + n + "까지 중 짝수의 합은 " + sumE + "입니다.");
        System.out.println("1부터" + n + "까지 중 홀수의 합은 " + sumO + "입니다.");



//        System.out.println("1부터 n까지 짝수 값만 더하기 >>> ");
//        int num = 0;
//        int sum4 = 0;
//        num = scanner.nextInt();
//
//
//        for (int i = 1; i < (num + 1) ; i++) {
//            sum4 += i;
//            if (num % 2 == 0) {
//
//            }
//        }
//        System.out.println(sum4);

//        int sum4 = 0;
//
//        for (int i = 0; i < 10 ; i++) {
//            if (i % 2 == 0) {
//                sum4 += i;
//            }
//        }
//        System.out.println(sum4);


    }
}

package ch07_loops;

/*
  Scanner를 이용한 별찍기
  몇 줄의 별을 생성하시겠습니까? >>> 3
  (별 순방향 역방향)
*/

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        row = scanner.nextInt();

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < i + 1 ; j++) { // 이항 해도 가능
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------");

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < row - i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 0; i < row; i++) {
//            for (int j = row; j - i > 0 ; j--) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }

    }
}

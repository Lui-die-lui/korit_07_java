package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우 명확한 횟수가 고정되어 있을 때 사용하는 반복문
    (while - 고정 시킨 상태로 시작 but for문 사용하는게 더 편리)

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
    반복 실행문
    }
*/
public class Loop04 {
    public static void main(String[] args) {
//        // 1부터 100까지 출력하는 for문
//        for (int i = 1; i < 101 ; i++) {
//            System.out.println(i); // i = for문 내부에서만 사용가능한 지역 변수
//        }


        // 1부터 100까지의 합을 구하고 한 번만 출력하기
//        int sum = 0;
//        for (int i = 0 ; i < 101 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // 1부터 100 까지 중 홀수 합을 구하는 for문 작성
        // 중첩 if 사용 가능

//        int sum = 0;
//        for (int i = 1; i < 101; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        // 증감값 수정
//        int sum2 = 0;
//        for (int i = 1; i < 101; i+=2) {
//            sum2 += i;
//        }
//        System.out.println(sum2);

        /*
        숫자를 입력받아서 1부터 n가지 더하는 반복문 작성
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하겠습니까? >>> ");
        int n = 0;
        int sum3 = 0;
        n = scanner.nextInt();

        for (int i = 1; i < (n + 1) ; i++) {
            sum3 += i;
        }

        System.out.println("1부터" + n + "까지의 합은 " + sum3 + "입니다.");

//        int sum4 = ((n*(n+1))/2); - 이거 사용해도 됨



    }
}

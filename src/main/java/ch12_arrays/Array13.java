package ch12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi-Dimensional Array) 중에서 2차원 배열

    : 다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상
    2차원 배열 이상을 다루는 경우는 극히 드물기 때문에 2차원 배열을
    기준으로 강의

    형식 :

    int[][] arr01 = new int [크기][크기];       -선언 방식 #1
    int[][] arr02 = new int [크기][];          -선언 방식 #2
    int[][] arr03 = new int {{1,2},{3,4},{5,6}}; -선언 방식 #3 및 초기화

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 함.
        -> 2번 방식에 해당함
        1열 2열(column)
         ↆ  ↆ
        {1, 2},   →    1 행      가로줄을 '행'(db로 들어가면 low)
        {3, 4},   →    2 행
        {5, 6}    →    3 행
*/
public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = {{1,2},{3,4},{5,6}};
        // 5라는 숫자를 뽑아내고 싶다
        System.out.println(arr03[2][0]);// 5
        System.out.println(arr03[2]);   //[I@36baf30c
        System.out.println(arr03);      //[[I@7a81197d

        System.out.println(Arrays.toString(arr03)); // [[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        // 2차 배열의 element 추출 -> 중첩 for문 사용
        for (int i = 0; i < arr03.length ; i++) {
            // 근데 반복문 하나 파고 들어가봐도 여전히 배열이기 때문에 이 부분에서 1차 배열을 추출하기 위한
            // 반복문을 추가로 작성해주셔야 합니다.
            for (int j = 0; j < arr03[i].length; j++) {
                System.out.print(arr03[i][j] + " ");
            }
        }

        // 그렇다면 향상된 for문으로 2차 배열 내부의 element를 추출
        for (int[] firstArray : arr03) {
            for (int element : firstArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }













//        // for문 돌려서 2차원 배열 만들기
//        String[][] imaxSeats = new String[10][15]; // 배열 세로 / 가로
//        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
//        for (int i = 0; i < imaxSeats.length; i++) {
//            for (int j = 0; j < imaxSeats[i].length; j++) {
//                imaxSeats[i][j] = eng[i] + (j + 1);
//            }
//        }
//        // 배열을 이용해 출력
//        for (int i = 0; i < imaxSeats.length; i++) { // 배열의 길이만큼 세로로 돌림
//            for (int j = 0; j < imaxSeats[i].length; j++) { // 베열의 가로
//                System.out.print(imaxSeats[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}

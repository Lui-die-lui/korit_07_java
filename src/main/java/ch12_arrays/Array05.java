package ch12_arrays;
/*
    메서드를 정의해도 되고 main에 바로 해도 됨
    String[] scores 배열에
    A / B / C / D / F  element 입력하고
    실행 예
    A + B + C + D + F
    가 되도록 코드를 작성하시오
*/


import java.util.Scanner;

public class Array05 {

    public void writeElement(String[] strArray) {
        for (int i = 0; i < strArray.length ; i++) {
            System.out.print(strArray[i] + "+ ");
        }
    }




    public static void main(String[] args) {
//        Array05 array05 = new Array05();
//
//        String[] scores = {"A","B","C","D","F"};
//
//        array05.writeElement(scores);

        String[] scores = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < scores.length ; i++) {
            scores[i] = scanner.nextLine();
        }
        // 출력하는 반복문 -> A B C D만 출력하고 거기에 + 붙일 예정
        // 맨마지막 인덱스는 그냥 출력할 예정
        for ( int i = 0 ; i < scores.length - 1 ; i++ ) {
            System.out.print(scores[i] + "+ ");
        }
        System.out.println(scores[scores.length-1]);

     }
}

package ch07_loops;
/*
 Nested for - loop
 for(시작값 ; 한계값 ; 증감값) {
    반복실행문 1-a
    for(시작값 ; 한계값 ; 증감값) {
        반복실행문2
        }
        반복실행문 1-ㅠ
        for(시작값 ; 한계값 ; 증감값) {
            반복실행문3
            )
            반복실행문 1-c
       }
*/
public class Loop06 {
    public static void main(String[] args) {
        // 삼각 별 찍기
        // 고려사항
        // 반복은 몇 번 이루어지는가?
        // 무엇을 기준으로 반복이 이루어졌다고 판단할 수 있나?
        // 왜 라인마다 별의 갯수가 달라지는가?
        for (int i = 0; i < 6; i++) { // 세로 값
            for (int j = 0; j < i ; j++) { // 가로 값
                System.out.print("*"); // 내부 for문이 통제
            }
            System.out.println(); // 바깥 for문이 통제
        }

        System.out.println();

        /*
            별 찍기를 통한 for문 구조 학습
            i = 0, j = 0 일 때는 두번째 for 문 작동 안함 개행만 됨. 0 이기때문에
            *       i = 1, j = 0 별 하나 찍힘
            **      i = 2, j = 0, 1 별 2개 찍힘
            ***
            ****
            *****   i = 5, j = 0, 1, 2, 3, 4 까지 5개 찍힘

            거꾸로 별
            *****
            ****
            ***
            **
            *
        */
        // 1. 개행을 담당하는 것이기 때문에 굳이 5 4 3 2 1...
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j - i > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 5부터 좁히는법
        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        // windows + . = 이모지

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5 - i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       // 100 - 1
        for (int i = 100; i > 0 ; i--) {
            System.out.println(i);
        }










    }
}

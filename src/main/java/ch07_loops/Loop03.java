package ch07_loops;
/*
    중첩 while문 (Nested - while)
    while(조건식1) {
        반복실행문 1-a
    while(조건식2) {
        반복실행문 2
    }
    반복 실행문 1-b
    }
*/
public class Loop03 {
    public static void main(String[] args) {
//        int day =1;
//        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
//        // 2일차 1교시 입니다 ...
//        // ~5일차 3교시입니다.
//        while (day < 6) {
//            int lesson = 1; // 반복실행문 1-a에 해당. 변수의 선언 및 초기화 - 반복문 내부에서만 사용 가능 - (scope 범위)지역변수
//            while (lesson < 4) {
//                System.out.println(day + "일차 " + lesson +"교시입니다."); // 반복실행문
//                lesson++; // 여기 안에선 3까지만
//            }
//            day++; // 반복실행문 1-b
            // 여기서 빠져나오면 lesson이 4가 됨
//        }
        // scope(범위) - 전역/지역으로 나뉨


        /*
        이상의 코드를 활용하여
        구구단을 출력 하십시오
        */

        int dan = 2;

        while (dan < 10) {
            int i = 1;
            while (i < 10) {
                System.out.println(dan + "x" + i + "=" + (dan * i));
                i++;
            }
            dan++;
        }



    }
}

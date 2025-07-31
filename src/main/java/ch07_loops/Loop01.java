package ch07_loops;
/*
 while 반복문
 형식 :
 while(조건식) {
    반복 실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이
    '반복적으로 ' 이루어짐

    주의할 점
    while 내부의 조건식이 특정 시점에  false가 되도록
    미리 설계를 해둘 필요가 있습니다.

    false가 되는 시점을 지정해주지 않는다면 계속 true 상태가 유지되며
    반복 실행문이 무한히 계속됨 => 무한 루프
*/
public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력하는 예시
//        int i = 1;
//        while (i < 101) {
//            System.out.println(i);
//            i++;        // 명령 후 증가
            // i를 증가시켜서 23번 라인이
            // 특정 시점에 조건이 false가 되도록 지정
//        }

//        int j = 0;
//        while (j < 100) {
//            System.out.println(++j); // 증가 시킨 후 명령
//        }


        int num1 = 1;
        int sum = 0;
        // 1부터 100까지 합을 구하기

//        sum = (100 * 101) / 2; - 등차수열

        while (num1 < 101) {
            sum += num1; // 복합 대입 += num1 을 sum에 넣어줌
            num1++; // 돌면서 넣어줌 - 101 전까지
        }
        System.out.println("최종 합계 : " + sum);


        /*
          사실 1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는곳 자체가
          오히려 비효율적이라는 사실을 이상의 코드에서 확인 가능.

          하지만 while문 자체는 Java 문법이고, if에서와 동일하게
          중첩적으로 사용이 가능

          그리고 while문 내부에 if문이 들어가는 등의 응용도 가능

          ex) '공차가 2이고 a1이 0인 수열의 a50까지의 합을 구하시오'
          와 같은 문제가 나온다고 가정 - 등차수열의 합 공식

        */

        int j = 0;
        int sum2 = 0;
//        while (j < 100) {
//            if (j % 2 == 0) {
//                sum2 += j;
//            }
//            j++;
//        }

//        while (j < 101) {
//            sum2 += j;
//            j+=2;
//        }
//        System.out.println(sum2);

        /*
         1부터 100 까지 한 줄로 출력
        */
        int k = 0; // 0으로 시작하는것을 선호
        while (k < 100) {
            System.out.print(++k + " ");
        }



    }
}

package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
         // 변수 선언
//        String name;
//        name = "이슬기";
//        System.out.println(name);
//
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>");
//        name = scanner.nextLine();
        /*
         1. println 과 print의 차이
         ln : line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행됨.
         print로 작성할 경우에 동일 라인에 그대로 연결됨.

         2. nextLine / nextInt ... 구분
        */
/*        System.out.print("연도를 입력하세요. >>>");
        int year = scanner.nextInt();
        System.out.print("이름을 다시 입력하세요. >>>");
        name = scanner.next(); // 입력을 lee seulgi
        System.out.println(name); // lee 만 반환*/
        /*
         2. next(Int / Double, ... etc) vs. nextLine
         - nextLine은 띄어쓰기를 허용합니다. enter 키, 즉 개행을 기준으로 데이터가 변수에 저장됨
         -> 그래서 이외의 실행 결과가 lee
         -> 나머지는 허용안함, 띄어쓰기 하면 잘려서 대입

        */

//        System.out.print("올해는 몇 년도인가요? >>> ");
//        int year = scanner.nextInt();
//        // 값을 입력받지않고 넘겨버림
////      nextInt()에서 값을 입력하고 enter를 치게 되었을때,
////        다음 nextLine()에서는 enter키를 받아들여서 빈 값인 상태로 enter를 쳤다고 인지하게 됨
////      줄바꿈 문자(\n)가 버퍼에 남아서 nextLine()이 오작동하기 때문
//        scanner.nextLine();
//        // 받아줄 nextLine 추가 - 베리어 역할을 해줌
//        // 사용되지 않아 변수에 대입하지 X
//        System.out.print("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);

        // 1. 다음과 같이 콘솔에 출력될 수 있도록 코드를 완성하시오.
        // 나이를 입력하세요 >>> 19
        // 저는 올해 19살입니다.
        // 내년에는 20살이 됩니다.

        // 2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
        // 점수를 입력하세요 >> 4.5
        // 이름을 입력하세요 >> 김일
        // 김일 학생의 점수는 4.5입니다.


//        System.out.print("나이를 입력하세요. >>> ");
//        int age = scanner.nextInt();
////        System.out.println("저는 올해 "+ age + "살입니다.");
////        System.out.println("내년에는 " + ++age + "살이 됩니다." );
//        System.out.println("저는 올해 "+ age + "살입니다. \n내년에는 " + ++age + "살이 됩니다." );

//        System.out.print("점수를 입력하세요. >>> ");
//        double score = scanner.nextDouble();
//        scanner.nextLine(); // 베리어 쓰기
//        System.out.print("이름을 입력하세요. >>> ");
//        String name = scanner.nextLine();
//        System.out.println(name + " 학생의 점수는" + score + " 입니다.");

        System.out.println("베리어 쓰지 않는 방법");
        System.out.print("점수를 입력하세요. >>> ");
        double score = scanner.nextDouble();
        System.out.print("이름을 입력하세요. >>> ");
        String name = scanner.next();
        System.out.println(name + " 학생의 점수는" + score + " 입니다.");

    }
}

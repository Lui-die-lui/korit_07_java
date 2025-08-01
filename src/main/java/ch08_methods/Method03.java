package ch08_methods;

import java.util.Scanner;

/*
    방금 별찍기 관련 메서드를 생성 했습니다.
    그런데 잘 생각해보면 굳이
    main에서 scanner 임포트 받은 다음에 몇 줄 짜리 쓸건지
    옵션 몇번 선택할지를 물어봐야할까요?

    그냥 메서드 실행시킬때 알아서 물어보면 간단하지 않을까요?
*/
public class Method03 {
    public static String getStar() { // 입력값과 출력값이 둘 다 필요한 유형
        String result = ""; // void 대신 String 사용했기 때문에
        // method 내부에서 method 호출 가능
        Scanner scanner = new Scanner(System.in);
        // method02에서 main단계에 써둔 부분을 여기에 다 가지고오면
        // getStar() 메서드를 호출하는 것만으로도 동일한 결과값이 나올듯 - 통합/분할 개념

        int rows = 0; // getStar() 에서 매개변수를 rows로 사용해서 수정하기 귀찮기땜에 그렇게 씀
        int option = 0;
        System.out.print("몇 줄 짜리 별을 생성하시겠습니까? >>> ");
        rows = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요. >>> ");
        option = scanner.nextInt();

        if (option == 1) {

            for (int i = 0; i < rows + 1 ; i++) {
                for (int j = 0; j < i; j++) {
                    result += "*"; // 반복문이 돌면서 string데이터의 별을 더해줌
                }
                result += "\n";

            }
        } else if (option == 2) {

            for (int i = 0; i < rows + 1; i++) {
                // 공백을 책임지는 for문
                for (int j = 0; j < rows - i ; j++) {
                    result += " ";
                }
                // 별을 책임지는 for문
                for (int k = 0; k < i ; k++) {
                    result += "*";
                }
                result += "\n";
            }

        } else if (option == 3) {

            for (int i = 0; i < rows ; i++) {
                for (int j = 0; j < rows - i ; j++) {
                    result += "*";
                }
                result += "\n";
            }

        } else if (option == 4) {

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += " ";
                }

                for (int k = 0; k < (rows - 1) - i; k++) {
                    result += "*";
                }
                result += "\n";
            }

        } else {
            result = "해당 기능이 없습니다.";
        }

        return result; // result값을 return한다
    }

    public static void main(String[] args) {
//       String starResult = "";
//       starResult = getStar();
//        System.out.println(starResult);
        System.out.println(getStar());
    }
}

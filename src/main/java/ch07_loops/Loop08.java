package ch07_loops;

/*
 반대로 붙은 별
      *
     **
    ***
   ****
  *****
 ******

 ******
  *****
   ****
    ***
     **
      *
*/

public class Loop08 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            // 공백을 책임지는 for문
            for (int j = 0; j < 6 - i ; j++) {
                System.out.print(" ");
            }
            // 별을 책임지는 for문
            for (int k = 0; k < i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < i + 1 ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

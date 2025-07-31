package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20

    1. 반복문을 100 번 돌리는 방법
    2. 반복문을 10 번 돌리는 방법
 */
public class Loop02 {
    public static void main(String[] args) {

        // 풀이 #1
        int i = 0;
        while (i < 100) {
            System.out.print(++i + " ");
            if (i % 10 == 0) { // i를 10 으로 나누었을때 나머지가 0
                System.out.println();
            }
        }

        // 풀이 #2
        int j = 1;
        while (j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4)+ " " + (j+5)+ " " + (j+6)+ " " + (j+7)+ " " + (j+8)+ " " + (j+9));
            j+=10;

        }






    }
}

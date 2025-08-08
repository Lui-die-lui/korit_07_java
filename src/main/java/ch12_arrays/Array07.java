package ch12_arrays;

/*
    내부 ELEMENT의 값들의 점수 범위를 조사하여
    90이상 A
    80 B
    70 C
    60 D
    59 F

    A가 몇명, B가 몇명 출력할것
*/
public class Array07 {


    public static void main(String[] args) {
        int[] socres = {100, 97, 83, 85, 77,76, 64, 64, 58, 59,92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        // int[] =/= int
//        for (int i = 0; i < socres.length; i++) {
//            if (socres[i] > 89) {
//                a++;
//            } else if (socres[i] > 79) {
//                b++;
//            } else if (socres[i] > 69) {
//                c++;
//            } else if (socres[i] > 59) {
//                d++;
//            } else {
//                f++;
//            }
//            System.out.println("A 학생 수 : " + a);
//            System.out.println("B 학생 수 : " + b);
//            System.out.println("C 학생 수 : " + c);
//            System.out.println("D 학생 수 : " + d);
//            System.out.println("F 학생 수 : " + f);

            // 고민할 부분 -> 어차피 변수가 abcdf가 하나하나 int니까
            // int[] 배열로 선언 - 선언하는 변수 개수를 줄일 수 있지 않을까
            int[] grades ={0,0,0,0,0};
            // A에 해당하는 점수 -> grade[0] + 1
            // 굳이 다섯줄을 써가면서 변수 선언할 필요x

            for (int i = 0; i < socres.length ; i++) {
                if (socres[i] > 89) {
                    grades[0]++;
                } else if (socres[i] > 79) {
                    grades[1]++;
                } else if (socres[i] > 69) {
                    grades[2]++;
                } else if (socres[i] > 59) {
                    grades[3]++;
                } else {
                    grades[4]++;
                }
            }
        System.out.println("배열 A 학생 수 : " + grades[0]);
        System.out.println("배열 B 학생 수 : " + grades[1]);
        System.out.println("배열 C 학생 수 : " + grades[2]);
        System.out.println("배열 D학생 수 : " + grades[3]);
        System.out.println("배열 F 학생 수 : " + grades[4]);

        }
    }


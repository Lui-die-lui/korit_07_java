package ch12_arrays;

/*
    int[]  scores = {100, 920, 80, 70, 60, 50, 40, 30, 20, 10};
    총 합과 평균을 계산해서 다음과 같이 출력하시오.
    총점 : 뭐 몇점
    편균 : 뭐 몇점
*/
public class Array06 {
    public static void main(String[] args) {
        int[] scores = {100, 920, 80, 70, 60, 50, 40, 30, 20, 10};

        int sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = (sum / scores.length);
        System.out.println("총점 : " + sum + "\n평균 : " + avg);
    }
}

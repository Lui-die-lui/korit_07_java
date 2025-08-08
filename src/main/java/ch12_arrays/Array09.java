package ch12_arrays;

import java.util.Scanner;

/*
   접근 지정자 public으로 method들을 정의했기 때문에
   직접 정의한 Array08 클래스의 메서드만
   calcSum() / calcAvg()를 Array09에서도 사용 가능
   => Scanner를 사용했던 원리와 동일
*/
public class Array09 {
    public static void main(String[] args) {
        // 메서드를 사용할 클래스의 객체 생성
        Array08 array08 = new Array08();
        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = array08.calcSum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
    }
}

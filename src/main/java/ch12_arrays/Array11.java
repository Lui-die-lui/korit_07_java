package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons ={"김일","김이","김삼","김사","김오"};
        /*
            실행 예
            1 번 : 김일
            2 번 : 김이 ...
        */

        for (int i = 0; i < persons.length; i++) {
            System.out.println((i+1) + " 번 : " + persons[i]);
        }
        int i = 0;
        for (String person : persons) {
            // 내부에 선언하면 계속 초기화됨
            ++i;
            System.out.println( i + " 번 : " + person);
        }
    }
}

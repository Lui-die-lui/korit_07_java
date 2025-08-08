package ch12_arrays;

public class Array08 {
    // 접근 지정자 / return 자료형 / 메서드명(매개변수) {구현부가 어떤식으로 이루어질 지 return}

    public int calcSum(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    // 평균을 구하는 메서드를 정의
//    public double calcAvg(double[] doubleArray) {
//        int sum = 0;
//        for (int i = 0; i < doubleArray.length; i++) {
//            sum += doubleArray[i];
//        }
//        return (sum / doubleArray.length);
//    }

    // double값으로 반환 - int 값의 배열을 적용
    public double calcAvg(int[] intArray) {
        double avg = 0;
        int sum = calcSum(intArray);
        // 근데 생각해보면 평균을 구하려면 어차피 합이 필요
        avg = (double) sum / intArray.length;
        return avg;
    }



    public static void main(String[] args) {
        // 위에 정의한 method 호출하기 위해 객체 생성
        Array08 array08 = new Array08();
        int[] socres = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};

        // 이상의 예시 배열을 argument로 하는 총합을 구하는 method calcSum,
        // 평균을 구하는 calcAvh method를 정의하는데, call4() 유형으로 만듦.
        int sum = array08.calcSum(socres);
        double avg = array08.calcAvg(socres);

        System.out.println("총합 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }

}


package org.example;

import ch18_static.Builders.Person;

import java.util.Scanner;

public class BmiCalc {


    public void calcBmi() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요. >>> ");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요. >>> ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();

//        double bmi = weight/(height*height);

//        String result = "";
//
//        if (bmi < 19) {
//            result = "저체중입니다.";
//        } else if (bmi < 23) {
//            result = "정상입니다.";
//        } else if (bmi < 25) {
//            result = "비만 전 단계입니다.";
//        } else if (bmi < 30) {
//            result = "비만 1단계입니다.";
//        } else if (bmi < 35) {
//            result = "비만 2단계 입니다.";
//        } else if (bmi >= 35) {
//            result = "비만 3단계 입니다.";
//        }
//
//        System.out.println(name + "님의 BMI 지수는 " + (bmi) + "으로 " + result);
    }

    public void calcBmi(String name, double height, double weight) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요. >>> ");
        name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요. >>> ");
        height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

        double bmi = weight/(height*height);

        String result = "";

        if (bmi < 19) {
            result = "저체중입니다.";
        } else if (bmi < 23) {
            result = "정상입니다.";
        } else if (bmi < 25) {
            result = "비만 전 단계입니다.";
        } else if (bmi < 30) {
            result = "비만 1단계입니다.";
        } else if (bmi < 35) {
            result = "비만 2단계 입니다.";
        } else if (bmi >= 35) {
            result = "비만 3단계 입니다.";
        }

        System.out.println(name + "님의 BMI 지수는 " + (bmi) + "으로 " + result);
    }

    // call3() 형태 메서드 - 매개변수가 객체
    public void calcBmi(Person person) {
        double bmi = person.getWeight()/(person.getHeight()* person.getHeight());

        String result = "";

            if (bmi < 19) {
                result = "저체중입니다.";
            } else if (bmi < 23) {
                result = "정상입니다.";
            } else if (bmi < 25) {
                result = "비만 전 단계입니다.";
            } else if (bmi < 30) {
                result = "비만 1단계입니다.";
            } else if (bmi < 35) {
                result = "비만 2단계 입니다.";
            } else if (bmi >= 35) {
                result = "비만 3단계 입니다.";
            }

            System.out.println(person.getName() + "님의 BMI 지수는 " + bmi + "으로 " + result);
         }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요. >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요. >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        Person person = new Person.Builder()
                .name(name)
                .weight(weight)
                .height(height)
                .build();

        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBmi(person);




//            double bmi = weight/(height*height);
//
//            String result = "";
//
//            if (bmi < 19) {
//                result = "저체중입니다.";
//            } else if (bmi < 23) {
//                result = "정상입니다.";
//            } else if (bmi < 25) {
//                result = "비만 전 단계입니다.";
//            } else if (bmi < 30) {
//                result = "비만 1단계입니다.";
//            } else if (bmi < 35) {
//                result = "비만 2단계 입니다.";
//            } else if (bmi >= 35) {
//                result = "비만 3단계 입니다.";
//            }
//
//            System.out.println(name + "님의 BMI 지수는 " + (bmi) + "으로 " + result);
//        }


        /*
         * 이름을 입력하세요 >>> 김일
         * 키(cm)를 입력하세요 >>> 172
         * 몸무게(kg)를 입력하세요 >>> 68
         * 김일 님의 BMI 지수는 23.0으로 과체중입니다.
         * */

    }

}

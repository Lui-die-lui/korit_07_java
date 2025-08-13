package org.example;

import ch18_static.Builders.Person;

import java.util.Scanner;

public class BmiCalc {


    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요. >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요. >>> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

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

    // call1() 유형에서 height를 scanner로 받았을때, 바로 0.01을 곱해서
    public void calcBmi(String name, double height, double weight) {
        // method 정의 할 때 argument와 parameter 개념을 혼란스러워하는 경우가 있는데,
        //  정의 -> 호출이라는 순서를 생각할 때,
        // 소괄호 내에 있는 매개변수 목록들은 자료형 + (임의의) 변수명 으로 이루어져
        // 있기 때문에 '선언'이라고 간주해주면 됨.
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요. >>> ");
        name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요. >>> ");
        height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

        double bmi = weight/(height*height); // 지역 변수

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

    public void calcBmi(org.example.Person person) {
        // getter 사용시 코드가 길어지기 때문에 지역변수롤 선언
        String name = person.getName();
        double height = person.getHeight() * 0.01;
        double weight = person.getWeight();
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


//        System.out.println("--------객체 생성 후 call3() 활용 방법---------");
//        org.example.Person person4 = new org.example.Person("김사",172,68);
//        System.out.println(person4);
//        // builder 패턴 사용 개게 생성 방법
//
//        org.example.Person person5 = org.example.Person.builder()
//                .name("김오")
//                .height(172)
//                .weight(68)
//                .build();
//        System.out.println(person5);
//
//        BmiCalc bmiCalc = new BmiCalc();


    }

}

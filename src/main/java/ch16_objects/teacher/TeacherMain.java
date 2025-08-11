package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수","코리아아이티");
        Teacher teacher2 = new Teacher("안근수","코리아아이티");
        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1); // true
        // 이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다는것
        // Teacher에서 .equals()를 재정의하기 전에는 false가 떴었습니다.
        // 그때의 경우는 teacher1과 teacher2의 주소지까지 확인하요
        // 같은지 아닌지의 여부를 판단했다면.
        // 재정의 이후에는 field에 입력된 데이터가 동일한지만을 체크하기 때문

        Class tClass = teacher1.getClass(); //
        System.out.println(tClass); //class ch16_objects.Teacher.Teacher
        System.out.println(tClass.getSimpleName()); // 결과값 : Teacher
        System.out.println(teacher1.getClass().getSimpleName()); // 결과값 : Teacher
        // 어느수준까지 그냥 작성할지, 변수에 대입할지를 조직에 따라,
        // 성향에 따라서 결정

        Field[] fields = tClass.getDeclaredFields(); // Field 배열형 자료형
//        System.out.println(fields); // 주소지 출력

        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName() + "\n");
        }

         // 동일한 방식으로 향상된 for문 작성

        for (Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 + 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName() + "\n");
        }

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("메서드 명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType()+ "\n");
        }

        // 새로운 객체 만들건데 주의할것 - 불러올때 가까운 클래스로 출력됨
        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("안근수", "'코리아아이티");
        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2); // 결과값 : false - 데이터가 무조건 같다고 하더라도 차이가 있음 - 다른 클래스에 속해있기 때문에

//        System.out.println(teacher3 instanceof Teacher);
        // Teacher3의 자료형은 ch16_objects.Teacher 이지

        // ch16_objects.teacher.Teacher가 아님


    }
}

package ch09_Classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    // default로 생성됐을 때는 안내문구를 쓸 수 없음
    // "기본 생성자로 객체를 생성했습니다."
    // 커스텀 가능
    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    // 좌 상단 메뉴바 -> 코드(code) -> 생성(generate)
    // alt + ins
    public Student2(int studentCode) {
        // 대입 전 까지 별개의 값임
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;

    }

    // 자동완성으로 알아서 생성자
    // 동일한 sout 문구 전부 다 집어넣기
    public Student2(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
}

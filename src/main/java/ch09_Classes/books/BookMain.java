package ch09_Classes.books;

public class BookMain {
//    문제: Book 클래스 생성 및 활용하기
//    Book 클래스를 작성하시오. 필드는 다음과 같다.
//
//     String title
//    String author
//    int pages
//
//    기본 생성자를 정의하고, 객체가 생성될 때
//"기본 생성자로 Book 객체를 생성했습니다."를 출력하시오.
//
//    String title을 매개변수로 받는 생성자를 정의하고,
//"title 매개변수 생성자로 Book 객체를 생성했습니다."를 출력하시오.
//
//    String title, String author를 매개변수로 받는 생성자를 정의하고,
//            "title, author 매개변수 생성자로 Book 객체를 생성했습니다."를 출력하시오.
//
//    String title, String author, int pages를 매개변수로 받는 생성자를 정의하고,
//"title, author, pages 매개변수 생성자로 Book 객체를 생성했습니다."를 출력하시오.
//
//    BookMain 클래스를 만들어서 아래와 같이 객체를 생성하시오.
//
//    book1 - 기본 생성자 사용
//
//    book2 - title만 사용 ("Java Programming")
//
//    book3 - title, author 사용 ("Java Programming", "홍길동")
//
//    book4 - title, author, pages 사용 ("Java Programming", "홍길동", 350)
//
//    책 정보를 출력하는 showBookInfo() 메서드를 void형으로 정의하고,
//    책 제목, 저자, 페이지 수를 출력하시오.
//
//    BookMain에서 각 객체의 showBookInfo()를 호출하여 정보가 출력되도록 하시오.

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "홍길동";
        book1.pages = 350;

        Book book2 = new Book("Java Programming");
        book2.author = "홍길동";
        book2.pages = 350;

        Book book3 = new Book("Java Programming","홍길동");
        book3.pages = 350;

        Book book4 = new Book("Java Programming","홍길동",350);

        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
        book4.showBookInfo();
    }


}

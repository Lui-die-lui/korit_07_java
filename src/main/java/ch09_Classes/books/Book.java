package ch09_Classes.books;

public class Book {
    // Book 클래스 필드를 먼저 만들어줌 - 매개변수로 받을 값들
    String title;
    String author;
    int pages;

    public Book() {
        System.out.println("기본 생성자로 Book 객체를 생성했습니다.");
    }

    public Book(String title) {
        System.out.println("title 매개변수 생성자로 Book 객체를 생성했습니다.");
        this.title = title;
    }

    public Book(String title, String author) {
        System.out.println("title, author 매개변수 생성자로 Book 객체를 생성했습니다.");
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int pages) {
        System.out.println("title, author, pages 매개변수 생성자로 Book 객체를 생성했습니다.");
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // 책 정보를 출력하는 showBookInfo() 메서드를 void형으로 정의
    void showBookInfo() {
        System.out.println();
        System.out.println("첵 재목 : " + title
                + "\n저자 : " + author
                + "\n페이지 수 : " + pages );
    }



}

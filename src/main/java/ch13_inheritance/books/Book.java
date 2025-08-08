package ch13_inheritance.books;
/*
   1. private title / author
   2. AllArgsConstructor
   3. Setter / getter
   4. shouwInfo() 메서드를 call1()타입

   EBook 클래스에서
   EBook 클래스는 Book을 상속
   자식 고유의 필드로 private double fileSize / String format


   제목 :
   저자 :
   파일 크기 :
   파일 형식 :


  BookMain - Book 클래스의 인스턴스 생성
  Getter를 활용하여
  이 책의 제목은 자바의 정석입니다.
  이책의 저자는 남궁성입니다.
  book1.showInfo() 를 호출하여
  제목 : 자바의 정석
  저자 : 남궁성

  EBook 클래스 인스턴스 생성
  스프링 입문 / 이강준 / 5.2 / EPUB으로 생성
  그 다음 setter 활용하여 파일 형식을 PDF로 변환
  getter 를 활용하여
  이 전자책의 포맷은 PDF입니다. 를 출력
  eBook1.showInfo(); 를 실행하여
  제목 : 스프링 입문
  저자 : 이강준
  파일 크기 : 5.2
  파일 형식 : PDF

*/
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public void showInfo() {
        System.out.println("제목 : " + this.getTitle() + "\n저자 : " + this.getAuthor() );
    }
}

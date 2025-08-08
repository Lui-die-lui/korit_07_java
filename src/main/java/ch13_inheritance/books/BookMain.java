package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석","남궁성");
        String title = book1.getTitle();
        String author = book1.getAuthor();
        System.out.println("이 책의 제목은 " + title + "입니다.");
        System.out.println("이 책의 저자는 " + author + "입니다.");
        book1.showInfo();

        System.out.println();

        Ebook ebook1 = new Ebook("스프링 입문", "이강준",5.2,"EPUB");
        ebook1.setFormat("PDF"); // setter를 이용해 값을 덮어씀
        String format = ebook1.getFormat();
        System.out.println("이 전자책의 포맷은 " + format + "입니다.");
        ebook1.showInfo();
    }
}

package ch13_inheritance.books;

public class Ebook extends Book{

    private double fileSize;
    private String format;

    public Ebook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

//    public double getFileSize() {
//        return fileSize;
//    }
//
//    public void setFileSize(double fileSize) {
//        this.fileSize = fileSize;
//    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void showInfo() {
        super.showInfo(); // 부모 클래스 상속 (오버라이딩)
        System.out.println("파일 크기 : " + fileSize + "MB" + "\n파일 형식 : " + format );
    }

}

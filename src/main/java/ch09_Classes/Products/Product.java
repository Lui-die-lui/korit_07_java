package ch09_Classes.Products;

public class Product {

    int productNum = 0;
    String productName = "";

    public Product() {
    }

    public Product(int productNum) {
        this.productNum = productNum;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    public void showInfo() {
        System.out.println();
        System.out.println("시리얼 넘버 : " + productNum + "\n제품 타이틀 : " + productName);
    }
}

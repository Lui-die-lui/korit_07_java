package ch09_Classes.Products;

public class ProductMain {
    public static void main(String[] args) {
        // 기본 생성자를 통한 생성
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";


        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor)
        Product product2 = new Product(987654);
        product2.productName = "다이소 충전기";

        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 156957;


        // 매개변수 생성자를 통한 생성(AllArgsConstructor)
        Product product4 = new Product(951753,"GFlip6");


        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }

}

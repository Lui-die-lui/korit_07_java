package ch13_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item = new Item("일반 상품", "일반 카테고리");

//        Product product = new Product("일반 상품","일반 카테고리",10000,0 );
        System.out.println("이 상품은 " + item.getName() + "입니다.");
        System.out.println("이상품은 " + item.getCategory() + "입니다.");

        Product product = new Product("전자제품", "가전 제품" ,100000, 10);
        product.setCategory("백색 가전 제품");
        System.out.println("해당 제품은 " + product.getCategory() + "입니다.");



    }
}

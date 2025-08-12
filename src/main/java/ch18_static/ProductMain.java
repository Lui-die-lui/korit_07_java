package ch18_static;


public class ProductMain {
    public static void main(String[] args) {

        // static 메서드의 호출은 객체를 생성하지 않은 시점에도 사용가능
        // 객체 생성 전
//        System.out.println(Product.getTitle());




//        Product product1 = new Product();
//        product1.setName("아이스 아메리카노");
//        System.out.println(product1.getName());
//        System.out.println(Product.getCount());

        // 클래스 수준이기 때문에
//        System.out.println(Product.getCount());

        Product product1 = new Product(); // 호출이 되면 1 증가시켜줌
        System.out.println("일반 필드 조회 : " + product1.getInstanceCount()); // 1
        System.out.println("정적 필드 조회 : " + Product.getCount());

        Product product2 = new Product(); // 호출이 되면 1 증가시켜줌
        System.out.println("일반 필드 조회 : " + product2.getInstanceCount()); // 1
        System.out.println("정적 필드 조회 : " + Product.getCount());

        Product product3 = new Product(); // 호출이 되면 1 증가시켜줌
        System.out.println("일반 필드 조회 : " + product3.getInstanceCount()); // 1
        System.out.println("정적 필드 조회 : " + Product.getCount());
    }
}

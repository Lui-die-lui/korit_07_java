package Example;

class Factory {

    private static String factoryName;

    public static String getFactoryName() {
        return factoryName;
    }

}

public class FactoryMain {
    public static void main(String[] args) {
        System.out.println(Factory.getFactoryName());
    }
}

package ch19_generic.WildCard;

public class Main {
    // 매서드 정의 영역
    // 현재 AnimalData 에서는 필드로 들어온 객체가 Animal 클래스의 서브 클래스 인지
    // 아닌지를 구분할 수 없기 때문에
    // 이를 판단하는 메서드를 Main에 정의하도록 하겠습니다.
    //AnimalData<? extends Animal> -> 리턴타입 / Animal클래스 상속 받은것만
    public AnimalData<? extends Animal> getAnimal(int flag) {
        if(flag == 1) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        // 1,2 에 해당되지 않으면 return null
        return null;
    }

    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        // 현재 상황에서는 AnimalData에 Car 객체가 들어가있지만 오류가 발생하지 않음.
        // Generic 개념 때문에 T에는 어떤 클래스도 들어갈 수 없기 때문.

        animalData1.showData();
        animalData2.showData();
//        animalData3.showData(); -> 호출에는 문제가 생김(오류 발생)
        /*
            animalData3.showData() 에서 오류가 발생함을 알 수 있음
            AnimalData 클래스에서 정의된 메서드 로직을 확인해보면
            필드(Animal)로 형변환 시키는데, Car 클래스의 인스턴스를
            Animal로 형변환 시키는 것이 불가능하기 때문

            즉 제네긱 '만을' 사용했을 때 생길 수 있는 문제점
        */
        System.out.println();
        // .getAnimal() 메서드를 호출할거라서 객체 생성하겠습니다.
        Main main = new Main();
        AnimalData<? extends Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData6 = main.getAnimal(3);

        /*
            .getAnimal() 을 정의하지않았다고 가정한다면 현재 위 변수의 필드에 어떤 클래스 객체가 들어갔는지 모름

            animalData6 필드에는 뭐가 들어가야할까 - 필드가 채워져야 생성자가 만들어지는데 null값이라서 없다
         */

        if (animalData4 != null) {
            animalData4.showData();
        }

        if (animalData5 != null) {
            animalData5.showData();
        }

        if (animalData6 != null) {
            animalData6.showData();
        } else {
            System.out.println("아무것도 없습니다.");
        }

    }
}

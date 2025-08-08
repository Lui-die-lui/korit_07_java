package ch13_inheritance;

/*
    상속을 지시하는 키워드 extends
*/

public class Tiger extends Animal { // 자식 클래스 extends 부모 클래스
    // field와 getter / setter는 없지만
    // Tiger의 고유 베서드는 또 따로 정의 가능
    // 고유메서드 # 1
    public void hunt() {
        System.out.println(getAnimalName() + "이 사냥을 합니다.");
    }
    // 고유메서드 # 2 오버로딩 적용
    public void hunt(String prey) { // 오버로딩
        System.out.println(getAnimalName() + "이" + prey + "사냥을 합니다."); // private 이기 때문에 getter
    }


    @Override       // 얘가 붙어있으면 해당 메서드는 상속 받은 것
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge); // 명시되어있지 않기 때문에 부모 클래서에서 가져옴(super)
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    // 재정의 된 methods : 부모 메서드의 결과값과 다르게 작성한다면 전부 재정의에 해당함
    @Override
    public String getAnimalName() {
        return super.getAnimalName() + "님"; // 부모 결과값과 다르게 작성된 부분
    }

    @Override // method 명만 동일하고 전부 재정의 - animal,tiger 전부 move가 있다는 암묵적인 부분
    public void move() { // 부모거 무조건 그대로 쓸 필요 없음
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}


package ch15_casting.centralControl;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray; // upcasting을 통해 power의 자식들도 들어감

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 메서드 정의
    public void addDevice(Power device) {
        // 지금 우리는 Power의 자식 클래스에 해당하는 이니스턴스들을
        // deviceArray라는 필드에 추가하고 싶습니다.
        // 그러면 CentralControlMain에서 객체 생성을 할 때
        // deviceArray의 최종 indexNumber는 고정되게 되는데,
        // 다 들어차있는 배열에 덮어쓰기가 일어나서도 안되고 (즉 기준 element를 삭제하면 안됨)
        // 그렇다면 필요한 기능이 배열 내에 null값이 존재하는지에 대한 체크가 필요하다고 할 수 있음
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;       // private으로 적용해놔서 method를 경유
        // public이면 main에서 그냥 호출 가능
        System.out.println("장치가 연결되었습니다.");
    }

    private int checkEmpty() { // 메서드인데 private 씀.
        // main에서 굳이 몇개나 전자제품을 더 추가할 수 있는지 알 필요가 없을것 같기 때문
        // dviceArray라는 배열에서 비어있는 index를 추출해주기만 하면 됨
        // i++ 이니까 가장 빨리 만나게 되는 null값을 return하게 됨
        for (int i = 0; i < deviceArray.length ; i++) {
            if (deviceArray[i] == null) {
                return i;           // 즉 배열 내부에 element가 없다면 그 주소지를 return
            }
        }
        return -1; // 인덱스는 0부터 / 음수는 없음 - 결과값이 없다는 의미로 쓰임
        /*
            Java의 Index 넘버에는 음수값이 없기 때문에 (python에서는 마이너스인덱스 개념이 있는데 시험에 자주 출제)
            실패를 나타낼 때 -1을 쓰는 경우가 많음
            하지만 0과 너무 가까운 수이다보니 -100이든지, 아니면 return값으로 나올 수 없을만한 음수값을 지정하는 경우도 있는데,
            나중에 있는 addDevice() 메서드에서 if(checkEmpty())
        */
    }
}

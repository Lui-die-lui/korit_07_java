package ch15_casting.centralControl;

public class CentralControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        // 참조자료형의 배열을 생성(비어있는거)
//        Power[] powers = new Power[5]; // 인덱스 (방) 의 넘버를 지정해줘야함

        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에 예시만 보여줌
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()}; - 애초에 3개짜리 배열만 만들어짐

        // 저희는 그래서 centralControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을 집어넣었습니다.
        CentralControl centralControl = new CentralControl(
                new Power[10]
        );


        centralControl.addDevice(computer1);         // 여기서 (암시적) 업캐스팅이 이루어짐
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(printer1);

        centralControl.powerOn();
        centralControl.powerOff();

        System.out.println("-----------------------------------");
//        centralControl.showInfo();

//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(i + 1);
//        }
//        for (int i = 0; i < 10 ; i++) {
//            if ((i + 1)% 2 != 1 ) {
//                System.out.println(i);
//            }
//        }
//
//        for (int i = 0; i < 10 ; i++) {
//            if ((i + 1) % 2 == 1 ) {
//                continue; // 해당 반복을 종료하고 다음 반복을 실행
//            }
//            System.out.println(i);
//        }


        /*
        * mouse / LED 만들어서
        * 클래스 정의하고  on off 구현
        * main와서 각 객체 생성한 다음에
        * CentralControl 객체에 집어넣기
         * */

//        centralControl.showInfo();
//        speaker1.changeEqual();


        centralControl.powerOn();
        centralControl.performSpecificMethod();
        printer1.off();
    }
}

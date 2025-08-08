package ch11_access_modifier.bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
    Bank bank1 = new Bank(123456, "홍길동", 100000 , 1234);
    Bank bank2 = new Bank(987654, "신사임당", 600000 , 1234);
    bank1.showAccountInfo();
        System.out.println();
    bank2.showAccountInfo();
        System.out.println();

    bank1.deposit(50000,1234);
    bank1.withdraw(20000,1234);
    bank1.withdraw(10000, 1234);
        System.out.println();

    bank2.deposit(10000,1234);
    bank2.withdraw(20000,1234);


    // 잔액이 마이너스이 계좌 객체를 생성하는 방법
    Bank bank4 = new Bank(13579,"김사",-3000, 7893456);
    bank4.showAccountInfo(); // 우회해서 다른 값이들어갈 수도 있음

//    Scanner scanner = new Scanner(System.in);
//        System.out.print("비밀번호를 입력하세요. : ");
//        bank1.pinNumber = scanner.nextInt();
//        System.out.print("입금할 금액을 입력하세요. : ");
//        amount = scanner.nextInt();
//        bank1.deposit(pinNumber, amount);
    }
}

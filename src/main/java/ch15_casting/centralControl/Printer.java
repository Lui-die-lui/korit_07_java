package ch15_casting.centralControl;

public class Printer implements Power{
    @Override
    public void on() {
        System.out.println("프린터기의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("프린트터기의 전원을 끕니다.");
    }

    public void print() {
        System.out.println("프린터기가 인쇄를 합니다.");
    }
}

package ch14_abstraction.interfaces;

public class PowerButton extends Button {
    // 필드 선언
    private boolean status;

    @Override // 추상 메서드를 만들어줬기 때문에
    public void onPressed() {
        if(status) {
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }

    }


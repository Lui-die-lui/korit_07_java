package ch14_abstraction.interfaces;

public class ChannelUpButton extends Button {

    @Override
    public void onPressed() { // 한 번 눌렀을 때
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public String onUp() { // 계속 눌러서 올라감
        return "채널을 계속 " + super.onUp();
    }
}

// 현재 작성 방안에서는 채널 올려주는 버튼 / 내려주는 버튼 / 전원 버튼이 각각 있는것.
// 각각 따로있는 버튼들을 하나로 모아주는 클래스 작성할 예정
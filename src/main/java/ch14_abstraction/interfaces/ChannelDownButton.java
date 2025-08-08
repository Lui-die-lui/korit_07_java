package ch14_abstraction.interfaces;

public class ChannelDownButton extends Button {


    @Override
    public void onPressed() { // 한번 눌렀을 때
        System.out.println("채널을 한 칸 내립니다.");
    }

    @Override
    public void onDown() { // 계속 눌렀을때 내려감
        System.out.println("채널을 계속 내립니다.");
    }

}


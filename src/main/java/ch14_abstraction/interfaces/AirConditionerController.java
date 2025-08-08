package ch14_abstraction.interfaces;
/*
    PowerButton 포함
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한 번 누를 때마다 모드가 변환되어야 함
    제습 -> 냉방 -> 난방 -> 자동
    냉방 -> 난방
    : press 버튼을 활용하여 한 번 누르면 그 다음 모드로 이동 - powerButton 로직 활용

    AllArgsConstructor 정의

*/
public class AirConditionerController {
    private PowerButton powerButton; // 접근지정자 클래스명 객체명
    private TempDownButton tempDownButton;
    private TempUpButton tempUpButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(PowerButton powerButton,
                                    TempDownButton tempDownButton,
                                    TempUpButton tempUpButton,
                                    ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.tempDownButton = tempDownButton;
        this.tempUpButton = tempUpButton;
        this.modeChangeButton = modeChangeButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTempDownButton() {
        tempDownButton.onPressed();
    }

    public void onDownTempDownButton() {
        tempDownButton.onDown();
    }

    public void onPressedTempUpButton() {
        tempUpButton.onPressed();
    }

    public void onUpTempUpButton() {
        System.out.println(tempUpButton.onUp());
    }

    public void onPressedModelButton() {
        modeChangeButton.onPressed();
    }


}


package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, channelDownButton, channelUpButton);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();

        // 생성자 - 객체를 생성할때 만들어내는 특별한 메서드
        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemotecontroller 객체를 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );
//
//        tvRemoteController.onPressedPowerButton();
//
//        System.out.println();
//
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//
//        tvRemoteController.onPressedChannelUpButton();
//        tvRemoteController.onUpChannelUpButton();
//
//        System.out.println(tvRemoteController.onUpChannelUpButton02()); // -> 이런 방법도 있음
//
//        System.out.println();
//
//        tvRemoteController.onPressedVolumeDownButton();
//        tvRemoteController.onDownVolumeDownButton();
//
//        tvRemoteController.onPressedVolumeUpButton();
//        tvRemoteController.onUpVolumeUpButton01();
//
//        System.out.println(tvRemoteController.onUpVolumeUpButton02());

        AirConditionerController airConditionerController1
                = new AirConditionerController(new PowerButton(),
                new TempDownButton(),
                new TempUpButton(),
                new ModeChangeButton());

        airConditionerController1.onPressedPowerButton();
        airConditionerController1.onPressedTempDownButton();
        airConditionerController1.onDownTempDownButton();
        airConditionerController1.onPressedTempUpButton();
        airConditionerController1.onUpTempUpButton();
        airConditionerController1.onPressedModelButton();
        airConditionerController1.onPressedModelButton();
        airConditionerController1.onPressedPowerButton();
    }



}

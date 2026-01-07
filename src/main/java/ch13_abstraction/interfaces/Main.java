package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        powerButton.onPressed();
        /*
            버튼들을 만들어서 Main에서 객체 생성을 한 후에
            메서드를 호출하는 것은 가능합니다.
            그런데 Main에서 매번 객체를 생성해줘야 한다는 문제점이 있습니다.
         */
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );
        /*
            리모컨 객체의 argument로 PowerButton 생성자를 집어넣었습니다.
            생성자의 정의는 : 객체를 생성할때 호출되는 특별한 메서드 이므로 ,
            new PowerButton(), 을 통해서 객체가 생성되었다고 볼 수 있습니다.
            -> 하지만 객체명이 없는 상태라고 볼 수 있겠네요.

            근데 이상까지 이해했다는 전제하에 TvRemoteController 클래스를
            확인해보시면
            this.powerButton = powerButton이라고 되어 있습니다.
            그 말은 argument로 들어온 new PowerButton()이
            매개변수인 PowerButton powerButton으로 치환되고,
            그것이  TvRemoteController의 field인 powerButton 에
            대입된다는 것을 확인할 수 있습니다.
         */
//        tvRemoteController.powerButton.onPressed();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println(tvRemoteController.onUpChannelUpButton());
        tvRemoteController.onPressedChannelUpButton();

        /*
            VolumeDownButton 클래스를 정의하시오.
            VolumeUpButton 클래스를 정의하시오

            그리고 Main에서
            tvRemoteController.onPressedVolum
         */
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton());
        tvRemoteController.onPressedPowerButton();
    }
}

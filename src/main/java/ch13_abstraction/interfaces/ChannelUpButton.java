package ch13_abstraction.interfaces;

public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다. ");
    }

    @Override
    public String onUp() {
        return "채널을 계속 " + super.onUp();
    }
}
/*
    현재까지의 작성을 고려해보면 채널 올리는 버튼 / 내리는 버튼 / 전원 버튼이
    각각 있습니다.
 */

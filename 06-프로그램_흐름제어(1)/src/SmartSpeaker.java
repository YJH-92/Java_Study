public class SmartSpeaker extends SmartDevice{
    public SmartSpeaker(String name, boolean isOn) {
        super(name, isOn);
    }

    public void playMusic(String song) {
        if (getIsOn()) {
            System.out.println(getName() + "에서 '" + song + "' 음악을 재생합니다. ");
        } else {
            System.out.println(getName() + "이 꺼져 있어 음악을 재생할 수 없습니다. ");
        }
    }
}

public class SmartLight extends SmartDevice {
    public SmartLight(String name, boolean isOn) {
            super(name, isOn);
        }
            
    public void changeColor(String color) {
        if (getIsOn()) {
            System.out.println(getName() + "조명" + color + "으로 바뀝니다. ");
        } else {
            System.out.println(getName() + "이 꺼져 있어 색상을 변경할 수 없습니다. ");
        }
    }
}
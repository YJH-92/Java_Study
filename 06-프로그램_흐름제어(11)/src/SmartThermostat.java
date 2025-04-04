public class SmartThermostat extends SmartDevice{
    public SmartThermostat(String name, boolean isOn) {
        super(name, isOn);
    }

    public void setTemperature(int degree) {
        if (getIsOn()) {
            System.out.println(getName() + "의 온도를 " + degree + "도로 설정합니다. ");
        } else {
            System.out.println(getName() + "이 꺼져 있어 온도를 설정할 수 없습니다. ");
        }
    }
}
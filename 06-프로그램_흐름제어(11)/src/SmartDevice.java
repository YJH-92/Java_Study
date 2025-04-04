public class SmartDevice {
    private String name;
    private boolean isOn;


    public SmartDevice(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }
//====↓ ↓ ↓ ↓ ↓=========↑ ↑ ↑ ↑ ↑========↓ ↓ ↓ ↓ ↓========================
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public boolean isIsOn() {return this.isOn;}

    public boolean getIsOn() {return this.isOn;}
    public void setIsOn(boolean isOn) {this.isOn = isOn;}
//========================================================================
@Override
public String toString() {
    return "{" + "name='" + getName() + "'" +
    ", isOn='" + isIsOn() + "'" +
    "}";
}
//========================================================================
    public void turnOn() {
        isOn = true;
        System.out.printf("%s이 켜졌습니다.\n", this.name);
    }
//========================================================================
    public void turnOff() {
        isOn = false;
        System.out.printf("%s이 꺼졌습니다.\n", this.name);
    }
//========================================================================
    public void showStatus() {
        
        String status = this.isOn ? "ON" : "OFF";
        
            System.out.printf(name + "%s 상태: %s\n", this.name, status);
        }
    }
//========================================================================
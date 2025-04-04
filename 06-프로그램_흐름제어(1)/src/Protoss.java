public class Protoss {
    private String name;
    private int hp;
    private int speed;
    private int dps;


    public Protoss(String name, int hp, int speed, int dps) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.dps = dps;
    }
    


    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getHp() {return this.hp;}
    public void setHp(int hp) {this.hp = hp;}

    public int getSpeed() {return this.speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public int getDps() {return this.dps;}
    public void setDps(int dps) {this.dps = dps;}

    public void move(String position) {
        System.out.printf("%s(이)가 %s까지 이동합니다. \n",this.name, position);
    }

    public void attack(String target) {
        System.out.printf("%s(이)가 %s(을)를 공격합니다. >> 데미지: %\n", this.name, target,this.dps);
    }

    public String toString() {
        return "{"+
        "name='"+getName()+"'" +", hp='"+getHp() + "'"+
        ", speed='" + getSpeed() +"'" +
        ", dps='" +getDps()+"'" + "}";
    }
}

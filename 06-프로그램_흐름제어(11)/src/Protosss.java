public abstract class Protosss {
    
    private String name;
    private int hp;
    private int speed;
    private int dps;
///////////////////////////////////////////////////////////    
    public Protosss(String name, int hp, int speed, int dps) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.dps = dps;

        System.out.printf(">> 유닛이 생성되었습니당. --> 이름 : %s, 체력: %d, 공격력: %d\n", name, hp, dps);
    }

///////////////////////////////////////////////////////////
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public int getDps() {return dps;}
    public void setDps(int dps) {this.dps = dps;}
/////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Protosss [name=" + name + ", hp=" + hp + ", speed=" + speed 
        + ", dps=" + dps + "]";
    }
/**
 * 지정된 위치로 이동한다. (추상메서드)
 * @param position 이동할 위치
 */
    public abstract void move(String position);

/**
 * 지정된 대상을 공격한다. (추상 메서드)
 * @param target 공격할 대상
 */
    public abstract void attack(String target);













}

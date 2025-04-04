public class Vulture {
    private String name;
    private int hp;

    String getName(){
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }

    int getHp() {
        return this.hp;
    }

    void setHp(int hp) {
        if (hp < 1){
            hp= 1;
        }
        this.hp = hp;
    }
    public Vulture(String name, int hp) {
        this.setName(name);
        this.setHp(hp);
        System.out.printf("[%s]Alright! bring it on!\n", this.name);
    }

    void state(){
        System.out.printf("[%s] hp: %d\n",this.getName(),this.getHp());
    }

    void levelUp() {
        this.setHp(getHp() + 5);
        System.out.printf("[%s] 레벨업을 하여 체력이(+5)가 증가합니다\n",this.getName());
    }

    void attacked(int enemyAttack) {
        this.setHp((this.getHp ()- enemyAttack));
    }
}

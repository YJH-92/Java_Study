class Zealot {
    int hp;
    int dps;
    //int enemyAttack;
    //int attacked;

    void state() {
        System.out.printf("상태확인 >>> hp: %d, dps: %d\n", hp, dps);
    }

    void levelUp() {
        hp += 10;
        dps += 2;
        System.out.printf("레벨업을 하여 체력(+10), 공격력(+2)이 증가합니다.");
    }
    void attacked(int enemyAttack) {
        hp -= enemyAttack;
        System.out.printf("%d의 공격을 받아 hp가 %d만큼 감소합니다.\n", enemyAttack, hp);
    }

    //void attacked(){
    //dps += 0.1;
    //System.out.printf("%d의 공격을 하여 %d만큼 공격력이 증가하셨습니다.\n", attacked, dps);
    //}


    //void enemyAttack() {
       // hp -= 30;
       // System.out.printf("%d의 공격을 받아 hp가 %d만큼 감소합니다.\n", enemyAttack, hp);
    //}
}

public class Ex03_ZealotSimulator {
    public static void main(String[] args) {
        Zealot zealot1 = new Zealot();
        zealot1.hp = 100;
        zealot1.dps = 20;

        zealot1.state();
        zealot1.attacked(30);
        zealot1.state();
        zealot1.levelUp();
        zealot1.state();
    }
}

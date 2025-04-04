public class Ex05_그룹지정 {
    public static void main(String[] args) {
        Protoss[] p = new Protoss[5];

        p[0] = new Zilot("질럿1호", 130, 90, 100);
        p[1] = new Dragon("드라군1호", 150, 80, 200);
        p[2] = new Zilot("질럿2호", 120, 100, 150);
        p[3] = new Dragon("드리군2호", 170, 110, 240);
        p[4] = new Zilot("질럿3호", 110, 130, 120);

        for(int i = 0; i<p.length; i++) {
            p[i].move("저그 본진");
            p[i].attack("저그 본진");

            if(p[i] instanceof Zilot) {
                Zilot z = (Zilot) p[i];
                z.swardAttack("저그 본진");
            } else if (p[i]instanceof Dragon) {
                Dragon d = (Dragon) p[i];
                d.fireAttack("저그 본진");
                
            }
        }
    }
}

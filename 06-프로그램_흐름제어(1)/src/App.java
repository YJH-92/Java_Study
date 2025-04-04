public class App {
    public static void main(String[] args) {
        

        Zilott z = new Zilott("질럿 1호", 150, 130, 100);
        z.move("저그 멀티");
        z.attack("저그 멀티");
        System.out.println("------------");

        Dragun d = new Dragun("드라군 1호", 200, 150, 100);
        d.move("저그 멀티");
        d.attack("저그 멀티");
        System.out.println("------------");

/**
 * 
 * @return
 */
        Protosss p1 = new Zilott("질럿1호", 150, 130, 100);
        Protosss p2 = new Dragun("드라군1호", 200, 150, 100);
/**
 * 
 */
        p1.move("저그 멀티");
        p1.attack("저그 멀티");
        p2.move("저그 멀티");
        p2.attack("저그 멀티");
    }
}

public class Default {
    public static void main(String[] args) {
        Animal [] d = new Animal[3];

        d[0] = new Lion();
        d[1] = new Elephant();
        d[2] = new Penguin();
        System.out.println();

        for (int i=0; i<d.length; i++) {
            d[i].move();
            d[i].makeSound();
            if(d[i] instanceof Penguin){
                Penguin p = (Penguin) d[i];
                p.swim();
            }
        }
    }
}
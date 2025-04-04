public class Emart {
    public static void main(String[] args) {
        Product []d = new Product[3];

        d[0] = new Electronics();
        d[1] = new Clothing();
        d[2] = new Food();

        for(int i= 0; i<d.length; i++){
            d[i].showInfo();
            
            if (d[i] instanceof Food){
                Food f = (Food) d[i];
                f.checkExpiration();
            }
        }
    }
}

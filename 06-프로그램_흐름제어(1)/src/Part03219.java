public class Part03219 {
    public static void main(String[] args) {
        int[] prise = {38000, 20000, 17900, 17900};
        int[] qty = {6, 4, 3, 5};

        int count = 0;

        for (int i=0; i<prise.length; i++) {
            if (prise[i] * qty[i] >= 80000){
                count++;
            }
        }
        System.out.println(count);
    }
}

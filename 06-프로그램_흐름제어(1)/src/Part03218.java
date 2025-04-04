public class Part03218 {
    public static void main(String[] args) {
        int[] prise = {38000, 20000, 17900, 17900};
        int[] qty = {6, 4, 3, 5};

        int max = prise[0] *qty[0];

        for (int i =1; i<prise.length; i++){
            if (max < prise[i]* qty[i]){
                max= prise[i] *qty[i];
            }
        }
        System.out.println("가장 높은 상품금액: " +max + "원");
}
}
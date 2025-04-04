public class Part03216 {
    public static void main(String[] args) {
        int[] worktime = {7, 5, 5, 5, 5, 10, 7};
        int pay = 0;

        for (int i = 0; i < worktime.length; i++){
            if (i < 4) {
                pay += worktime[i] * 4500;
                } else {
                    pay += worktime[i] *5200;
                }
                System.out.println("일주잉 간의 총 급여: " + pay +"원" );
            }
        }
    }
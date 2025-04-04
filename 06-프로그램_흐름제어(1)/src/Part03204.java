public class Part03204 {

    public static void main(String[] args) {
        int[] piont ={98, 72, 86, 90, 80, 77};

        int sum = 0;

        for (int i = 0; i < piont.length; i++) {
            sum+= piont[i];
        }
        int avg = sum / piont.length;

        System.out.printf("촐점은 %d, 평균은 %d 입니다.\n", sum, avg);
    }
}
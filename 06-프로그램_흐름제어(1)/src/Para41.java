import java.util.Scanner;

public class Para41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int max = reader.nextInt();
        reader.close();

        int oddSum = 0;   //1~max 범위 안에서 홀수의 합을 위한 변수
        int evenSum = 0;  //1~max 범위 안에서 짝수의 합을 위한 변수

        for (int i = 1; i <= max; i++) {
            //어떤 수를 2로 나누어 나머지가 0이면 그 수는 짝수
            if(i % 2 == 0) {
                System.out.printf("%d는 짝수\n", i);
                evenSum += i;
            } else {
                System.out.printf("%d는 홀수\n", i);
                oddSum += i;
            }
        }
        System.out.printf("1~%d까지 홀수들의 합: %d\n", max, oddSum);
        System.out.printf("1~%d까지 짝수들의 합: %d\n", max, evenSum);
    }
}

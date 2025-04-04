public class Part03214 {
    public static void main(String[] args) {
        int[]arr={1, 9, 4, 2, 5};

        for(int i =0; i<arr.length/2; i++){
            int jh = arr.length - i -1;

            int tmp = arr[i];
            arr[i]= arr[jh];
            arr[jh] = tmp;
        }
        //for(int i =0; i<arr.length; i++) {
        //System.out.printf("arr[%d] = %d \n", i, arr[i]);
        //} 내가 틀린부분
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d]=%d\n",i, arr[i]);
        }
    }

}

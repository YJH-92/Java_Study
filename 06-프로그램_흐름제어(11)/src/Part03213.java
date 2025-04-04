public class Part03213 {
    public static void main(String[] args) {
        int [] arr = {1, 9, 4, 2, 5};
        int [] copy = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i]=arr[i];
            
            System.out.printf("copy[%d]=%d\n",i,copy[i]);
        }
    }
}

class staticCounter {

    static int count = 0;

    public staticCounter() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

//===================================================

public class Ex02_StaticCounter {
    public static void main(String[] args) {
        staticCounter c1 = new staticCounter();
        staticCounter c2 = new staticCounter();

        System.out.printf("c1의 count: %d \n", c1.getCount());
        System.out.printf("c2의 count: %d \n", c2.getCount());
    }
}

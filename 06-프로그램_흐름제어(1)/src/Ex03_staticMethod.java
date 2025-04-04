class staticCounter2 {
    static int count = 0;
    boolean created = false;

    public staticCounter2 () {
        count++;
        created = true;
    }


    public int getNomal() {
        created = true;
        return count;
    }
    
    public static int getStatic() {
        return count;
    }
}

//============================================================================

public class Ex03_staticMethod {
    public static void main(String[] args) {
        System.out.printf("전체 객체의 수: %d \n", staticCounter2.count);
        System.out.println("------");

        staticCounter2 c1 = new staticCounter2();
        staticCounter2 c2 = new staticCounter2();

        System.out.printf("c1의 getNormal() 리턴값: %d\n",c1.getNomal());
        System.out.printf("c2의 getNormal() 리턴값: %d\n",c2.getNomal());
        System.out.println("------");

        System.out.printf("c1의 getStatic() 리턴값: %d\n",staticCounter2.getStatic());
        System.out.printf("c2의 getStatic() 리턴값: %d\n",staticCounter2.getStatic());
        System.out.println("------");

        System.out.printf("전체 객체의 수: %d\n", staticCounter2.count);
    }
}

public class Ex04_SingleTonPattern {
    public static void main(String[] args) {
        int x = 100;
        int y = 50;

        Calc c1 = new Calc();
        System.out.printf("%d + %d = %d\n", x, y, c1.plus(x, y));

        Calc c2 = new Calc();
        System.out.printf("%d - %d = %d\n", x, y, c2.minus(x, y));

        Calc c3 = new Calc();
        System.out.printf("%d * %d = %d\n", x, y, c3.times(x, y));

        Calc c4 = new Calc();
        System.out.printf("%d / %d = %d\n", x, y, c4.divied(x, y));
        System.out.println("------------");

        Calc c5 = new Calc();
        System.out.printf("%d + %d = %d\n", x, y, c1.plus(x, y));
        System.out.printf("%d - %d = %d\n", x, y, c2.minus(x, y));
        System.out.printf("%d * %d = %d\n", x, y, c3.times(x, y));
        System.out.printf("%d / %d = %d\n", x, y, c4.divied(x, y));
        System.out.println("------------");

        CalcsingleTon cs1 = CalcsingleTon.getInstance();
        System.out.printf("%d + %d +%d\n", x, y, cs1.plus(x, y));

        CalcsingleTon cs2 = CalcsingleTon.getInstance();
        System.out.printf("%d + %d +%d\n", x, y, cs2.plus(x, y));

        CalcsingleTon cs3 = CalcsingleTon.getInstance();
        System.out.printf("%d + %d +%d\n", x, y, cs3.plus(x, y));

        CalcsingleTon cs4 = CalcsingleTon.getInstance();
        System.out.printf("%d + %d +%d\n", x, y, cs4.plus(x, y));
    
    
    
    
    
    }
}

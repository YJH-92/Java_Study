public class CalcsingleTon {
    
    public static CalcsingleTon current;

    public static CalcsingleTon getInstance(){
        if (current == null) {
            current = new CalcsingleTon();
        }
        return current;
    }
    private CalcsingleTon() {
        System.out.println("CalcsingleTon에 대한 current 객체가 생성됨");
    }

    public int plus(int x, int y) {return x + y;}
    public int minus(int x, int y) {return x - y;}
    public int time(int x, int y) {return x * y;}
    public int divied(int x, int y) {return x / y;}


}

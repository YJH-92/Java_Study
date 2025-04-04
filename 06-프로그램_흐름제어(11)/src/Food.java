public class Food extends Product{
    @Override
    public void showInfo() {
        System.out.println("식품입니다. 유통기한을 확인하세요! ");
    }
    //public String checkExpiration(int expiredate) {
        //return (expiredate<=0)?"상한 음식입니다!" : "상하지 않은 음식입니다!";
    //}

    public void checkExpiration() {
        System.out.println("유통기한: 25/03/30");
    }
}

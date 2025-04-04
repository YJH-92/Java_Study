public class shvwrvth {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("헬로월드");

        try {
            s.setKor(-123);
        } catch (MyKorException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

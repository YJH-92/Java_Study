import java.io.File;

public class Ex02_File2 {
    public static void main(String[] args) {
        //디렉토리 정보 객체 생성
        File f2 = new File("a/b/c//target");
        System.out.println("isFile: " + f2.isFile());
        System.out.println("isDirectory: " + f2.isDirectory());
        System.out.println("isHidden: " + f2.isHidden());
        System.out.println("절대경로: " + f2.getAbsolutePath());
        System.out.println("존재여부: " + f2.exists());

        //경로에 따른 디렉토리 생성
        // -->최종 폴더만 생성하려고 함
        // --> 하지만 중간 폴더가 없기 떄문에 생성 실패 -->
        //System.out.println(f2.mkdir());

        //땅굴파기
        f2.mkdirs();

        //마지막 "/" 이후 단어를 리턴
        System.out.println(f2.getName());

        //처음부터 마지막 "/" 직전까지 리턴
        System.out.println(f2.getParent());

        System.out.println("---------------------------------");

        //삭제 시도 --> 성공시 true, tlfvotl false
        //boolean del_ok = f2.delete();
        //System.out.println("삭제성공여부 : " + del_ok);
    }
}

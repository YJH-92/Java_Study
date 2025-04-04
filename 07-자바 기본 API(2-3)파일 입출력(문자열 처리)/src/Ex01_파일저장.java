import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Ex01_파일저장 {
    public static void main(String[] args) {
        /** 1) 기본 준비 */
        // 저장할 파일의 경로
        String filePath = "./test.txt";
        // 파일에 저장할 내용
        String content = "안녕하세요. 자바";

        /** 2) 저장할 내용을 스트림(byte배열 -> 이진수 모음)으로 변환 */
        byte[] buffer = null;
        try {
            buffer = content.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } 
        OutputStream os = null;    
        try {
            os = new FileOutputStream(filePath);
            os.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 사용한 스트림은 에러 발생여부에 상관 없이 반드시 닫아야 한다.
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

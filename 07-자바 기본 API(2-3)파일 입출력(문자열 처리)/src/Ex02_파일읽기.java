import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Ex02_파일읽기 {
    public static void main(String[] args) {
        String filePath = "./test.txt";
        byte[] buffer = null;
        String content = null;
        InputStream is = null;


            try {
                is = new FileInputStream(filePath);
                buffer = new byte[is.available()];
                is.read(buffer);
            
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (buffer != null) {
                try {
                    content = new String(buffer, "utf-8");
                    System.out.println(content);
                } catch (UnsupportedEncodingException e) {
                    System.out.println("[ERROR] 인코딩 지정 에러");
                    e.printStackTrace();
                }
            }
        }
    }
        
        



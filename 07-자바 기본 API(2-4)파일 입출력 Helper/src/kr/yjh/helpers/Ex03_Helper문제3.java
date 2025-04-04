package kr.yjh.helpers;

import java.util.Scanner;

public class Ex03_Helper문제3 {
    public static void main(String[] args) {
        String filePath = ".info.txt";

        Scanner input = new Scanner(System.in);
        System.out.println("이름/연락처/나이/키  입력: ");
        String name = input.nextLine();
        int phoneNumber = input.nextInt();
        int age = input.nextInt();
        int height = input.nextInt();

        input.close();


        String info = ("이름 : " + name + "\n전화번호 : " + phoneNumber + "\n나이 : " + String.valueOf(age) + "\n키 : " + String.valueOf(height));

        //String content = "이름\n연락처\n나이\n키";

        byte[] data = null;
        try {
            data = info.getBytes("utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        /** 저장 테스트 */
        try {
            FileHelper.getInstance().write(filePath, data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /** 읽기 테스트 */
        try {
            byte[] read = FileHelper.getInstance().read(filePath);
            System.out.println(new String(read, "utf-8"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}

package ex03_FileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam1 {
//text.txt파일을 만ㄷ르고 한글, 영어(대문자, 소문자)섞어서 작성
//text.txt파일의 내용을 읽어와서
	
//영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요.
//대문자 : x개
//소문자 : x개
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int count_A = 0;
		int count_a = 0;
		try {
			fos = new FileOutputStream("D:\\JAVA\\text.txt");
			
			fos.write("ABCDEFabc".getBytes());
			
			System.out.println("파일생성완료.");
			
			String path = "D:\\JAVA\\text.txt";
			
			File f = new File(path);
			byte[] read = new byte[(int)f.length()];
			
			fis = new FileInputStream(f);
			
			fis.read(read);
			
			String res = new String(read, "UTF-8");
			
			for(int i = 0; i < res.length(); i++) {
				char ch = res.charAt(i);
				if(ch >= 'a' && ch <= 'z') {
					count_a++;
				}
				if(ch >= 'A' && ch <='Z') {
					count_A++;
				}
			}
			System.out.println("문장 : " + res);
			System.out.println("대문자 : " + count_A + "개");
			System.out.println("소문자 : " + count_a + "개");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}

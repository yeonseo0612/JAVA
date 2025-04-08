package ex_02_file;

import java.io.File;

public class Ex04_File {
	public static void main(String[] args) {
		
		String path = "D:\\JAVA\\새 텍스트 문서.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			System.out.println("파일이름 : " + f.getName());
			System.out.println("절대 경로 : " + f.getAbsolutePath());
		}
		
		
	}
}

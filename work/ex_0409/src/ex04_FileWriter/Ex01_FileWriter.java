package ex04_FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex01_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\JAVA\\FileWriter예제.txt");
			
			String str = "hi";
			
			fw.write(" 첫번째 줄 \n");
			fw.write(" 두번째 줄 \n");
			
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

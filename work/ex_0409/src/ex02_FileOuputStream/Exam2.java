package ex02_FileOuputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다");
				break;
			}
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			try {
				fos = new FileOutputStream("D:\\JAVA\\scores.txt", true);
				
				String str = name + " : " + score + "   ";
				fos.write(str.getBytes());
				
				String path = "D:\\JAVA\\scores.txt";
				
				File f = new File(path);
				
				byte[] read = new byte[(int)f.length()];

				if(f.exists()) {
					try {
						fis = new FileInputStream(f);
								
						fis.read(read);
								
						String res = new String(read, "UTF-8"); 
						System.out.println("=====================");
						System.out.println("출력 : "+res);
						System.out.println("=====================");
						
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
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
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		
		}
		
	}

}

package ex02_FileOuputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Exam1 {
	//학생의 이름과 점수를 저장하는 프로그램
	//이름과 점수를 FileOutputStream을 이용하여 Scores.txt파일에 저장
	
	//요구사항
	//1.사용자로부터 이름과 점수를 입력받는다.(Scanner) 
	//2.입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어 파일에 쓴다. ex) "김철수 : 84"
	//3.이름에 exit를 입력하면 프로그램 종료
	//4.파일은 scores.txt로 저장되며, 기존 내용은 덮어쓴다.
	//5.  이름  : 점수 형식의 문자열의 각 문자의 char값을 +3을 해 암호화한다.
	public static void main(String[] args) {
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		while(true) {
			String minus_str = "";
			System.out.print("이름 : ");
			String name = sc.next();
			
			String path = "D:\\JAVA\\scores.txt";
			
			File f = new File(path);
			
			byte[] read = new byte[(int)f.length()];

			if(f.exists()) {
				try {
					fis = new FileInputStream(f);						
					fis.read(read);
			
					String res = new String(read, "UTF-8"); 
	
					for(int i = 0; i < res.length(); i++) {
						char ch = res.charAt(i);
						
						ch = (char)(ch - 3);
						
						minus_str += ch;
				
					}
		
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

			//대문자 무시하고 값을 검증
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("복호화 : \n"+ minus_str);
                break; 
            }

			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			try {
				fos = new FileOutputStream("D:\\JAVA\\scores.txt", true);
				
				String str = name + " : " + score + "\n";
				String plus_str = "";
				for(int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					 ch = (char)(ch + 3); 
					 plus_str += ch;
					 
					 
				}
				
				fos.write(plus_str.getBytes());

				System.out.println("파일 저장 성공");
					
				
		
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(fos != null) {
						fos.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		   sc.close();
		   System.out.println("종료");
	}
	
 }


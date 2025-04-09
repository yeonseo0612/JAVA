package ex04_FileWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//메모장 프로그램 만들기
		//사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
		//입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
		//사용자로부터 여러 줄의 텍스트를 입력받는다.
		//사용자가 exit 입력하면 종료합니다.
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		FileWriter fw = null;
		while(true) {
			try {
				System.out.println("메모입력 (exit 입력시 종료)");
				String userInput = sc.nextLine();
				
				if(userInput.equalsIgnoreCase("exit")) {
					System.out.println("메모를 종료합니다.");
					break;
				}
				
				fos = new FileOutputStream("D:\\JAVA\\memo.txt");
				
				fos.write((userInput+"\n").getBytes());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

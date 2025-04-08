package ex01_Thread;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자입력하세요 : ");
		
		int num = sc.nextInt();
		
		ThreadCount cnt = new ThreadCount(num);
			
		Thread t = new Thread(cnt);
		
		t.start();
	
	}
}

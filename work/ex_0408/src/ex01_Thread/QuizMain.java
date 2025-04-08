package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		Random random = new Random();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = sc.nextInt();
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
	
}


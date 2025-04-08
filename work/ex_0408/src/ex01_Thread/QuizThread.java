package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	private int num;
	int timer = 0;
	private int count = 0;
	private int cnt_num = 1;
	private boolean check = true;
	final int finish = 5;
	
	public void startGame() {
		Random random = new Random();

		
		while(check) {
			int random_num1 = random.nextInt(100)+1; // 난수 1
			int random_num2 = random.nextInt(100)+1; // 난수 2
			Scanner sc = new Scanner(System.in);
			System.out.print(cnt_num+ "번 문제 : " + random_num1 + " + " + random_num2 + " = ");
			cnt_num++;
			
			int res = sc.nextInt();
			
			if(res == (random_num1 + random_num2)) {
				System.out.println("정답입니다!");
				count++;
			}else {
				System.out.println("오답입니다~"); 
				continue;
			}
			
			try {
			if(count == finish){
				System.out.println("결과 : " 
						       + timer + "초 걸렸습니다.");
				check = false;
			}
			
		} catch (Exception e) {
			System.out.println("정답은 정수로 입력하세요");
		}
		}
	}
 
	@Override
	public void run() {

		while (check) {

			try {
				Thread.sleep(1000);
				timer++;

			} catch (Exception e) {
				// TODO: handle exception
			}			
		}
	}
 
 
}

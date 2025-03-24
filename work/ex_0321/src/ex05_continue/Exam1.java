package ex05_continue;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//1~50 사이의 난수를 생성하고
		//난수를 맞추는 프로그램 만들기
		//적은 값이 난수보다 작으면
		//맞춰야할 숫자가 더 큽니다."
		//적은 값이 난수보다 크면
		//"맞춰야할 숫자가 더 작습니다.
		
		// 1~ 50 2진탐색 알고리즘 
		Random r = new Random();
		int random = r.nextInt(50)+1;
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("수를 입력하세요.");
//			int num = sc.nextInt();
//			
//			if(num == random) {
//				System.out.println("정답");
//				break;
//			}else if(num > random) {
//				System.out.println("숫자가 더 작습니다");
//			}else if(num < random) {
//				System.out.println("숫자가 더 큽니다");
//			}
//		}
		
		// for(;;) -> for문 무한루프
		for(int i = 0 ; i <1 ;) {
			System.out.println("수를 입력하세요.");
			int num = sc.nextInt();
			if(num == random) {
				System.out.println("정답");
				break;
			}else if(num > random) {
				System.out.println("숫자가 더 작습니다");
				continue;
			}else if(num < random) {
				System.out.println("숫자가 더 큽니다");
				continue;
			}
			
		}
		
		//경우의 수
		//1. 난수를 맞추는 경우 -> if
		//2. 난수보다 큰 경우 -> if
		//3. 난수보다 작은 경우 -> if
		
		//반복횟수를 구하기 어려우니까
		//while 문을 써보는게 어떨까? 
	}

}

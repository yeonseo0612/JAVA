package ex01_if;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		int ball;
		
		int total_box;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("농구공 개수를 입력하시오 :");
		ball = sc.nextInt();
		total_box = (ball)/5;
		
		if(ball % 5 == 0) {
			System.out.println("필요한 box의 개수 :"+ (int)total_box);
		}else {
			System.out.println("필요한 box의 개수 :"+ Math.ceil(total_box + 1));
		}

	}

}

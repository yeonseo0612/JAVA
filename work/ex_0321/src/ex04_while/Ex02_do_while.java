package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		//while문과 같이 조건을 만족할 때까지 반복한다.
		//다만, while문과 다른 점은 먼저 루프를 한 번 실행한 후
		//조건식을 검사한다는 점이다.
		//즉, 조건식의 결과와 상관없이 무조건 한 번은 실행된다.
		
		//do{
		//  반복하고자하는 명령
		//}while(조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i<=10);
		//if, for, while에서는 굳이 ; 안 붙여도 된다. 하지만 do while은 붙여야한다.
		
		//1~10 까지의 총합 구하기
		
		
		int num = 1;
		int result = 0;
		do {
			result += num;
			num++;
		}while(num<=10);
		System.out.println(result);
		
		
		
		//비밀번호 확인 프로그램 만들기
		//사용자로부터 비밀번호 입력받아 올바른 비밀번호가 입력될때까지 계속 입력을 요구하는 프로그램 만들기
		//비밀번호 9486
		
		
		
	Scanner sc = new Scanner(System.in);
//		int user_pwd;
//		System.out.println("비밀번호를 입력하세요");
//		int pwd = 9486;
//		boolean check;
//		do {
//			user_pwd = sc.nextInt();
//			if(user_pwd != pwd) {
//				System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
//				user_pwd = sc.nextInt();
//				check = false;
//			}else {
//				check = true;
//			}
//		}while(check);
//			System.out.println("접속 성공!");
//			
			
			
			//학생의 국어, 영어, 수학 점수를 입력받는다.
			//단, 각 과목은 40점 이상이어야 하며,
			//40점 미만이면 해당 과목 점수를 다시 입력받아야 한다.
			System.out.println("과목을 점수를 입력해주세요");
			int ko = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			boolean pass = ko >= 40 && eng >= 40 && math >= 40;
			
			do {
				if(!pass) {
					System.out.println("과목 점수를 다시입력해주세요 :");
					ko = sc.nextInt();
					eng = sc.nextInt();
					math = sc.nextInt();
					
				} 	0
			}while(pass);
			System.out.println("통과");
			
			
			
	}

}

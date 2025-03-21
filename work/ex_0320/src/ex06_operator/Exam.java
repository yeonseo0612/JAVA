package ex06_operator;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
//		
//		int ko;
//		int math;
//		int eng;
//		int result;
//		float avg_result;
//		
//		String pass = "합격";
//		String no_pass = "불합격"	;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어점수를 입력하시오: ");
//		ko = sc.nextInt();
//		System.out.print("수학점수를 입력하시오: ");
//		math = sc.nextInt();
//		System.out.print("영어점수를 입력하시오: ");
//		eng = sc.nextInt();
//		
//		result = (int)(ko+math+eng);
//		
//		avg_result = (float)((ko+math+eng)/3.0);
//		
//		System.out.println("총 합계 : " + result);
//		System.out.println("평균 : "+ avg_result );
//
//		if((ko >= 40 && math >=40 && eng >=40) && avg_result >= 40){
//			System.out.println("합격여부 :"+ pass);
//		}else {
//			System.out.println("합격여부 :"+ no_pass);
//		}
		
//	//상자 하나에는 농구공이 5개 들어갈 수 있다 x개의 농구공을 담기 위한 개수
		int ball;
		int total_Box;
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("농구공 개수를 입력하시오 :");
//		ball = sc.nextInt();
//		
//		total_Box = (ball)/5;
//		
//		
//		if(ball % 5 == 0) {
//			System.out.println("필요한 box의 개수 :"+ (int)total_Box);
//		}else {
//			System.out.println("필요한 box의 개수 :"+ Math.ceil(total_Box + 1));
//		}
//----------------------------------------------------------------------
//		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5 개이다 
//		과수원에서 하루에 생ㅅ안되는 총 개수를 출력
//		시간당 전체 과일의 평균 생산 평균값 float
		
		int d_pear = 5;
		int d_apple = 7;
		int d_orange = 5;
		
		int day_sum = d_pear + d_apple + d_orange;
		
		float avg_hour = day_sum / 24.0f;
		
	
		
		System.out.println("하루 생산되는 총 개수 : " + day_sum + "개");
		System.out.println("시간당 전체 과일의 평균 생산량 : " + avg_hour + "개");
		System.out.printf("시간당 전체 과일의 평균 생산량은 %.2f개 입니다. ", avg_hour);
		
		
	}
	//----------------------------------------------------------------------------------
	
	
	
	

	

}

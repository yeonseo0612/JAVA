package ex03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04_Map {
	public static void main(String[] args) {
		//학생별 국어, 영어, 수학 점수 저장 및 평균 계산
		//학생 이름을 입력받고, 해당 학생의 국어, 영어, 수학 점수를 입력받는다.
		//3명의 학생 정보를 입력받은 후, 각 학생의 평균점수
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer[]> stu = new HashMap<String, Integer[]>();
		
	
		
	
	
			for(int i =0; i < 3; i++ ) {
				System.out.print("학생의 이름을 입력하시오 : ");
				String name = sc.next();
				
				System.out.print("국어 점수를 입력하시오 : ");
				String ko = sc.next();
				
				System.out.print("영어 점수를 입력하시오 : ");
				String math = sc.next();
				
				System.out.print("수학 점수를 입력하시오 : ");
				String eng = sc.next();
				
				Integer[] score = new Integer[3];
				
				score[0] = Integer.parseInt(ko);
				score[1] = Integer.parseInt(eng);
				score[2] = Integer.parseInt(math);
				
				stu.put(name, score);
				
			}
			System.out.println();
			System.out.println();
			
			System.out.println("====학생별 총 평균====");
			for(Map.Entry<String, Integer[]> entry : stu.entrySet()) { 
				String name = entry.getKey();
				Integer[] score = entry.getValue();
				
				double avg = (score[0] + score[1] + score[2]) / 3.0 ;
			
				System.out.printf("%s - 평균 : %.2f점\n", name, avg);
			}
			
			
			
		
		
		
	}

	private static String parseInt(String ko) {
		// TODO Auto-generated method stub
		return null;
	}
}

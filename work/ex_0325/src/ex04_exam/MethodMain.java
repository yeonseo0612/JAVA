package ex04_exam;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr = {1,4,8,4,5};
		
		MethodTest test = new MethodTest();
		
		test.maxFinder(Arr);
		
		System.out.println("--------------------------------------");
		
		test.circleArea(5);
		
		float cRound = test.circleRound(5);
		
		System.out.println();
		
		System.out.println("원의 둘레는 " + cRound + "입니다.");
		
		System.out.println("--------------------------------------");
		
		test.calculator(2, 3, "-");
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt
				();	
		
		test.random(num);
		
	}

}

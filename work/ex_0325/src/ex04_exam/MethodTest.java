package ex04_exam;

import java.util.Random;
import java.util.Scanner;

public class MethodTest {
	//배열의 최댓값을 찾는 maxFinder 메서드
	//임의의 배열은 매개변수로 받자.
	
	public void maxFinder(int[] iArr) {
		int max = iArr[0];
		
		for(int i = 0; i < iArr.length; i++) {
			if(max < iArr[i]) {
				max = iArr[i];
			}
		}
		
		System.out.println("배열의 최대값은 " + max + "입니다.");

	}
	
	//원의 넓이와 둘레 구하기
	//함수를 호출하면서 반지름을 받는다.
	//원의 넓이를 구하는  circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea는 결과 출력하기
	//circleRound는 결과 반환하기
	//원의 넓이 : 3.14 * r * r;
	//원의 둘레 : 2 * 3.14 * r;
	
	public void circleArea(int r) {
		float cArea = (3.14f) * r * r;
		System.out.printf("원의 넓이는 %.2f입니다", cArea);
	}
	public float circleRound(int r) {
		float cRound = (3.14f) * 2 * r;
		return cRound;
	}
	
	//계산기 만들기
	//사칙연산을 할 수 있는 calculator 메서드 만들기
	//두 수와 연산자를 매개변수로 받는다
	
	public void calculator(int x, int y, String calc) {
		int res = 0;
		if(calc == "+") {
			res = x + y;
		}else if(calc == "-") {
			res = x - y;
		}else if(calc == "*") {
			res = x * y;
		}else if(calc == "/") {
			res = x / y;
		}
		System.out.printf("결과 -> %d %s %d = %d",x,calc,y,res);
	}
	//1~50사이의 난수를 생성
	//main쪽에서 키보드를 통해서 정수를 입력 받는다.
	//check()메서드를 만들어서 사용자가 입력한 숫자를 판단.
	//발생한 난수보다 크다면 Down! 작다면 Up!을 출력
	//사용자가 입력한 숫자와 발생한 나눗가 같을 경우 종료
	
	public void random(int num) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int random = r.nextInt(50)+1;
		int count = 0;
		   do {
	          
	            if (num > random) {
	                System.out.println("Down!");
	                System.out.print("숫자를 다시 입력하세요: ");
	                num = sc.nextInt();
	                count++;
	            } else if (num < random) {
	                System.out.println("Up!");
	                System.out.print("숫자를 다시 입력하세요: ");
	                num = sc.nextInt();
	                count++;
	            }
	            
	        } while (num != random);
		   
	        System.out.println("정답입니다! 랜덤 숫자는 " + random + "이었습니다." + "도전횟수 : "+ count);
			
	}
	
}

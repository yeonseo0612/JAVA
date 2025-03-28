package exam1;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Exam1 {
	public static void main(String[] args) {
		//정수가 아닌걸 입력했을 때
		//해당값은 정수가 아닙니다라고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		String input = sc.next(); // 문자열도 들어갈 수 있기때문에 nextInt가 아닌 next를 사용한다.
		 try {
	            int num = Integer.parseInt(input);  // 문자열을 정수로 변환
	            System.out.println("입력한 정수는: " + num);  // 입력한 정수 출력
	        } catch (NumberFormatException e) {
	            // 예외 발생 시, 입력한 값과 함께 출력
	            System.out.println(input + "은/는 해당 값은 정수가 아닙니다.");
	        } finally {
	            sc.close();  // Scanner 객체 닫기
	        }
	}
}

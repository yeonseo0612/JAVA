package ex05_Scanner;
import java.util.Scanner;


public class Ex1_Scanner {

	public static void main(String[] args) {
		//데이터의 입력
		//프로그램을 실행할 때 키보드를 통해 입력하는 데이터를 
		//변수에 대입하겠다.
		
		//java.util패키지에 있는 Scanner클래스를 이용해야한다.
		//다른 패키지에 있는 기능을 사용하기 위해서는 import
		//아니면 Scanner ctrl + spacebar를 누르면 자동으로 생김 import
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 선언.
		
	
		//System.out.print("정수입력 :");
		//int n = sc.nextInt();// 정수 입력받기
		//		
		//System.out.println(n);
		
		
		//나이입력받기
		//제 나이는 x세 입니다
		
//		System.out.print("나이 입력: ");
//		int age = sc.nextInt();
//		System.out.print("이름 입력: ");
//		String name =sc.next();// 띄어쓰기를 해버리면 끝남
//		sc.nextLine();//엔터값을 대신 가져감
//		System.out.print("주소 입력: \n");
//		String address =sc.nextLine();//엔터치면 끝남
//		System.out.printf("제 이름은 %s이고 나이는 %d세 입니다 거주지는 %s입니다.",name ,age,address);
//		
	
		
		int ko;
		int math;
		int eng;
		
		int result;
		
		System.out.print("국어점수를 입력하시오: ");
		ko = sc.nextInt();
		System.out.print("수학점수를 입력하시오: ");
		math = sc.nextInt();
		System.out.print("영어점수를 입력하시오: ");
		eng = sc.nextInt();
		System.out.println((int)((ko + math + eng)/3.0));
		
	
		
		
		
		
		
		
		
		
		
	}

}

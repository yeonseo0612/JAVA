package ex06_operator;

public class Ex03_Operator {

	public static void main(String[] args) {
		//비트연산자
		//논리 연산자와 유사하지만 bit단위의 연산만 가능하다.
		//& 논리곱(and) 두 항이 모두 참이면 참 아니면 거짓
		//| 논리합(or) 두 항 중 하나라도 참이면 참 아니면 거짓
		//^ 배타적 논리합(xor) 두 항이 다르면 참 같으면 거짓
		//~ 부정(not) 참을 거짓으로 거짓을 참으로 연산
		
		int a = 10;//1010
		int b = 7;//0111
		int c = a & b;
		System.out.println("c : " + c);
		
		int a2 = 12; // 1100
		int b2 = 8; // 1000
		int c2 = a2 | b2;
		System.out.println("c2 : " + c2);

		int a3 = 9; // 1001
		int b3 = 11; // 1011
		int c3 = a3 ^ b3; // 0010 -> 2
		System.out.println("c2 : " + c3);
		
		// ~(not)
		
		int x = 7; // 0111
		System.out.println("~x : " + ~x); //1000
		
		//~x -> -(x+1)
		
		//시프트 연산자
		//비트의 이동
		// <<, >>
		x = 10; //1010
		int result = x << 1; //10100 -> 20
		System.out.println(result); // 20
		result = x >> 1; //0101
		System.out.println(result); // 5
		
		//삼항연산자
		//조건식? 참일 때 실행할 명령 : 거짓일때 실행할 명령;
		int i = 10;
		int i2 = 15;
		result = ++i >= i2? 1:0; // 앞의 조건식을 통해 t or f 값을 얻어온 후 각 해당되는 명령 반환
		System.out.println("result :" + result);
	}

}

package ex04_casting;

public class Ex01_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터를 다른 자료형의 데이터로 변환하는 것을 의미한다.
		//모든 연산은 기본적으로 같은 자료형들끼리만 가능하다.
		//따라서 서로 다른 자료형의 연산을 수행하기 위해서는 같은 자료형으로 변환해야 한다.
		
		int num = 11;
		double num2 = 3.14;
		double numChange = (double) num;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(numChange);
	}

}

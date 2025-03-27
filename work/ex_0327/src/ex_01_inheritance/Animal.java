package ex_01_inheritance;

public class Animal {
	//공통적으로 가지고 있는 성질
	int eye = 2;
	int leg = 4;
	
	public void info() {
		System.out.println("눈의 크기 :" + eye);
		System.out.println("다리 개수 :" + leg);
	}


}

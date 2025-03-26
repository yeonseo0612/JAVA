package ex04_overloading;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ol = new Overload();
		
		//같은 이름이지만 인자에 따라 다른 기능을 하는 메서드를 만들 수 있다.
		ol.result();
		ol.result(100);
		ol.result('a');
		ol.result("sdf",123);
		ol.result(123,"asdf");
		
		
		
		
	}

}

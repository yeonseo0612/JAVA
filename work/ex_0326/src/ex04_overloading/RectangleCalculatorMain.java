package ex04_overloading;

public class RectangleCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleCalculator rc = new RectangleCalculator();
		
		System.out.println("정사각형 넓이 :" + rc.area(5));
		
		System.out.println("직사각형 넓이 :" + rc.area(5,10));
		
		System.out.println("실수형 변의 사각형 넓이 :" + rc.area(3.0,5.0));
	}
}

package ex03_Polymorphism;

public class CalcMain {
	public static void main(String[] args) {
		  Calc calc = new Calc();
	        int num1 = 10;
	        int num2 = 20;
	        int[] numbers = {10, 20, 30, 40};
	        System.out.println("합: " + calc.add(num1, num2));
	        System.out.println("차: " + calc.substract(num1, num2));
	        System.out.println("평균: " + calc.average(numbers));
	}
}


package ex04_overloading;

public class RectangleCalculator {
	//다양한 방식으로 사각형의 넓이 구하기
	//정사각형의 한 변의 길이를 받아 넓이 반환하기
	//메서드명 : area
	int n;
	int g;
	int s;
	double g_1;
	double s_1;
	
	//1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	public int area(int n){
		this.n = n;
		int res = n*n;
		return res;
	}
	//2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	public int area(int g, int s){
		this.g = g;
		this.s = s;
		int res = g*s;
		return res;
	}
	//3. 실수형 가로, 세로를 받아 실수 결과 반환하기
	public double area(double s,double g){
		this.g_1 = g;
		this.s_1 = s;
		double res = g_1*s_1;
		return res;
	}
}

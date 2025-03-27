package ex_01_inheritance;

//상속관계가 성립이 되려면 extends를 써야함
public class Cat extends Animal{
	//자식만의 특징
	String cute = "귀엽다";
	
	@Override
	public void info() {
		System.out.println("---고양이----");
		super.info(); // 부모클래스에 있는 info()호출
		System.out.println("고양이 특징 : " + cute);
	}
	
}

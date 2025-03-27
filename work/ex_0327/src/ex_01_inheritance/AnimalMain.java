package ex_01_inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부모의 메서드도 사용할 수 있지만
		//자식클래스에 메서드가 오버라이딩 되면
		//자식객체가 메서드를 호출했을 때 오버라이딩된 메서드를 호출하게 된다.
		Cat cat = new Cat();
		System.out.println("==고양이==");
		cat.info();

		
		Dog dog = new Dog();
		System.out.println("==강아지===");
		System.out.println("눈의 개수 : " +  dog.eye);
		System.out.println("눈의 개수 : " +  dog.leg);
		System.out.println("눈의 개수 : " +  dog.smell);
		
		Chiwawa ch = new Chiwawa();
		System.out.println("===치와와===");
		System.out.println("눈의 개수 : " +  ch.eye);
		System.out.println("눈의 개수 : " +  ch.leg);
		System.out.println("눈의 개수 : " +  ch.smell);
		System.out.println("눈의 개수 : " +  ch.shape);
		
	}

}

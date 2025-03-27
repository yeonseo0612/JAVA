package ex03_Polymorphism;


abstract class Animal {
	public abstract void cry();
	
}
//추상클래스를 상속받으면 반드시 추상메서드를 오버라이드 해야한다.

class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
}

class Farm{
	public void sound(Animal animal) {
		animal.cry();
	}
}



public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
		
	}
}

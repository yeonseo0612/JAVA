package exam2;

public class Family {
	String desk = "책상";
	String bed = "침대";
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}

class Father extends Family{
		String beard = "수염";
}
class Mother extends Family{}
class Child extends Family{}
class Pet extends Family{}

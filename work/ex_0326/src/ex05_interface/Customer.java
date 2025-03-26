package ex05_interface;

public class Customer extends Person {
	int memberId;
	
	public Customer(String name, int age, int memberId) {
		//super(); 부모 생성자의 호출
		super(name,  age); //부모생성자의 호출
		this.memberId = memberId;
	}
	void enter() {
		System.out.printf("회원번호 %d (%s, %d세)님 입장하셨습니다.", memberId, name, age);
	}
}

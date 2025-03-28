package exam2;

public class HouseMain {
	public static void main(String[] args) {
		House h = new House();
		
		//각 구성원 객체가 부모 타입으로 들어왔다.
		h.member1 = new Father();
		h.member2 = new Mother();
		h.member3 = new Pet();
		
		System.out.println(h.member1.desk);
		
		//부모타입으로 변했기 때문에 Father 클래스에 정의된 필드는 사용하지 못함
		//자식 클래스에 정의된 필드나 메서드 같이 자식클래스로 강제 변환 
		System.out.println(((Father)h.member1).beard);
		
	}
}

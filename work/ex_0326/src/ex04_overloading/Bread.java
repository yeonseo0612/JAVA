package ex04_overloading;

public class Bread {
	//각기 다른 기능을 하는 makeBread() 메서드를 세 개만드는데,
	//메인클래스에서 각각의 메서드를 호출했을때의 결과를 보고 로직을 구현
	
	//빵을 만ㄷ르었습니다.
	
	//빵을 만들었습니다.
	//빵을 만ㄷ르었습니다.
	//요청하신 n개의 빵을 만들었습니다
	
	//크림빵을 만들었습니다.
	//크림빵을 만들었습니다.
	//요청하신 n개의 빵을 ㅁ낟르었습니다
	
	int count;
	String bread;
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	public void makeBread(int count) {
		this.count = count;
		for(int i = 0; i <= count; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", count);
	}
	public void makeBread(int count, String bread) {
		this.bread = bread;
		int c = count;
		for(int i = 0; i <= count; i++) {
			System.out.printf("%s빵을 만들었습니다.\n", bread);
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.", count);
	}
	
}

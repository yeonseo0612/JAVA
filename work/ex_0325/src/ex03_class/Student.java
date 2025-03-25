package ex03_class;

public class Student {
	//정적 필드
	static String schoolName = "한국 고등학교";
	String studentName; //객체 멤버(필드)
	//정적 메서드
	static void goToSchool() {
		System.out.println("학교에 갑니다.");
	}
	
	//필드
	//ㄴ 일반 필드 -> 객체마다의 상태(이름,나이,직업,키,몸무게,주소,mbti)
	//ㄴ 정적 필드 -> 객체 공통의 상태(눈,코,귀,입,손가락 등등)
	
	//함수는 독립적으로 쓸수 있는거 메서드는 독립적으로 사용할 수 없음 // 자바는 거의 메소드
	
	//메서드
	//ㄴ메서드는 메서드 안에서 정의할 수 없다.
	//ㄴ메서드는 메서드 안에서만 호출할 수 있다.
	
	
	//일반메서드
	public void hello() {
		System.out.println("안녕하세요 제 이름은 " + studentName + "입니다." );
	}
}

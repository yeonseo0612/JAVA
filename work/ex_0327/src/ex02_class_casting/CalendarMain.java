package ex02_class_casting;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeskCalender dc = new DeskCalender("보라색", 6);
		dc.info(); // 자식클래스에 오버라이드 된 메서드
		dc.hanging(); // 부모클래스에 선언된 메서드
		dc.onTheDesk();//자식클래스에 선언된 메서드
		
		Calendar c = new DeskCalender("검은색",12);
		c.info();
		c.hanging();
		//DeskCalendar객체임에도 Calendar타입을 가졌기 때문에
		//DeskCalendar의 멤버에는 접근 할 수 없다.
		//c.onTheDesk();
	}

}

package ex02_class_casting;

public class DeskCalender extends Calendar {

	public DeskCalender(String color, int months) {
		super(color, months);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		System.out.println(color + "달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	public void onTheDesk() {
		System.out.println(color + "달력을 책상에 세울 수 있습니다.");
	}
}

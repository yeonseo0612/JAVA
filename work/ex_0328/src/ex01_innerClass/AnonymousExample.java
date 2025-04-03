package ex01_innerClass;

//인터페이스 생성
interface buttonClickListener{
	public void click();
}


public class AnonymousExample {
	//내부클래스
	public class Button{
		//buttonClickListener 타입의 변수를 가진다.
		//인터페이스 구현체는 다 들어올 수 있다.
	private buttonClickListener listener;
	
	
	//멤버변수는 private으로 지정하는 일이 많기 떄문에 직접 접근하는 것이 불가능하다.
	//public으로 된 메서드를 통해서 접근을 하는 일이 많다. -> setter & getter
	public void setButtonListener(buttonClickListener listener) {
		this.listener = listener;
	}
	
	public void click() {
		if(listener != null) {
			this.listener.click();
		}
	}
	}
	public static void main(String[] args) {
		//외부 클래스의 객체
		AnonymousExample exam = new AnonymousExample();
		//내부 클래스의 객체(외부 클래스의 객체로부터 생성)
		AnonymousExample.Button button = exam.new Button();
		
		
		button.setButtonListener(new buttonClickListener() {
			
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
				
			}
		});
		button.click();
	}
}



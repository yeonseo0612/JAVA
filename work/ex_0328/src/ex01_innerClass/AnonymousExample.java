package ex01_innerClass;

interface buttonClickListner{
	public void click();
}


public class AnonymousExample {
	public class Button{
	private buttonClickListner listener;
	
	public void setListner(buttonClickListner listner) {
		this.listener = listner;
	}
	public void click() {
		if(listener != null) {
			this.listener.click();
		}
		
	  }
	}
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		
		AnonymousExample.Button button = exam.new Button();
		ButtonImp1 bi = new ButtonImp1();
		button.setListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		button.click();
	}
}



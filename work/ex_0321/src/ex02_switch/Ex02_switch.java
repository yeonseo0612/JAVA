package ex02_switch;

public class Ex02_switch {

	public static void main(String[] args) {
		//switch문에 break가 없는 경우
		//js와는 다르게 true false 불가능
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 1입니다.");
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
		
		int x = 12;
		
		if(x > 10 && x < 20) {
			System.out.println("true");
		}else {
			System.err.println("false");
		}
		
		char ch = 'B';
			
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("ch는 char형 알파벳 소/대문자 입니다");
		}else {
			System.out.println("ch는 char형 알파벳 소/대문자가 아닙니다.");
		}
		
		
		
		
				
		
	}
}

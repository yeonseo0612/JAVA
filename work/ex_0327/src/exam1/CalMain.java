package exam1;

public class CalMain {
	
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : "  + cp.getResult(5,3));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(5,3));
	}
	
}


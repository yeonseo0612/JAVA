package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {

		int a = 20;
		int b = 5;
		
		for(Operation op : Operation.values()) {
			System.out.println(op + ": "+ op.apply(a, b));
		}
		
		
		
	}


	
}

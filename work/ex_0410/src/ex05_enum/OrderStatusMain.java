package ex05_enum;

public class OrderStatusMain {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.ORDERED;
		System.out.println("현재 상태" + status);
		try {
			status = status.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("다음 상태" + status);
		try {
			status = status.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("다음 상태" + status);
		try {
			status = status.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외발생 : " + e.getMessage());
		}
		
	}
}

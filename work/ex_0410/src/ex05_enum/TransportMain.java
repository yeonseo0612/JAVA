package ex05_enum;

public class TransportMain {
	public static void main(String[] args) {
		//각 운송수단별 100을 갔을 때 금액
		//name : xxx 100km - fare : xxx
		
		Transportation type_1 = Transportation.BUS;
		Transportation type_2 = Transportation.SHIP;
		Transportation type_3 = Transportation.TRAIN;
		Transportation type_4 = Transportation.AIRPLAN;
		

		int total_1 = 0;
		int total_2 = 0;
		int total_3 = 0;
		int total_4 = 0;
		total_1 = type_1.totalFare(100);
		System.out.println("name : " + type_1.name() + ", 100km  - fare : " + total_1);
		total_2 = type_2.totalFare(100);
		System.out.println("name : " + type_2.name() + ", 100km  - fare : " + total_2);
		total_3 = type_3.totalFare(100);
		System.out.println("name : " + type_3.name() + ", 100km  - fare : " + total_3);
		total_4 = type_4.totalFare(100);
		System.out.println("name : " + type_4.name() + ", 100km  - fare : " + total_4);
		
		
		
		
//		switch(type) {
//		case BUS: //Item.START앞의 타입은 생략해도된다.
//			total = type.totalFare(100);
//			System.out.println("name : " + type.name() + ", 100km  - fare : " + total);
//			break;
//		case SHIP:
//			total = type.totalFare(100);
//			System.out.println("name : " + type.name() + ", 100km  - fare : " + total);
//			break;
//		case TRAIN:
//			total = type.totalFare(100);
//			System.out.println("name : " + type.name() + ", 100km  - fare : " + total);
//			break;
//		case AIRPLAN:
//			total = type.totalFare(100);
//			System.out.println("name : " + type.name() + ", 100km  - fare : " + total);
//			break;
//		}
	}
}

package ex05_enum;

public class WeekdayMain {
	public static void main(String[] args) {
		Weekday[] weeks = Weekday.values();
		
		for(Weekday week : weeks) {
			if(week.name() == "SUNDAY") {
				System.out.println(week.name()+"은 쉬는날입니다.");
				
			}else {
				System.out.println(week.name()+"은 출근하는날입니다.");
			}
		}
		
		Weekday week_1 = Weekday.MONDAY;
		Weekday week_2 = Weekday.TUESDAY;
		Weekday week_3 = Weekday.WEDNESDAY;
		Weekday week_4 = Weekday.THURSDAY;
		Weekday week_5 = Weekday.FRIDAY;
		Weekday week_6 = Weekday.SATURDAY;
		Weekday week_7 = Weekday.SUNDAY;
		
		switch(week_7) {
		case MONDAY: //Item.START앞의 타입은 생략해도된다.
			
			System.out.println("출근하는 날");
			break;
		case TUESDAY:
		
			System.out.println("출근하는 날");
			break;
		case WEDNESDAY:
		
			System.out.println("출근하는 날");
			break;
		case THURSDAY:
		
			System.out.println("출근하는 날");
			break;
		case FRIDAY:
		
			System.out.println("출근하는 날");
			break;
		case SATURDAY:
			
			System.out.println("출근하는 날");
			break;
		
		case SUNDAY:
			
			System.out.println("쉬는날");
			break;
	}
	
		
	}
}

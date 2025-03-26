package ex04_exam;

public class UserInfo {
		
		 int money; 

	public void deposit(int m) {
		   if (m > 0) {
		        money += m;
		    } else {
		        System.out.println("에러");
		    }
		   System.out.println(m +"원 입금이 완료되었습니다.");
	}
	//돈을출금했을경우
	public void withdraw(int m) {
			money -= m;
			 if (money > m) {
			        money += m;
			        System.out.println(m +"원 출금이 완료되었습니다.");
			    } else {
			        System.out.println("잔액부족");
			    }
		
	}
	
	public void showMoney() {
		
		System.out.printf("현재 잔액은 %d원 입니다", money);

	}
	public void out(boolean check) {
		check = false;
		System.out.println("종료했습니다.");
	}

}

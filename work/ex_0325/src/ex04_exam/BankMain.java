package ex04_exam;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		String depo = "입금";
		String with = "출금";
		String m_check = "잔액확인";
		String out = "종료";
		Boolean userCheck = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("은행 업무\n");
		System.out.printf("1. %s\n", depo);
		System.out.printf("2. %s\n", with);
		System.out.printf("3. %s\n", m_check);
		System.out.printf("4. %s\n", out);
		System.out.println("보실 업무 번호를 선택해주세요.");
		UserInfo userInfo = new UserInfo();
		
		while(userCheck) {
			
		
			int info_num = sc.nextInt();
			
			
			
			if(info_num == 1) {
				System.out.println("입금하실 금액을 입력해주세요");
				int money = sc.nextInt();
				userInfo.deposit(money);
				userCheck = true;
				
			}else if(info_num == 2) {
				System.out.println("출금하실 금액을 입력해주세요");
				int money = sc.nextInt();
				userInfo.withdraw(money);
				userCheck = true;
				
			}else if(info_num == 3){
				userInfo.showMoney();
				userCheck = true;
			}
			else if(info_num == 4) {
				userInfo.out(userCheck);
			}
			
			
			System.out.print("\n은행 업무\n");
			System.out.printf("1. %s\n", depo);
			System.out.printf("2. %s\n", with);
			System.out.printf("3. %s\n", m_check);
			System.out.printf("4. %s\n", out);
			System.out.println("보실 업무 번호를 선택해주세요.");
		}
	}
}




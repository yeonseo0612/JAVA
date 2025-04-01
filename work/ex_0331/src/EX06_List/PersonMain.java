package EX06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<PersonInfo> perInfoList = new ArrayList<>();
		PersonFunction func = new PersonFunction();
		PersonInfo info;
		String name;
		int age;
		String phone;
		
		again:while(true) {
			System.out.println("작업 메뉴");
			System.out.println("1.정보 추가");
			System.out.println("2.정보 삭제");
			System.out.println("3.정보 조회");
			System.out.println("4.종료");
			System.out.print("작업할 번호를 선택하세요. : ");
			
			int choose = sc.nextInt();
			
			if(choose == 1) {
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("나이 : ");
				age = sc.nextInt();
				System.out.print("전화번호(-포함) : ");
				phone = sc.next();	
				perInfoList = func.addInfo(name, age, phone);		
			}else if(choose == 2) {
				 	    if (perInfoList.isEmpty()) {
				 	        System.out.println("저장된 정보가 없습니다.");
				 	    } else {
				 	        func.viewInfo();
				    System.out.println("삭제할 정보의 번호를 입력해주세요.");
				    int cancel = sc.nextInt();
					System.out.println(perInfoList.get(cancel-1).getName() +"님의 정보를 삭제하였습니다.");
					func.deleteInfo(cancel);
					
				 }
			}else if(choose == 3) {
				if (perInfoList.isEmpty()) {
		 	        System.out.println("저장된 정보가 없습니다.");
				}else {
					func.viewInfo();
				}
			}else if(choose == 4) {
				System.out.println("시스템을 종료하겠습니다.");
				break;
			}else {
				System.out.println("잘못된 번호입니다.");
				continue again;
			}
		}
	}
}

package EX06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		List<String> userInfo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("아이디 생성 : ");
			int Userpwd = sc.nextInt();
			
			System.out.print("비밀번호 생성 : ");
			String Userid = sc.next();
			
			
			
			
			
		}
	}
	
	
	
}
//유저의 아이디와 패스워드를 가지는
//UserInfo 클래스를 하나 만들고 -> 필드는 private으로 지정.
//Main 클래스에서 유저의 정보를
//ArrayList에 추가하여 출력해보자

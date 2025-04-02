package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_Map {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		map.put("kim", 11111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true) {
			
			System.out.print("아이디를 입력해주세요 : ");
			String id = sc.next();
		
			
				if(!map.containsKey(id)){
					System.out.println("아이디가 존재하지 않습니다");
					continue;
				}else {
						System.out.print("비밀번호를 입력해주세요 : ");
						int pwd = sc.nextInt();
						if(map.get(id) == pwd) {
							System.out.println("로그인 성공~!");
							break;
						}else {
							System.out.println("비밀번호가 일치하지 않습니다.");
							System.out.print("비밀번호를 다시 입력해주세요 : ");
							pwd = sc.nextInt();
							if(map.get(id) == pwd) {
								System.out.println("로그인 성공~!");
								break;
								}
						}
				}

		}
	
	}
}

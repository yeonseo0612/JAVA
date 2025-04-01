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
		
		
		
		
		again:while(true) {
			
			System.out.println("아이디를 입력해주세요.");
			String id = sc.next();
		
			for(int i = 0; i < map.size(); i++) {
				if(!map.containsKey(id)){
					System.out.println("아이디가 존재하지 않습니다.");
					continue again;
				}else {
					System.out.println("비밀번호를 입력해주세요.");
					int pwd = sc.nextInt();
					
				}
			}
			
		}
	
}
}

package EX06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
// 아래의 결과를 도출하시오
//
//아이디 생성 : abc
//abc abc2
//아이디 생성 : abc3
//abc abc2 abc3
//아이디 생성 :
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "";
		
		ArrayList<Id> str_id = new ArrayList<>();
	
		String id_arr ="";
		for(int i=0; str_id.size() < 5; i++) {
			System.out.print("아이디 생성 :");
			id = sc.next();
			Boolean check = false;
			for(Id id_check : str_id) {
					if(id_check.id.equals(id)){
						check = true;
						break;
					}
				}
			if(check) {
				System.out.println("중복된 아이디");
			}else {
				 	Id id_1 = new Id();
	                id_1.id = id;  // 입력된 아이디를 id_1 객체에 저장
	                str_id.add(id_1);  // 리스트에 객체 추가
	                id_arr += id + " ";  // id_arr에 추가
	                
	             System.out.println(id_arr);
			  }
			}
		}
		
		
	}
	


package EX06_List;

import java.util.ArrayList;

public class PersonFunction {
	ArrayList<PersonInfo> perInfoList = new ArrayList<>();
	
	public ArrayList<PersonInfo> addInfo(String name, int age, String phone) {	
		PersonInfo perInfo = new PersonInfo(name, age, phone);	
		perInfoList.add(perInfo);
		return perInfoList;
	}
	
	public void deleteInfo(int num) {
	
		perInfoList.remove(num-1);
		
	}
	
	public void viewInfo() {
		int count = 0;;
		System.out.println("===전체정보===");
		System.out.println("등록인원"+ perInfoList.size());
		for(PersonInfo info : perInfoList) {
			count++;
			System.out.println( count + "번");
			System.out.println("이름 : " + info.getName());
			System.out.println("나이 : " + info.getAge());
			System.out.println("전화 : " + info.getPhone());
		}
		
	}
	
}

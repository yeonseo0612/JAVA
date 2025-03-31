package EX06_List;

import java.util.ArrayList;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		//사람에 대한 정보를 저장하고 싶다.
		//이름, 키, 몸무게, 주소, 혈액형, 나이
		ArrayList<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		
		p1.name ="홍길동";
		p1.age = 10;
		p1.height=155.5;
		
		Person p2 = new Person();
		
		p2.name ="김길동";
		p2.age = 20;
		p2.height=175.5;
		
		list.add(p1);
		list.add(p2);
	
		System.out.println(list.get(0).age);
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).height);
		
		System.out.println();
		
		System.out.println(list.get(1).age);
		System.out.println(list.get(1).name);
		System.out.println(list.get(1).height);
		
		System.out.println();
		
			for(int I = 0; I < list.size(); I++) {
			    System.out.println(list.get(I).name);
			    System.out.println(list.get(I).age);
			    System.out.println(list.get(I).height);
				}
				System.out.println("---------------------");
			 }
	}



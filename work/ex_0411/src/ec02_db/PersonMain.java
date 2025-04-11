package ec02_db;

import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		PersonMethod pm = new PersonMethod();
		List<Person> persons = pm.fine();

		for (Person p : persons) {
			System.out.println("번호 : " + p.getIdx() + " 이름 : " + p.getName() + " 나이 : " + p.getAge());
		}

//		pm.addPerson(4, "구연서", 25);

	}
}

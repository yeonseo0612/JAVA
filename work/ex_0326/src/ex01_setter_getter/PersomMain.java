package ex01_setter_getter;

public class PersomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//p.age = -30; // 코드상 문제는 없음
		//필드를 private으로 선언하면 외부에서 직접 사용할 수 없다.
		//setter메서드를 통해서 통해서 필드에 값을 세팅
		p.setAge(30);
		
		System.out.println(p.getAge());
	}

}

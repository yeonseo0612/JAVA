package ex03_class;

public class ClassMain {

	public static void main(String[] args) {
		// 자동차 객체 c를 만든다.
		Car c = new Car();
		//클래스에 선언된 필드를 사용하는 법
		//객체명.필드명;
		System.out.printf("바퀴의 개수는 %d개 입니다", c.wheel);
		
		//구현한 메서드를 사용하는 방법은 필드의 사용법과 동일\
		//다른 클래스에서 메서드를 사용하려면 객체를 생성한 후 참조변수 이용해 그 객체의 메서드
		
		c.ride();
		
		
		//정적변수와 정적 메서드의 경우에는
		//객체 생성없이 사용할 수 있다.
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		Student stu1 = new Student();
		stu1.studentName = "홍길동";
		stu1.hello();
		
	}

}

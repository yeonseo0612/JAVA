package ex03_class;

public class FamilyMain {

	public static void main(String[] args) {
		
		//가족 구성원 객체를 생성
		Family father = new Family();
		Family son = new Family();
		
		//정적 변수는 클래스명.필드명을 통해 대입이나 출력을 한다. 
		father.address = "인천";
		System.out.println(son.address);
	}

}

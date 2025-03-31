package ex01_StringBulider;

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
		//append()
		//기존 문자열의 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println(str.length());
		
		//delete()
		//문자열삭제
		str.delete(0, 6); //실질적으로는 0~5까지 삭제
		System.out.println(str);
		System.out.println("문자열의 길이 :" + str.length());
		
		//insert()
		//문자열삭제
		str.insert(0, "Hello"); //실질적으로는 0~5까지 삭제
		System.out.println(str);
		System.out.println("문자열의 길이 :" + str.length());
		
		//reverse()
		//문자열을 뒤집어서 출력
		str.reverse();
		System.out.println(str);
	}
}

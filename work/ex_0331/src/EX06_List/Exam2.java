package EX06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Products{
	String p_name;
}
public class Exam2 {
	public static void main(String[] args) {
		//products라는 이름의 ArrayList를 만들고 
		List<String> prod = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품이름을 입력하세요.");
		
		while(true) {
				System.out.print("상품명 입력 : ");
				String input = sc.next();
				
				if(input.equals("exit")) {
					break;
				}
				viewProduct(prod, input);
		}
		System.out.println("최종 상품 목록 : " + prod);
		
		
		
	}
	
	//viewProduct
	//키보드에서 입력받아 상품추가
	
	
	public static void viewProduct(List<String> list, String input) {
		//상품중복되면 제거
		list.remove(input);
		//최근조회한 상품목록이 가장 앞에 나오도록 한다.
		list.add(0,input);
		System.out.println("상품 클릭 : " + input +" ->" + list);
	
	}

}

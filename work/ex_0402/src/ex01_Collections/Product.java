package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
	public static void main(String[] args) {
		List<String> orders = Arrays.asList(
			    "Alice:TV", "Bob:TV", "Alice:Phone", "Charlie:TV", 
			    "David:Tablet", "Eve:Phone", "Frank:Phone", "Alice:Phone"
			);
		
		HashMap<String, Integer> prod = new HashMap<>();
		
		for(String orderList : orders) {
			String[] orderStr = orderList.split(":");
			String product = orderStr[1]; //상품?
//			System.out.println(orderStr[1]);
			
		 prod.put(product, prod.getOrDefault(product, 0)+1);
		 
		 //가장 ㅁ낳이 주문된 상품 찾기
		 String maxProduct = null;
		 int maxCount = 0;
		 
		 for(Map.Entry<String, Integer> entry : prod.entrySet()) {
			 if(entry.getValue() > maxCount) {
				 maxProduct = entry.getKey();
				 maxCount = entry.getValue();
			 }
		 }
			System.out.println(maxProduct + " -> " + maxCount);
			
		}
		
	}
}

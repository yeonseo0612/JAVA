package ex04_array;

import java.util.Random;

public class Exam1 {
	public static void main(String[] args) {
		
//		int sum = 0;
//		  for (int i = 0; i < iArr.length; i++) {
//	            iArr[i] = i + 1;      
//	            sum += iArr[i]; 
//	        }
//		System.out.println(sum);
		Random r = new Random();
		//r.nextInt(30) + 1
				//배열의 짝수 요소들의 총합 구하기
//		int[] iArr = new int[10];
//		int sum = 0;
//		for(int i = 0; i < iArr.length; i++) {
//			int random = r.nextInt(30) + 1;
//            iArr[i] = random; 
//            if(iArr[i] % 2 == 0) {
//            	System.out.println(iArr[i]);
//            	sum += iArr[i];      	
//            }
//		}	
//		 System.out.println("총합 : " +sum);
		
		 int[] nums = {5,7,2,9,4,10,3};
		 
		 //최대최소
		
		 int max = nums[0];
		 int min = nums[0] ;
		 for(int i=0; i< nums.length; i++) { 
			 if(max < nums[i]) {			 
				 max = nums[i];
			 }
			 else if(min > nums[i]) {
				 min = nums[i];
			 }
		 }
		
		 System.out.println("최대 :" +max + ", " + "최소 :" + min); 
	}
	
	
	
	
}

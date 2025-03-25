package ex04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
		
//		 int[] nums = {5,7,2,9,4,10,3};
//		 
//		 //최대최소
//		
//		 int max = nums[0];
//		 int min = nums[0] ;
//		 for(int i=0; i< nums.length; i++) { 
//			 if(max < nums[i]) {			 
//				 max = nums[i];
//			 }
//			 else if(min > nums[i]) {
//				 min = nums[i];
//			 }
//		 }
//		
//		 System.out.println("최대 :" +max + ", " + "최소 :" + min); 
//		 //--------------------------------------------------------------------
//		 int[] nums2 = {1,2,1,3,2,1,4};
//		
//		 int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
//	        
//	        for (int i = 0; i < nums2.length; i++) {
//	            if (nums2[i] == 1) {
//	                count1++;
//	            } else if (nums2[i] == 2) {
//	                count2++;
//	            } else if (nums2[i] == 3) {
//	                count3++;
//	            } else if (nums2[i] == 4) {
//	                count4++;
//	            }
//	        }
//			System.out.println("1 :" + count1); 
//			System.out.println("2 :" + count2); 
//			System.out.println("3 :" + count3); 
//			System.out.println("4 :" + count4); 
			
//			int[] count = new int[5];
//			for(int i =0; i< nums2.length; i++) {
//				count[nums2[i]]++;
//			}
//			for(int i =1; i<=4; i++) {
//				System.out.printf(i, count[i]);
//			}
			
//			int[] nums3 = {5,3,8,4,2};
//			int asc = nums3[0];
//			//1. 버블정렬 - > 알고리즘의 하나
//			//인접한 두 요소를 비교해 큰 값을 뒤로 보내는 정렬 방식
//			//오름차순으로 정렬하세요
//			for(int i = 0; i < nums3.length -1; i++) {
//				for(int j = 0; j < nums3.length -1 - i; j++) {
//					if(nums3[j] > nums3[j+1]) {
//						
//						int temp = nums3[j];
//						nums3[j] = nums3[j+1];
//						nums3[j+1] = temp;
//					}
//				}
//				
//			}
//			System.out.println(Arrays.toString(nums3));
//			System.out.println("-----------------------------------");
//			char[] cards = {'1','L','O','2','V','3','E'};
//			String myWord = "";
//			
//			//배열에서 영문자만 추출하여 이어붙혀 출력
//			for(int i=0; i< cards.length; i++) {
//				int word = cards[i];
//				if(cards[i] > 'A' && cards[i] < 'Z') {
//					
//					myWord += (char)word;
//					
//				}
//				}
//			
//			System.out.println("단어 :" + myWord);
			
			//키보드에서 배열의 길이를 입력받는다.
			//입력받은 배열의 길이만큼 알파벳을 넣고 출력한다.
			//배열의 길이 : 5
			
//			System.out.print("배열의 길이는: ");
//			Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			
//			char c[] = new char[n];
//			char c2 = 'A';
//			
//			for(int i = 0; i < c.length; i++){
//				System.out.print(c[i] = c2++);
//			}
			
			//동전의 개수 구하기
			//10 ~ 5000사이의 난수를 변수 담기
			//1의 자리는 반드시 0이 되도록 한다
			//발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지 판단
			//가능한 적은 수의 동전을 사용한다.
			
//			int[] coin = {500, 100, 50 ,10};
//			
//			int money = r.nextInt(500)+1;
//			money *= 10;
//		
//			for(int i=0; i<coin.length; i++) {
//				
//				int result = (money/coin[i]);
//				
//				System.out.println(result);
//				
//				coin[i] %= 10;
//			}
			
			int[] coin = {500,100,50,10};
			int money = new Random().nextInt( 500 )+1;
			money *= 10;
			System.out.println("금액" + money);

			for(int i = 0; i < coin.length; i++) {
			     int res = money / coin[i];
			     System.out.println( coin[i] + "원" + res);
			     money %= coin[i];
			}
			
			int[] lotto = new int[6];
			outer : for(int i = 0; i < lotto.length;){
				lotto[i] = new Random().nextInt(45) + 1;
			
				for(int j = 0; j < i; j++){
					if(lotto[i] == lotto[j]){
						continue outer;
					}					
				}
				System.out.print(lotto[i] + " ");
				i++;						
			}
	}
}


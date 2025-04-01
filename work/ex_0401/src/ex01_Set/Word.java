package ex01_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Word {
	public static void main(String[] args) {
		//사용자가 입력한 문장에서 단어가 중복되었는지 검사하기.
		//예시
		//I love Java and I love coding
		//중복 단어 있음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요. :");
		String str = sc.nextLine(); //공백까지 포함해서 문장을 받아야하므로 nextLine
		
		String[] words = str.split(" "); // \\s+ 여러 공백을 처리하기 위해 사용

		 Set<String> wordSet = new HashSet<>();
	        boolean hasDuplicate = false;
	        
	       
	        for (String word : words) {
	            if (!wordSet.add(word)) {  //set에 넣어가며 단어가 존재할시 true 반환
	                hasDuplicate = true;
	                break;
	            }
	        }
	        
	      
	        if (hasDuplicate) {
	            System.out.println("중복 단어 있음");
	        } else {
	            System.out.println("중복 단어 없음");
	        }
	        
	        sc.close(); 
	    }
	}
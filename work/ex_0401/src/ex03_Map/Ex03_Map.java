package ex03_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03_Map {
	public static void main(String[] args) {
		//문장을 입력받고 단어별로 몇번 ㄴ등장했는지 출력하세요
		//예시
		//hello world hello java world java java
		//hello :2
		//world:2
		//java: 2
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("문장을 입력해주세요. : ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		
//		
//		Set<String> wordSet = new HashSet<>();
//  
//        for (String word : words) {
//            if (!wordSet.add(word)) {  //set에 넣어가며 단어가 존재할시 true 반환
//                count ++;
//                map.put(word, count);
//            }
//        }
//        
//        Iterator<String> iter = map.keySet().iterator();
//		while(iter.hasNext()) {
//			String val = iter.next();
//			System.out.println( val + ":"+ map.get(val));
//		}
//
//        sc.close(); 
		
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		for(String word : words) {
//			if(wordCount.containsKey(word)) {
//				//이미 키가 존재한다면 값을 1 증가
//				int count = wordCount.get(word);
//				wordCount.put(word, count+1);
//			}else {
//				//단어가 처음 나왔을 때
//				wordCount.put(word, 1);
//				
//			}
			wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
		}
		System.out.println("단어별 등장 횟수");
		for(String key : wordCount.keySet()) {
			System.out.println(key+" : " + wordCount.get(key));
		}
		//Map 인터페이스에서 제공하는 메서드
		//V getOrDefault(K key, defaultValue)
		//키가 존재하면 Value를 반환
		//키가 존재하지 않으면 defaultValue를 반환한다.
		//V replace(K key, V value)
		//put은 키가 없으면 추가가 된다.
		//replace는 키가 없으면 추가는 안된다.
		
		//V putIfAbsent(K key, V value)
		//키가 없을 경우에만 추가
		
		//키가 있을 경우 put() -> 덮어쓰기
		//putIfAbsent() -> 아무 동작도 하지 않는다.
		
		
	}
}

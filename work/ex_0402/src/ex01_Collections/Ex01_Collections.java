package ex01_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01_Collections {
	public static void main(String[] args) {
		//Collecitons
		//Java에서 컬렉션을 다룰 때 유용한 기능들을 제공하는 클래스
		//java.util.Collections패키지에 포함되어 있으며
		//모든 메서드는 정적메서드이다
		
		//sort()
		//리스트의 요소를 오름차순으로 정렬
		List<Integer> numbers = Arrays.asList(4,2,8,4,6,1,7,3);
		System.out.println("정렬 전 : " + numbers);
		Collections.sort(numbers);
		System.out.println("정렬 후 : " + numbers);
		
		//reverse(list)
		//리스트의 요소의 순서를 내림차순으로 정렬
		Collections.reverse(numbers);
		System.out.println("내림차순으로 정렬 후" + numbers);
		
		//shuffle(list)
		//리스트 요소를 무작위로 섞음
		Collections.shuffle(numbers);
		System.out.println("정렬 후" + numbers);
		
		//min(list)
		//컬렉션에서 최소값을 찾는다
		int min = Collections.min(numbers);
		System.out.println("최소값 " + min);
		//min(list)
		
		//컬렉션에서 최대값을 찾는다
		int max = Collections.max(numbers);
		System.out.println("최대값 " + max);
		
		//set이나 map은 list로 변환한 다음 사용해야 한다.
		
		
	}
}

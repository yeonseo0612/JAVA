package ex02_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam1 {
	public static void main(String[] args) {
		//짝수만 출력하기
		List<Integer> numers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> evens = numers.stream()
                .filter(n -> n % 2 == 0) // 짝수만 필터링
                .collect(Collectors.toList()); // 리스트로 변환
		System.out.println(evens);
		
		//문자열대문자로 변환하여 리스트로 수집하기
		List<String> words = Arrays.asList("Java","stream","lamda");
		List<String> wordsList = words.stream().map(String::toUpperCase).collect(Collectors.toList()); // 리스트로 수집
		
		System.out.println(wordsList);
		
		
	System.out.println("----------------------------------");
	}
}

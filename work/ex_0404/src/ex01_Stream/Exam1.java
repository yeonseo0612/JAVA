package ex01_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	
}
public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//짝수만 출력
		numbers.stream()
	    .filter(t -> t % 2 == 0)  
	    .forEach(System.out::println); 
		
		//kim으로 시작하는 이름만 골라서 대문자 변환 후 알파벳순으로 정렬
		List<String> names = Arrays.asList("kim chulsoo", "lee younghee","park minsue", "kim younghee", "choi gildong");
		
		names.stream().filter(t -> t.startsWith("kim")).map(t -> t.toUpperCase()).sorted()
			.forEach(System.out::println);
		
		//짝수의 제곱값만 모아서 리스트로 반환하기
		List<String> num = Arrays.asList("1", "2", "3", "4", "5", "6");
		
		List<Integer> nums = num.stream().map(t -> Integer.parseInt(t)).filter(t -> t % 2 == 0).map(t -> t = (t*t)).collect(Collectors.toList());
		
		System.out.println(nums);

		List<Student> stus = Arrays.asList(
								new Student("홍길동",90),
								new Student("김길동",20),
								new Student("손길동",30),
								new Student("박길동",50),
								new Student("고길동",10)
				);
		
		Stream<Student> stream = stus.stream();
		//ifPresent()
		//Optional클래스에서 제공하는 메서드로]
		//값이 존재할 경우에만 어떤 동작을 수행하고싶을 때 사용하는 메서드
		//Optional안에 값이 있으면 Consumer<T>를 실행하고 값이 없으면 아무 일도 하지 않는다.
		stream.max(Comparator.comparing(Student::getScore)).ifPresent(t -> System.out.println(t.getName()));
		
		//orElse(default)
		//값이 없으면 기본값을 반환
		//ifPresentOrElse(value, default)
		//값이 있으면 value, 값이 없으면 default
		
		
		

		

	}
}

package ex01_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class User{
	String name;
	int age;
	int score;
	
	public User(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	
	  @Override
	    public String toString() {
	        return String.format("%s (age : %d, score : %d)", name, age, score);
	    }
	}



public class Ex03_Comparator {
	public static void main(String[] args) {
		//Comparator
		//자바에서 정렬 기준을 정의할 때 사용하는 함수형 인터페이스
		//compare(T t1, T t2);
		//음수 : t1 < t2
		//0 : t1 == t2
		//양수 : t1 > t2
		
		List<String> list = Arrays.asList("apple","kiwi","banana");
		
		list.stream().sorted((t1, t2) -> t1.length() - t2.length()).forEach(System.out::println);
		
		//Java8에서 추가된 정렬 기준 생성 메섣,
		//comparing(Function<T,U> keyExtractor)
		//특정 필드나 메서드를 기준으로 정렬
		
	
		list.stream()
	    .sorted((o1, o2) -> o1.length() - o2.length()) // 직접 비교하는 방법
	    .forEach(System.out::println);
		
		list.stream()
	    .sorted(Comparator.comparingInt(String::length))
	    .forEach(System.out::println);
		
		//themComparing()
		//1차 기준으로 정렬하고, 값이 같을경우 2차, 3차 기준으로 정렬하는 방식
		
		   List<User> users = Arrays.asList(
	                new User("Alice", 25, 90),
	                new User("Bob", 25, 95),
	                new User("Charlie", 27, 85),
	                new User("David", 25, 90),
	                new User("Eve", 20, 95)
	        );
		   
//		Stream<User> stream = users.stream()
//	            .sorted(Comparator.comparing(User::getAge)
//	                    .thenComparingInt(User::getScore)
//	                    .thenComparing(User::getName))
//	            .forEach(System.out::println);  // Print each sorted User object
//	    }
//	}
}
}

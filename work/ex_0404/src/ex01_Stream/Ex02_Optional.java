package ex01_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Ex02_Optional {
	public static void main(String[] args) {
		//스트림의 최종결과를 Optional로 반환하는 것들이 있었다.
		//제네릭 클래스로 T타입의 객체를 감싸는 Wrapper클래스이다.
		
		Optional<String> optStr = Optional.of("abcde");
		//optStr에 들어있는 글자의 수를 반환받기
		Optional<Integer> optInt = optStr.map(t -> t.length());
		
		System.out.println(optInt.get());
		System.out.println(optStr.get());
		//autoBox, unbox	`6+
		
		int result1 = Optional.of("123").filter(x->x.length() > 0).map(Integer::parseInt).get();
		//OptionalInt optInt = OptionalInt.empty();
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt);
		System.out.println("result1="+result1);
		
		//Iidentity : 초기값 0
		//accumulator : 누적함수 (a,b) -> a + b;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum = list.stream().reduce(0, (a,b) -> a+b);
		System.out.println("list의 모든 요소의 총 합 : " + sum);
		
		//IntStream과 같은 기본형 스트림에는 스트림의 요소들에 대한 통계 정보 얻을 수 있는 메서드들이 있다.
		
		//sum()
		int sum2 = IntStream.of(1,2,3,4,5).sum();
		
		OptionalDouble res = IntStream.of(1,2,3,4,5).average();
		System.out.println(res.getAsDouble());
		
		IntStream.of(1,2,3,4,5).min();
		
	}
}

package ex05_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_Generic {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>(Arrays.asList(1,2,3));
		List<String> stringList = Arrays.asList("apple", "banana");
		System.out.println(lists);
		System.out.println(stringList);
	}
//	
//	//Number와 그 자식클래스가지만 허용한다.
//	public static void print(List<? extends Number> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//	}
//	
	//Integer를 포함한 부모타입까지만 허용한다.
	public static void print(List<? super Integer> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}
}

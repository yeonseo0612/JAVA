package ex05_Generic;

import java.util.ArrayList;
import java.util.List;

//class Gen<T>{
//
//	public void printArr(T[] int_list){
//		for(int i =0; i< int_list.length; i++) {
//			System.out.print(int_list[i]);
//		}
//	}
//};
//
//
//public class GenericExam {
//	//Gen클래스를 만들어 제네릭타입 T를 가지는 printArr메서드를 생성한다.
//	//printArr메서드 내부에서 배열을 순차적으로 출력하는 코드를 작성
//	//main에서 Integer, Double, Character배열을 각각만든 뒤
//	//Gen클래스의 printArr메서드를 각각 호출하여 배열의 내용을 출력하자.
//	//결과
//	// 1 2 3 4 5
//	// 1.1 2.2 3.3 4.4 5.5
//	// A B C D E
//	public static <T> void main(String[] args) {
//		Gen<T> gen = new Gen<T>();
//		
//		
//		int[] int_list = {1,2,3,4,5};
//			
//		double[] double_list = {1.1, 2.2, 3.3, 4.4, 5.5};
//			
//		char[] char_list = {'A','B','C','D','E'};
//			
//	
//		gen.printArr((T[])int_list);
//	
//		
//		
//		
//	}
//}
class Gen<T> {

    public void printArr(T[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();  // 출력 후 줄 바꿈
    }
}

public class GenericExam {

    public static void main(String[] args) {
     
        Gen<Integer> genInt = new Gen<>();    // Integer 배열 처리
        Gen<Double> genDouble = new Gen<>();   // Double 배열 처리
        Gen<Character> genChar = new Gen<>();  // Character 배열 처리
        
        // 각 배열을 생성
        Integer[] int_list = {1, 2, 3, 4, 5};    // Integer 배열
        Double[] double_list = {1.1, 2.2, 3.3, 4.4, 5.5};  // Double 배열
        Character[] char_list = {'A', 'B', 'C', 'D', 'E'};  // Character 배열
        
        genInt.printArr(int_list);
        genDouble.printArr(double_list);
        genChar.printArr(char_list);
        
        
        Gen g1 = new Gen();
        //컴파일러가 전달된 인자의 타입을 보고 타입을 추론한다.
        g1.printArr(int_list);
        g1.printArr(double_list);
        g1.printArr(char_list);
        //타입의 명시
        g1.<Integer>printArr(int_list);
        g1.<Double>printArr(double_list);
        g1.<Character>printArr(char_list);
    }
}
package ex04_array;

public class Exam1 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		int sum = 0;
		  for (int i = 0; i < iArr.length; i++) {
	            iArr[i] = i + 1;  
	            sum += iArr[i]; 
	        }
		System.out.println(sum);
		
	}
}

package ex04_exam;

import java.util.Random;

public class MainPhoto {

	public static void main(String[] args) {
		int[] num = new int[100];
		
		int[] count = new int[10];
			for(int i = 0; i < num.length; i++){
			
	
		System.out.print(num[i] = new Random().nextInt(10));
		}
			System.out.println();
			for(int i = 0; i < num.length; i++){
			count[num[i]]++;
			PrintGraph pg = new PrintGraph();
				for(int j = 0; j < count.length; j++){
					System.out.println(i + "의 갯수 : " + pg.print('#', count[j]) + " " + count[j]);
		        }	

	}

	}
	}

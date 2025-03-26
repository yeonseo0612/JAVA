package ex04_exam;

import java.util.Arrays;
import java.util.Random;

public class MainPhoto {

	public static void main(String[] args) {
		int[] num = new int[100];
		
		int[] count = new int[10];
		
		//100개의 공간에 난수를 할당
			for(int i = 0; i < num.length; i++){
				num[i] = new Random().nextInt(10);
		}
			System.out.println();
			for(int i = 0; i < num.length; i++){
			count[num[i]]++;
			}
			System.out.println(Arrays.toString(count));
				
			PrintGraph pg = new PrintGraph();
					for(int i = 0 ; i < count.length; i++) {
						System.out.printf("%d의 개수 : %s %d\n ",i,pg.print('#', count[i]),count[i]);
					}
			
				

	}

	}
	

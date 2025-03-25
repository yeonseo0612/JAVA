package ex01_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
//		int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
//		
//		//배열 arr의 총합과 평균을 구하시오
//		
//		  int sum = 0;
//	        float avg = 0;
//	        int total_count = arr.length * arr[0].length;
//
//	        
//	        for (int i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                sum += arr[i][j];
//	            }
//	        }
//	        
//	      
//	        avg = (float) sum / total_count;
//
//	     
//	        System.out.println("총합 : " + sum);
//	        System.out.println("평균 : " + avg);
//	    System.out.println("---------------------------------");
	    //학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
	    //학생들의 수학과 영어성적을 등록하는 프로그램
	    //1. 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받는다.
	    //2. 입력받은 수 만큼 학생들의 이름, 수학, 영어성적을 입력받는 프로그램 작성.
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print
	    ("몇명의 학생 정보를 저장하시겠습니까? : ");
	    int num = sc.nextInt();
	    String[][] stu_arrays = new String[num][3];
	    System.out.print("등록한 인원 수 : " + num + "\n");
	    for(int i = 0; i < stu_arrays.length; i++) {
	    		
	    		System.out.print("학생의 이름을 입력해주세요 : ");
	    		stu_arrays[i][0] = sc.next();
	    		System.out.print("학생의 수학성적을 입력해주세요 : ");
	    		stu_arrays[i][1] = sc.next();
	    		System.out.print("학생의 영어성적을 입력해주세요 : ");
	    		stu_arrays[i][2] = sc.next();
	    		System.out.println("------------------------------");

	    }
	    System.out.println(num + "등록완료!");
	    	for(int i = 0; i < stu_arrays.length; i++){
			
			for(int j = 0; j < stu_arrays[i].length; j++){
				System.out.print(stu_arrays[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

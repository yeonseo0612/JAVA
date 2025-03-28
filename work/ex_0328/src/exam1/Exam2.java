package exam1;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		
		//입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하시오.
		
		Scanner sc = new Scanner(System.in);
		
//		int count = 0;
//		
//		try {
//			System.out.println("특수문자를 제외한 알파벳을 무작위로 받으시오.");
//			String str = sc.next();
//			
//			for(int i = 0; i < str.length(); i++) {
//				if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
//					char str_b = str.charAt(i);
//					 if(str_b == 'a') {
//						 count++;
//					 }	 
//				}else{
//					throw new IllegalArgumentException("특수문자나 숫자가 포함된 입력은 허용되지 않습니다.");
//                }
//            }
//
//            // 결과 출력
//            System.out.println("소문자 a의 개수 : " + count);
//
//        } catch (IllegalArgumentException e) {
//            // 예외 발생 시 처리
//            System.out.println("입력 오류: " + e.getMessage());
//        } finally {
//            sc.close();  
//        }
		
		//생일과 성별구하기
		//예시
		//주민번호를 모두 입력하세요(-포함)
		//911223-103345
		//당신은 1999년 12월 23일에 태어난 남자입니다.
		
//		String gender = "남자";;
//		String year = "";
//		String birth = "";
//		System.out.println("주민번호를 모두 입력하세요(-포함)");
//		String person_num = sc.next();
//		try {
//			if(person_num.contains("-")) {
//				if(person_num.charAt(9) == '1') {
//						gender = "남자";
//					}else if(person_num.charAt(9) == '2'){
//						gender = "여자";
//					}else {
//						System.out.println("잘못된 주민번호입니다.");
//						
//					}
//				
//				if(person_num.charAt(1) == '9') {
//					year = "19";
//				}else if(person_num.charAt(1) == '0') {
//					year = "20";
//				}
//				System.out.println("당신은" + year + person_num.substring(0,1)+"년"
//									+ person_num.substring(2,3)+"월" + person_num.substring(4,5)+"일에 태어난 "
//									+ gender+"입니다.");
//				
//			}else{
//				System.out.println("-을 포함해 주세요");
//				person_num = sc.next();
//			}
//			
//		} catch (Exception e) {
//			System.out.println("잘못된 입력입니다.");
//		}finally {
//			sc.close();
//		}
		
		
		
		//회문 판별하기
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		//키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다.
		//아니면 xxx는 회문이 아닙니다 출력
		
		System.out.println("문자열을 입력해주세요");
		String str = sc.next();
		
	
		String rv_res = "";
			for(int j = str.length()-1; j >= 0; j--) {
				 rv_res += str.charAt(j);
				
			}
		
		if(str.equals(rv_res)) {
			System.out.println(str + "은 회문입니다.");
		}else {
			System.out.println(str + "은 회문이 아닙니다.");
		}
		
		
		
		
		
		
    }
}
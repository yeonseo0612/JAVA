package exam1;

import java.util.Random;
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
//클래스 타입 변환
//자동형변환
//자식 -> 부모
//ㄴ 자식 타입에 정의되어 있던 필드나 메서드를 사용할 수 없다.
//ㄴ 단, 오버라이딩 된 메서드는 사용할 수 있다.
//강제형변환
//부모 -> 자식
//ㄴ (자식클래스)부모객체;
//
//다형성
//상속 + 오버라이딩 + 클래스 타입변환
//
//class Family{
//String food;
//String name;
//String age;
//
//}
//
//class Father extends Family{
//String 수염
//@Override
//public void sleep(){
//드르렁 쿨쿨
//}
//}
//class Mother extends Family{}
//class Child extends Family{}
//class Pet extends Family{}
//
//class House{
//
//	Family member1;
//	Family member2;
//	Famliy member3;
//		ㄴ 너무 구체화 하지 않기
//
//}
//
//
//추상화
//공통적인 본질을 모아서 추출하는 것 
//기존 클래스들의 공통적인 요소를 모아 상위 클래스를 만들어내는 기술
//
//추상클래스
//ㄴ 추상메서드
//ㄴ 일반 필드
//ㄴ 일반 메서드
//ㄴ 다중 상속 x
//ㄴ 관련있는 클래스들
//
//인터페이스
//ㄴ 상수
//ㄴ 추상메서드
//ㄴ static메서드
//ㄴ default로 선언된 일반 메서드도 가능
//ㄴ 인터페이스 끼리는 다중 상속 가능
//ㄴ 상관없는 것들도 구현해도 된다
//
//추상클래스, 인터페이스 모두 직접 객체를 생성하는 것은 불가능하다
//
//추상클래스 - > 추상클래스를 상속받는 자식 클래스 -> 자식클래스의 객체를 만들어서 사용
//
//인터페이스 -> 인터페이스를 구현하는 클래스 -> 구현클래스의 객체를 만들어서 사용
//
//Main{
//House h = new Houser();
//h.member1 = new Father();
//h.member2 = new Mother();
//h.member3 = new Child();
//}
//
//class Parent{}
//
//class Child1 extends Parent{}
//
//class Child2 extends Parent{}
//
//class Child3 extends Parent{}
//
//
//
//오류, 예외
//
//Throwable
//Exception
//nullpointer
//numberformat
//aritmetic
//arrayIndexoutof
//
//try{
//	예외가 발생할 수 있는 구문
//}catch(Exception e){
//	예외가 발생했을 때 처리
//}
//
//예외던지기
//throws 예외클래스, 예외클래스
//
//메서드 내부에서 예외를 처리하지 않고, 메서드를 호출한쪽에서 예외를 처리해주는 것
//
//throw -> 예외를 강제로 발생시킨다.
//
//사용자정의 예외
//Exception 클래스를 상속받는다.
//
//
//사용자지정의 예외
//exception클래스를 상속
//book클래스를 만들어 책 제목과 저자를 저장하도록 하고
//toString()을 오버라이딩 책 정보를 추력
//
//책 제모기 자바의 정석, 저자; 남궁성
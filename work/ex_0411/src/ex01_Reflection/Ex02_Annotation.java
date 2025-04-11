package ex01_Reflection;

import java.lang.annotation.Annotation;

public class Ex02_Annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex02_Annotation.class.getAnnotations();
		
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = (TestInfo)Ex02_Annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.value()); //테스트 정보 출력
	}
}

package ex06_annotation;


@TestInfo(name = "홍길동", skills = {"Java","Spring"})
public class Ex02_Annotation {
	public static void main(String[] args) {
		Ex02_Annotation.class.getAnnotations();
	}
}

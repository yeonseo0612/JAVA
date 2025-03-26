package ex04_overloading;

public class ConverterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter cv = new Converter();
		
		System.out.println("cm -> m 변환 : "+cv.convert(4));
		System.out.println();
		System.out.println("m, inch -> cm 변환 : "+cv.convert(0.04, "m"));
		
	}

}

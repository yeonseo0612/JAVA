package ex04_overloading;

public class BreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread bread = new Bread();
		
		bread.makeBread();
		System.out.println("====================================");
		bread.makeBread(5);
		System.out.println("====================================");
		bread.makeBread(5,"크림");
	}

}

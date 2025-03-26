package ex04_overloading;

public class Converter {
	
	
	
	//cm -> m로 변환하는 convert
	public double convert(double n) {
		double num = 0;
		num = n * 0.01;
		
		return num ;	
	}
	//m,inch -> cm로 변환하는 convert
//	public String convert(double m, double inch) {
//		double num_1 = 0;
//		double num_2 = 0;
//		num_1 = m * 100;
//		num_2 = inch * 2.54;
//		
//		String convert = "m : " + num_1 + "," + " inch :" + num_2;
//		
//		return convert ;	
//	}
	//
	public double convert(double value, String unit) {
		if(unit.equals("m")) {
			return value * 100.0;
		}else if(unit.equals("inch")) {
			return value * 2.54;
			}else {
				return 0;
			}
	}

}

package ex03_Polymorphism;

public class ComputerRoom {

	
//	Samsung com1;
//	Samsung com2;
	
//	LZ com1;
//	LZ com2;

//	Computer com1;
//	Computer com2;
	
	Apple com1;
	Apple com2;
	
	public void allPowerOn() {
		com1.powerOn();
		com1.powerOn();
	}
	
	public void allPowerOff() {
		com2.powerOff();
		com2.powerOff();
	}
}

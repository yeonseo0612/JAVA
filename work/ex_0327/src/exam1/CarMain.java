package exam1;

public class CarMain {
public static void main(String[] args) {
	
	Car c = new Car(10);
	c.showCurrentGauge();
	
	System.out.println("---------------------------------------");
	
	HybridCar hc = new HybridCar(10, 20);
	hc.showCurrentGauge();
	
	System.out.println("---------------------------------------");
	
	HybridWaterCar hw = new HybridWaterCar(10, 20, 30);
	hw.showCurrentGauge();
	
}
}

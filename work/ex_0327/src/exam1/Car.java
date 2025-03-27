package exam1;

public class Car {
	int gasGauge;
	
	 
	public Car(int gasGauge) {
		 this.gasGauge = gasGauge; 
	}

	public void showCurrentGauge() {
		System.out.println("가스잔여량 : " + gasGauge);
	}

}

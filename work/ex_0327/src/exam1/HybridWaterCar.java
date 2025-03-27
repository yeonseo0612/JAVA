package exam1;

public class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		System.out.println("가스잔여량 : " + super.gasGauge);  // 부모 클래스의 gasGauge 접근
        System.out.println("잔여 전기량 : " + super.electricGauge);  // 자식 클래스의 electricGauge 접근
        System.out.println("잔여 물양 : " + this.waterGauge);
	}
}

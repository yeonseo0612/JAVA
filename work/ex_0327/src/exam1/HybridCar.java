package exam1;

public class HybridCar extends Car {
	 int electricGauge;
	
	 public HybridCar(int gasGauge, int electricGauge) {
	        super(gasGauge);  // 부모 클래스의 생성자 호출 (가스 잔여량 초기화)
	        this.electricGauge = electricGauge;  // 자식 클래스의 전기 잔여량 초기화
	    }

	    @Override
	    public void showCurrentGauge() {
	        // 부모 클래스의 gasGauge와 자식 클래스의 electricGauge를 출력
	        System.out.println("가스잔여량 : " + super.gasGauge);  // 부모 클래스의 gasGauge 접근
	        System.out.println("잔여 전기량 : " + this.electricGauge);  // 자식 클래스의 electricGauge 접근
	    }
	
}

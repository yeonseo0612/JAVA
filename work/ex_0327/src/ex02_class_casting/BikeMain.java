package ex02_class_casting;

public class BikeMain {
public static void main(String[] args) {
	Bike b = new FourWheelBike("길동");
	b.info();
//	b.ride();
//	b.addwheel();
	
	//자식타입으로 다시 변환을 해줌으로써 부모 타입에서는 사용하지 못했던 자식의 멤버들을 모두 사용할 수 있게되었다.
	 FourWheelBike fwb = (FourWheelBike)b;
	 
	 fwb.addwheel();
	 fwb.info();
	 
}
}

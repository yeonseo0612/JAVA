package ex01_ThreadMethod;

public class JoinExample extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <=5; i++) {
			System.out.println("작업 스레드 : " + i);
		}
	}
}

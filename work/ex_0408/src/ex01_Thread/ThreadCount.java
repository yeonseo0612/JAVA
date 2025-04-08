package ex01_Thread;

public class ThreadCount implements Runnable{

	private int n;
	
	//1.생성자를 통해 전달한다.
	public ThreadCount(int n) {
		this.n = n;
	}
	//2.setter를 통해 받는다.
	public void setN(int n) {
		this.n = n;
	}
	@Override
		public void run() {		
		for(int i = n; i >= 0; i--){
			
			try {
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (Exception e) {
			}
		}
		System.out.println("종료");
		}
}
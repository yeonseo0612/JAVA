package ex02_synchronized;

public class SynchronizedEx implements Runnable {
	private long money = 10000;
	
	//클래스에 대한 정보를 담을 수 있다.
//	Class cls = SynchronizedEx.class;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub\
		//SynchronizedEx.class : SynchronizedEx 클래스 자체
		//SynchronizedEx클래스에 락을 걸겠다.
		//하나의 스레드가 이미 점유중이라면 다른 스레드가 사용할 수 없다.
		
		synchronized (SynchronizedEx.class) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if(getMoney() <= 0) {
					break;
				}
				outMoney(1000);//메서드 호출
			}
		}
	}
	
	public void setMoney(long money) {
		this.money = money;
	}

	public long getMoney() {
		return money;
	}

	public void outMoney(long money) {
		String threadName = Thread.currentThread().getName();
		
		if(getMoney() > 0) {
			this.money -= money;
			System.out.println(threadName + " - 잔액 : " + getMoney() + "원");
		}else {
			System.out.println("잔액이 없습니다.");
		}
	}

}

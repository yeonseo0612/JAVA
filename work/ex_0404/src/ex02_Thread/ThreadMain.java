package ex02_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		
		 for(int i = 0; i < 10; i++) {
			 System.out.println("메인함수 진행중" + i);
		 }
		
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		
		RunableTest t2 = new RunableTest();
		
		Thread t = new Thread(t2);
		t.start();
		//main도 하나의스레드이다
		 		System.out.println("현재 실행되고 있는 스레드의 이름: " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태: " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위: " + Thread.currentThread().getPriority());
		
	}
}

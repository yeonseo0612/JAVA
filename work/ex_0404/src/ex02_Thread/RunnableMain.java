package ex02_Thread;

public class RunnableMain {
		public static void main(String[] args) {
		       Runnable task1 = () -> {
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread 1 - i: " + i);
		                try {
		                    Thread.sleep(1000); // 1초 대기
		                } catch (InterruptedException e) {
		                    System.out.println("Thread was interrupted: " + e.getMessage());
		                }
		            }
		        };
		        
		        Runnable task2 = () -> {
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread 1 - i: " + i);
		                try {
		                    Thread.sleep(1000); // 1초 대기
		                } catch (InterruptedException e) {
		                    System.out.println("Thread was interrupted: " + e.getMessage());
		                }
		            }
		        };
		        
		        Runnable task3 = () -> {
		            for (int i = 0; i < 5; i++) {
		                System.out.println("Thread 1 - i: " + i);
		                try {
		                    Thread.sleep(1000); // 1초 대기
		                } catch (InterruptedException e) {
		                    System.out.println("Thread was interrupted: " + e.getMessage());
		                }
		            }
		        };

			Thread thread1 = new Thread(task1);
			Thread thread2 = new Thread(task2);
			Thread thread3 = new Thread(task3);
			
			thread1.start();
			thread2.start();
			thread3.start();
			
			
			
		
	}
}

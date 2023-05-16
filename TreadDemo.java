public class TreadDemo {

	public static void main(String[] args) {
		Thread tread1=new Thread(new Task1());
		Thread tread2=new Thread(new Task2());
		
		tread1.start();
		tread2.start();
		
		try {
			tread1.join();
			tread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("All Threads Are Excecuted..");
		}
	static class Task1 implements Runnable {
		public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println("Task1 :"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static class Task2 implements Runnable{
		public void run() {
			for(int i=10;i<=15;i++) {
				System.out.println("Task2: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

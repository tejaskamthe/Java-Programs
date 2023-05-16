class threaddemo{
	public static void main(String[] args) {
	Thread t1=new Thread(new task1());
	Thread t2=new Thread(new task2());

	t1.start();
	t2.start();

	try{
		t1.join();
		t2.join();
	}	 
	catch(InterruptedException e){
		System.out.println(e);
	}
	System.out.println("All Threads are Executed..");
}

static class task1 implements Runnable{
	public void run(){
		double a=10;
		double b=10;
		System.out.println("Addition of A and B : "+(a+b));
	}
static class task2 implements Runnable{
	public void run(){
	double p=10;
	double q=10;
	System.out.println("Multiplication of A and B : "+(p*q));
}
}
}
}
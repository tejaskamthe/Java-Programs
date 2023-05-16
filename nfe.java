class nfe{
	public static void main(String[] args) throws InterruptedException {
	
	try{
		for(int i=1;i<=10;i++){
			System.out.println(i);
			Thread.sleep(1000);
		}

	
	}
	catch(ArithmeticException e){System.out.println("This Is not Possible To Devide By Zero");}
	
	finally{
		System.out.println("TEJAS KAMTHE");
	}
	}

}
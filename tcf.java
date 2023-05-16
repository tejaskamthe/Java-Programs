//TrY-Catch-Finally
class tcf{
	public static void main(String[] args) {
	try{
		String st="tejas";
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		System.out.println(st.toUpperCase());

	}	
	catch(ArithmeticException e){
		System.out.println(e);
	}
	finally{
		System.out.println("kamthe");

	}
	System.out.println("Pune");
	}
}
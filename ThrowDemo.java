import java.util.*;
class ThrowDemo{
	static int a=10,b=2,c;
	public static void div(){
		if(b==0){
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
		
	}
	public static void main(String[] args)throws ArithmeticException {
			div();	
	}
}
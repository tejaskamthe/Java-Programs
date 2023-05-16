package programjava;

public class ArithmaticException {
	public static void div() throws UserdefineException {
		int a=20,b=0;
		if(b==0)
		{
			throw new UserdefineException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
		
	}
	public static void main(String[] args)throws UserdefineException {
		div();
	}

}

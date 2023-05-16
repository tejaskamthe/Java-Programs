//import java.util.Scanner;

class cmdarg{
	public static void main(String[] args) {
		int a,b,c;
		//Scanner sc=new Scanner(System.in);
		System.out.println(" a Character:");
		//a=sc.next();
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("Addition Is:"+c);
	}
}
package Assignment1;
import java.util.Scanner;
public class reverseno {

	public static void main(String[] args) {
		int n,p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No :");
		n=sc.nextInt();
		while(n>0) 
		{
			p=n%10;
		System.out.print(p);
		n=n/10;
	}
	}
}

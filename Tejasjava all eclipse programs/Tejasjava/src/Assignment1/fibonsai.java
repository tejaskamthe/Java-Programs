package Assignment1;
import java.util.Scanner;
public class fibonsai {
	public static void main(String[] args) {
		int a=0,b=1,i,n,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Limit :");
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(i=2;i<=n;i++) {
			c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
		}
	}

}

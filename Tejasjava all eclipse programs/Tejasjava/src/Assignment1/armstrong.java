package Assignment1;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int n;
		int c;
		int p;
		int arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The no:");
		n=sc.nextInt();
		c=n;
		while(n>0) {
			p=n%10;
			arm=(p*p*p)+arm;
			n=n/10;
		}
		if(arm==c)
			System.out.println("This is Armstrong No.. ");
		else
			System.out.println("This is Not Armstrong No..");

	}

}

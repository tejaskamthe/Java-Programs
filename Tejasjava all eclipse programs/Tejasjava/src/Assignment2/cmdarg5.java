package Assignment2;
import java.util.Scanner;
public class cmdarg5 {

	public static void main(String[] args) {
		int m, a[]=new int[50],sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many No. Do You Wnat:");
		m=sc.nextInt();
		for(i=0;i<m;i++) {
			a[i]=Integer.parseInt(args[i]);
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum Of No :"+sum);
	}

}

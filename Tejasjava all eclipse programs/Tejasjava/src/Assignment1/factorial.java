package Assignment1;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int n;
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("Fatorial Of No. is : "+f);

	}

}

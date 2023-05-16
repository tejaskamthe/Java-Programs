package Assignment1;
import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
	int n,i,num=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The No: ");
	n=sc.nextInt();
	for(i=1;i<=n;i++) {
		if(n%i==0) {
			num++;
		}
	}
	if(num==2) {
		System.out.println("This Is A Prime No..");
	}
	else
		System.out.println("This Is Not a Prime No..");

	}

}

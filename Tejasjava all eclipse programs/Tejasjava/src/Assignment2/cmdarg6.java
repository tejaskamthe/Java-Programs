package Assignment2;

public class cmdarg6 {

	public static void main(String[] args) {
		int n,sum=0,p;
		System.out.println("Enter The No:");
		n=Integer.parseInt(args[0]);
		System.out.println(n);
		while(n>0) {
			p=n%10;
			sum=sum+p;
			n=n/10;
		}
		System.out.println("Sum of 3 Digits :"+sum);
	}

}

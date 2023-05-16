package programjava;
import java.util.Scanner;
class evanodd{
	public static void main(String[] argv) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No. To Check NO. is Evan Or Odd:");
		n=sc.nextInt();
		if(n%2==0) 
		System.out.println("No is Evan..");
		else
			System.out.println("No Is Odd..");
		
	}
	
	
}

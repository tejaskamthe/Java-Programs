package Assignment1;
import java.util.Scanner;
public class voteeligible {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age to Check You Are eligible for vote Or not:");
		age=sc.nextInt();
		if(age>=18)
		System.out.println("You Are Eligible For Votting..");
		else 
			System.out.println("You Are Not Eligible..");
	}

}

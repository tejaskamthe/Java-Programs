package Assignment1;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Year: ");
		year=sc.nextInt();
		if(year%4==0)
			System.out.println("This is a Leap Year..");
		else
			System.out.println("This is Not Leap Year..");

	}

}

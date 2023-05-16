package programjava;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		int num;
		int a=20;
		int b=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Addition,2 for Subtration,3 for Multiplication,4 For Division:");
		num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Addition: "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction: "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication: "+(a*b));
			break;
		case 4:
			System.out.println("Division: "+(a/b));
			break;
			default:
				System.out.println("Invalid Condition");
				break;
				
		}	

	}

}

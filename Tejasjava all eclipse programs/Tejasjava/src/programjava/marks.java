package programjava;

import java.util.Scanner;
class marks{
	public static void main(String[] args) {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sudent Marks To Check The Class:");
		mark=sc.nextInt();
		if(mark>=80) {
			System.out.println("Merit..");
		}
		else if(mark>=60) {
			System.out.println("First Class");
		}
		else if(mark>=50) {
			System.out.println("Second Class..");
		}
		else if(mark>=35) {
			System.out.println("Pass..");
		}
		else {
			System.out.println("Fail..");
		}
	}
}
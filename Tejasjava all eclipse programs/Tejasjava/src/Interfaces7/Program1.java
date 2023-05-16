package Interfaces7;

import java.util.Scanner;

interface relational{
	void greaterThan();
	void lessThan();
	void greterThaneq();
	void lessThaneq();
}
class ImplRel implements relational{
	int a,b;
	ImplRel(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void greaterThan() {
		if(a>b) {
			System.out.println("A is Greter Than B");
		}
		else {
			System.out.println("B is Greter Than A");
		}
	}
	public void lessThan() {
		if(a<b) {
			System.out.println("A is Less Than B");
		}
		else {
			System.out.println("B is Less Than A");
		}
	}
	public void greterThaneq() {
		if(a>=b) {
			System.out.println("A is Greter Than Equal to B");
		}
		else {
			System.out.println("A is Not Greater Than Equal to B ");
		}
	}
	public void lessThaneq() {
		if(a<=b) {
			System.out.println("A is Less Than Equal to B");
		}
		else {
			System.out.println("A is Not Less Than Equal to B");
		}
	}

}
public class Program1 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of A :");
		x=sc.nextInt();
		System.out.println("Enter The Value Of B :");
		y=sc.nextInt();
		ImplRel i=new ImplRel(x,y);
		i.greaterThan();
		i.greterThaneq();
		i.lessThan();
		i.lessThaneq();
	}
}

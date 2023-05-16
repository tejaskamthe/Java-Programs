package programjava;

import java.util.Scanner;

interface Square{
	void cal1();
}
interface Circle extends Square{
	void cal2();
}
public class Area implements Circle {
		int s,r;
		float pi;
		Scanner sc=new Scanner(System.in);
		public void cal1() {
			System.out.print("Enter The Side of Square :");
			s=sc.nextInt();
			System.out.println("Area of Square :"+(s*s));
		}
public void cal2() {
	System.out.print("Enter The Radius of Circle :");
	r=sc.nextInt();
	System.out.println("Area of Square :"+(3.14*(r*r)));
}
public static void main(String[] args) {
	Area a=new Area();
	a.cal1();
	a.cal2();
	}

}

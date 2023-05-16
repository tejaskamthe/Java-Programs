package Interfaces7;

import java.util.Scanner;

interface MyMaths{
	double squ(double a);
	double cube(double a);
	double cuberoot(double b);
}
class ImplMaths implements MyMaths{
	Scanner sc=new Scanner(System.in);
	
	public double squ(double a) {
		double s=a*a;
		System.out.println("Square ="+s);
		return s;
	}
	public double cube(double a) {
		double ss=a*a*a;
		System.out.println("Cube ="+ss);
		return ss;
	}
	public double cuberoot(double b) {
		double x=Math.cbrt(b);
		System.out.println("CubeRoot ="+x);
		return x;
			
		}
	}
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value of A");
		double a=sc.nextDouble();
		System.out.println("Enter The Value of B");
		double b=sc.nextDouble();
		ImplMaths m=new ImplMaths();
		m.squ(a);
		m.cube(a);
		m.cuberoot(b);

	}

}

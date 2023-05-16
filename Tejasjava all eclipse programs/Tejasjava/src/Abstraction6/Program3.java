package Abstraction6;
import java.util.*;
abstract class Shape{
	Scanner sc=new Scanner(System.in); 
	public abstract void area(); 
}
class Circle extends Shape{
	public void area() {
		double pi=3.14,r;
		System.out.println("Calculate Area Of Circle ");
		System.out.println("Enter The Radius Value ");
		r=sc.nextInt();
		double area=pi*r*r;
		System.out.println("Area Of Circle is  "+area);
	}
}
class Square extends Shape{
	public void area() {
		int s;
		System.out.println("Calculate Area of Square");
		System.out.println("Enter The Value of Side ");
		s=sc.nextInt();
		int area=s*s;
		System.out.println("Area of Square is  "+area);
	}
}
class Cylinder extends Shape{
	public void area() {
		double pi=3.14,r,h;
		System.out.println("Calculate Area of Cylinder");
		System.out.println("Enter The Radious Value ");
		r=sc.nextDouble();
		System.out.println("Enter The Height Value ");
		h=sc.nextDouble();
		double area=(2*pi*r*h)+(2*pi*r*r);
		System.out.println("Area of Cylinder is"+area);
	}
}
class Rectangle extends Shape{
	public void area() {
		int l,w;
		System.out.println("Calculate Area of Rectangle");
		System.out.println("Enter The Lenght");
		l=sc.nextInt();
		System.out.println("Enter The Height ");
		w=sc.nextInt();
		int area=l*w;
		System.out.println("Area Of Rectangle is  "+area);
	}
}
public class Program3 {

	public static void main(String[] args) {
		Shape s[]=new Shape[10];
		s[0]=new Circle();
		s[1]=new Square();
		s[2]=new Cylinder();
		s[3]=new Rectangle();
		for(int i=0;i<4;i++) {
			s[i].area();
		}

	}
}

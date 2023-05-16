package programjava;
import java.util.Scanner;
interface Areaofrectangle{
	void arearectangle();
}
interface Areaofcircle {
	void areacircle();
}
class Area1 implements Areaofrectangle, Areaofcircle{
int h,w,r;
float pi;
Scanner sc=new Scanner(System.in);
public void arearectangle() {
		System.out.print("Enter The Hight :");
		h=sc.nextInt();
		System.out.print("Enter The Width :");
		w=sc.nextInt();
		
		System.out.println("Area of rectanle :"+(h*w));
}
public void areacircle () {
	System.out.print("Enter The Width :");
	r=sc.nextInt();
	
	System.out.println("Area of rectanle :"+(3.14*r*r));
}

	public static void main(String[] args) {
		Area1 a=new Area1();
		a.arearectangle();
		a.areacircle();
}
}

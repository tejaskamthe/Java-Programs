package Assignment5;

import java.util.Scanner;

class wageemployee1{
	int id;
	double da,hra;
	String name;
	double sale,commission;
	double bsry,gross;
	Scanner sc = new Scanner(System.in);

wageemployee1(){
	System.out.println("Enter The Employee Id:");
	id=sc.nextInt();
	System.out.println("Enter The Name Of Employee:");
	name=sc.next();
	System.out.println("Enter The Basic Salary");
	bsry=sc.nextDouble();
	System.out.println("Enter The Sales Commission:");
	commission=sc.nextDouble();
	}
void salary() {
	da=bsry*0.20f;
	hra=bsry*0.30f;
	gross=bsry+da+hra;
	
}
}
 class SalesPerson extends wageemployee1 {
	 SalesPerson() {
		 sale=commission+gross;
		
	}
	void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee Basic Salary:"+bsry);
		System.out.println("The Sales Persons gross salary is="+gross);
		System.out.println("Employee Commission with total salary of sales:"+sale);
		
	}
}
public class Program3 extends SalesPerson {

	public static void main(String[] args) {
		Program3 p=new Program3();
		p.salary();
		p.display();
		
	}

}

package Assignment5;

import java.util.Scanner;

class Employee1 {
	int fixedsalary;
	double gross;
	int bs,id;
	float da,hra;
	String name;
	Scanner sc=new Scanner(System.in);
	Employee1() {
		System.out.println("Eneter The Managers ID :");
		id=sc.nextInt();
		System.out.println("Eneter The Name Of Manager :");
		name=sc.next();
		System.out.println("Eneter The Basic Salary Of Manager :");
		bs=sc.nextInt();
		
}
}
public class Manager extends Employee1{
	 Manager(int id,String name,double basicsalary){
		 
	double incentive = 0;
	da=bs*0.20f;
	hra=bs*0.30f;
	gross=bs+da+hra+incentive;
	incentive=bs*0.2;
	
	System.out.println("Manager's Incentive Amount :"+incentive);
	System.out.println("Total Salary Of Manager :"+gross);
	}

	public static void main(String[] args) {
		Manager M=new Manager(1021,"TEJAS",15000);
	}

}

package Assignment3;
import java.util.Scanner;
class Employee1{
	
	private int empid;
	String ename;
	double med,basicsal,pf,pt,hra,netsal,gross;
	Scanner sc=new Scanner(System.in);
	Employee1() {
		
		System.out.println("Enter The Employee ID=");
		empid=sc.nextInt();
		System.out.println("Enter The Employee EName=");
		ename=sc.next();
		System.out.println("Enter The Employee Basic Salary=");
		basicsal=sc.nextDouble();
		System.out.println("Enter The Employee Medical=");
		med=sc.nextDouble();
		
		hra=0.5*basicsal;
		pf=0.12*basicsal;
		pt=200.0;
	}
	public double CalculateGross() {
		this.gross=this.basicsal+hra+this.med;
		return this.gross;
	}
	public double CalculateNet() {
		this.netsal=this.CalculateGross()-this.pf-this.pt;
		return this.netsal;
	}
	void PrintEmpInfo() {
		System.out.println("Employee ID="+this.empid);
		System.out.println("Employee Name="+this.ename);
		System.out.println("Basic Salary="+basicsal);
		System.out.println("Medical="+this.med);
		System.out.println("PF="+this.pf);
		System.out.println("HRA="+this.hra);
		System.out.println("Gross Salary="+this.CalculateGross());
		System.out.println("NET Salary="+this.CalculateNet());
	}
	}
public class Program7 {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.PrintEmpInfo();
		
	}

}

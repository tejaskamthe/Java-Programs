package Assignment5;
import java.util.Scanner;
class Employee{
	int hr,rate;
	Scanner sc=new Scanner(System.in);
	void EmployeInfo() {
		System.out.println("Enter The Hr of you Work Form :");
		hr=sc.nextInt();
		System.out.println("Enter The Rate :");
		rate=sc.nextInt();
	}
	void Cal() {
		System.out.println("Here is The Calculate Salary of Employee : "+(hr*rate));
	}
	}
public class WageEmployee extends Employee {
	int id;
	String name;
	void PersonalInfo() {
		System.out.println("Eneter The Employee ID :");
		id=sc.nextInt();
		System.out.println("Eneter The Employee Name :");
		name=sc.next();
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "Employee id is  "+id+" ||  Employee Name is=  "+name;
	}
	public static void main(String[] args) {
	WageEmployee Emp=new WageEmployee();
	Emp.PersonalInfo();
	Emp.EmployeInfo();
	Emp.Cal();
	}
	

}

package programjava;
import java.util.Scanner;
class employee2{
	int id;
	String name;
	float salary;
	String address;
	Scanner sc=new Scanner(System.in);
	void accept() {
		System.out.println("Enter The Employee ID:");
		id=sc.nextInt();
		System.out.println("Enter The Employee Name");
		name=sc.next();
		System.out.println("Enter The Employee Salary:");
		salary=sc.nextFloat();
		System.out.println("Enter The Employee Address");
		address=sc.next();
	}
	void display() {
		System.out.println("Employee ID Is: "+id);
		System.out.println("Employee Name Is: "+name);
		System.out.println("Employee salary Is: "+salary);
		System.out.println("Employee Adress Is: "+address);
	}
}
	public class employeess{
	public static void main(String[] args) {
		employee2 e=new employee2();
		e.accept();
		e.display();
		
	}
	}
import java.util.Scanner;
public class employee{
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
	public static void main(String[] args) {
		employee e=new employee();
		e.accept();
		e.display();
		
	}
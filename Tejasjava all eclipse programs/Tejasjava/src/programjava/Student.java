package programjava;
import java.util.Scanner;
class Student {
	int id;
	String name;
	String address;
	Scanner sc= new Scanner(System.in);
	void accept() {
		System.out.println("Enter The Student Id: ");
		id=sc.nextInt();
		System.out.println("Enter The Student name: ");
		name=sc.next();
		System.out.println("Enter The Student Address: ");
		address=sc.next();
	}
	void display() {
		System.out.println("Student ID is :"+id);
		System.out.println("Student name is :"+name);
		System.out.println("Student address is :"+address);
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.accept();
		stud.display();
	}
}
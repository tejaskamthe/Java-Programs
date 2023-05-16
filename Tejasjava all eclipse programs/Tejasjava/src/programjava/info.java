package programjava;
import java.util.Scanner;
class student1 {
int rollno;
String name;
String division;
Scanner sc=new Scanner(System.in);
void accept() {
	System.out.println("Enter The Student ROll no :");
	rollno=sc.nextInt();
	System.out.println("Enter The Student Name :");
	name=sc.next();
	System.out.println("Enter The Student Division :");
	division=sc.next();
}	
}

class info extends student1 {
	void display() {
		System.out.println("Student Roll No: "+rollno);
		System.out.println("Student Name: "+name);
		System.out.println("Student Division: "+division);
	}

public static void main(String[] args) {
info in=new info();
in.accept();
in.display();
	}
}

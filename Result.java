import java.util.Scanner;
class Student{
	int id;
	String name;
	Scanner sc=new Scanner(System.in);
	Student(){
		System.out.println("Enter The Student ID:");
		id=sc.nextInt();
		System.out.println("Enter The Student Name :");
		name=sc.next();
	}
}
class mark extends Student{
	int m1;
	int m2;
	mark()
	{
	
		System.out.println("Enter The Subject 1 Marks :");
		m1=sc.nextInt();
		System.out.println("Enter The Subject 2 Marks :");
		m2=sc.nextInt();
	}
}
class Result extends mark{
	void display(){
			System.out.println("Student Id Is:"+id);
			System.out.println("Student Name Is:"+name);
			System.out.println("Subject 1 Mark Is:"+m1);
			System.out.println("Subject 2 Mark Is:"+m2);
				
		}
	public static void main(String[] args) {
Result rs=new Result();
//rs.marks();
rs.display();
	}
}
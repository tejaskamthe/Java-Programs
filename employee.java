import java.util.Scanner;
public class employee {
		int e_id;
		int e_salary;
		String name;
		Scanner sc=new (System.in);
		 void accept() {
			System.out.println("Enter The Employee ID:");
			e_id=sc.nextInt();
			System.out.println("Enter The Employee Name:");
			name=sc.next();
			System.out.println("Enter The Employee Salary:");
			e_salary=sc.nextInt();
			}
			void display() {
				System.out.println("Employee ID :"+e_id);
				System.out.println("Employee Name :"+name);
				System.out.println("Employee Salary :"+e_salary);
			}
				public static void main(String[] args) 
				{	 
				employee emp=new employee();
				emp.accept();
				emp.display();
				}
	}
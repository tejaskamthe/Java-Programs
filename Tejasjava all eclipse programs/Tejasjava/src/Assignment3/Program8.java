package Assignment3;

class Employee {
	int empid;
	String ename;
	int salary;
	public Employee() {
		//empid=13;
		//ename="TEJAS";
		//salary=85000;
	}
	public Employee(int id,String name,int sal) {
		empid=id;
		ename=name;
		salary=sal;
	}
	public void printemp() {
		System.out.println("Employee Id :"+empid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee salary :"+salary);
		
	}
}

public class Program8 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.printemp();
		Employee e1=new Employee(0321,"Sagar",50000);
		e1.printemp();
	}

}

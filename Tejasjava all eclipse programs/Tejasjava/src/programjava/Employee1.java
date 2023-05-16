package programjava;

class Employee {
int id=1;
String Name="Tejas";
String Address="Pune";

 	void Accept() {
	 System.out.println(id);
	 
	 }
 	void display() {
 		System.out.println(Name);
 	}
 	void displayAddress() {
 		System.out.println("This Is Parent class Method="+Address);
 	}
}
 class Employee1 extends Employee{
	 int id=2;
	 String Name="Kamthe";
	 String Address="Satara";
	 void Accept() {
		 System.out.println("Calss Employee1 id="+id);
		 System.out.println("Class Employee Id Is= "+super.id);		//if you want to Access Parent Class Variable to Child Class then Super variable is use

	 }
	 void display() {
		 System.out.println("Class Employee1 Name is"+Name);
		 System.out.println("Class Employee Name Is="+super.Name);
		 
		 }
	 void displayAddress() {
		 super.displayAddress();
	 		System.out.println("This Is Child Class Method="+Address);
	 	}
	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.Accept();
		emp.display();
		emp.displayAddress();
	}
 }
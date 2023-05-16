package Assignment4;

public class Employee {
	String firstname;
	String lastname;
	double id;
	String dob;
	public Employee(String firstname,String lastname,double id,String dob) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.id=id;
		this.dob=dob;
	}
	@Override
	public String toString() {
		return "First Name:"+firstname+ "  LastName:"+ lastname +"  Employee Id:"+ id+"  Date Of Birth"+ dob;
	}
	public static void main(String[] args) {
		Employee e=new Employee("Tejas","Kamthe",1001.20,"24/04/2023");
		System.out.println(e);
	}

}

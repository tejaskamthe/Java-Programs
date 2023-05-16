class Student{
	int rollno;
	String name;
	float salary;
	String address;
	
	Student(int rollno,String name,float salary,String address){
	this.rollno=rollno;
	this.name=name;
	this.salary=salary;
	this.address=address;
}
void dislay(){
	System.out.println(rollno+" "+name+" "+salary);
}
void dislays(){
	System.out.println(address);
}
}


class thiss{
 public static void main(String args[]) {	
 	Student s1=new Student(101,"Tejas",1000," ");
 	Student s2=new Student(102,"TSKP",2000," ");
 	Student s3=new Student(103,"Kamthe",3000," ");
 	Student s4=new Student(104,"tejas",5000,"kondhwa");
 	s3.dislay();
 	s1.dislay();
 	s2.dislay();
 	s4.dislays();
} 
}

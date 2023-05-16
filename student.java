import java.util.Scanner;
class Student
{
int roll_no;
String name;
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("Enter The Roll No :");
roll_no=sc.nextInt();
System.out.println("Enter The Name :");
name=sc.next();
}
void display()
{
System.out.println("Student Roll no Is  : "+roll_no);
System.out.println("Student Name Is : "+name);
}
public static void main(String args[])
{
System.out.println("Student Info:");
Student stud=new Student();
stud.accept();
stud.display();
}
}
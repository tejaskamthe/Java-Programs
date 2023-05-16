import java.util.Scanner;
class evanodd
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The No: ");
num=sc.nextInt();
if(num%2==0)
System.out.println("No. Is Evan..");
else
System.out.println("No Is Odd..");
}
}
class Medicine
{
String c_name;
String c_address;
public void displaylabel1()
{
System.out.println("this drug is manufacturing by\n*****'Pharamaceutical Company'********");
System.out.println("Address27-42,nain bazar,hadapsar District,pune413 308");

}
}
class tablet extends Medicine
{
public void displaylabel1()
{
System.out.println("**** Tablet should be store in cold place***");
}
}
class Syrup extends Medicine{
public void displaylabel1()
{
System.out.println("****Shake well before use****");
}
}
class Ointment extends Medicine
{
public void displaylabel1()
{
System.out.println("*** For external use****");
}
}
public class program2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
 Medicine m[]=new Medicine[10];
 double i=Math.random()*4;
 int j=(int)3;
 System.out.println(j);
 switch(j)
 {
 case 1:
 m[0]=new Medicine();
 m[1]=new tablet();
 m[0].displaylabel1();
 m[1].displaylabel1();
 break;
 case 2:
m[2]=new Medicine();
m[3]=new Syrup();
m[2].displaylabel1();
m[3].displaylabel1();
break;
 case 3:
m[4]=new Medicine();
m[5]=new Ointment();
m[4].displaylabel1();
m[5].displaylabel1();
break;
default:
System.out.println("Invalid choice");
break;
 }
}

}
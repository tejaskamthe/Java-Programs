package ExceptionHandling8;
import java.util.Scanner;
public class CalAverage{
	public double avgFirst(int n) {
		
		if(n<0) {
			throw new IllegalArgumentException("Value Must Be Non-Negative");
		}
		double sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+i;
			}
			double avg=sum/n;
			return (avg);
		}
		
	
	public static void main(String[] args){
		CalAverage p2=new CalAverage();
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Natural No.");
int num=sc.nextInt();
double res=p2.avgFirst(num);
System.out.println("Average is :"+res);
	}

}

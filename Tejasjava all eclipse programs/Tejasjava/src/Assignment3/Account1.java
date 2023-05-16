package Assignment3;

import java.util.Scanner;

public class Account1 {
	int amt,wamt;
	int bal;
	Scanner sc=new Scanner(System.in);
	
	public Account1(int bal) {
		System.out.println("Your Balance Is:"+bal);
	
	}
	void deposite()
	{
		System.out.println("Enter The Amount For Deposite :");
		amt=sc.nextInt();
		bal=amt+bal;
		System.out.println("Balance Amount After Deposite:"+bal);
	}
void withdraw()
{
	System.out.println("Enter The Amount For Withdraw :");
	wamt=sc.nextInt();
	if(bal>=wamt)
	{
		bal=bal-wamt;
		System.out.println("Balance Amount After Withdraw:"+bal);
		
	}
	else {
		System.out.println("Insufficient Balance..");
}
}
public static void main(String[] args) {
	Account1 a=new Account1(10000);
	a.deposite();
	a.withdraw();
}
}	
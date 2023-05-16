package Assignment3;

import java.util.Scanner;

public class ArrayAdd2 {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		System.out.println("Enter How Many no. Do you want to add :");
		n=sc.nextInt();
		System.out.println("Enter The First Array :");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter The Second Array");	
			for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
			for(i=0;i<n;i++)
			{
				c[i]=a[i]+b[i];
				System.out.print(" "+c[i]);
			}
		}
	}

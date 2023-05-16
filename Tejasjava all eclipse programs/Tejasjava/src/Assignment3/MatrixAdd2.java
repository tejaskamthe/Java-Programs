package Assignment3;

import java.util.Scanner;

public class MatrixAdd2 {

	public static void main(String[] args) {
		int i,j,n,m;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Column for Matrix:");
		n=sc.nextInt();
		System.out.println("Enter The Row for Matrix:");
		m=sc.nextInt();
		System.out.println("Enter The First Matrix no.");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
		}
		System.out.println("First Matrix :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++) {
			System.out.print(" "+a[i][j]);
		}
			System.out.println();
		}
		System.out.println("Enter The Second Matrix no.");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++) {
			b[i][j]=sc.nextInt();
		}
		}
		System.out.println("Second Matrix :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++) {
			System.out.print(" "+b[i][j]);
		}
			System.out.println();
		}
		System.out.println("Addition Of Two Matrix :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
			System.out.print(" "+c[i][j]);
		}
			System.out.println();
		}
		
	}

}

package Assignment1;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		int a[][]=new int[5][5];
		int i,j,n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The column");
		n=sc.nextInt();
		System.out.println("Enter The Row");
		m=sc.nextInt();
		
		for(i=0;i<n;i++) {
			
			for(j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<=n;i++) {
			
			for(j=0;j<m;j++) {
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
		}
	}


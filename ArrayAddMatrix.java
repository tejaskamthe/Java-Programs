import java.util.Scanner;
class ArrayAddMatrix{
	public static void main(String[] args) {
		int i,n,m,j;
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The How Many columns Of Matric do you want :");
		n=sc.nextInt();
		System.out.println("Enter The How Many Rows Of Matrix do you want :");
		m=sc.nextInt();
		System.out.println("Enter The First Array Values:");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
			a[i][j]=sc.nextInt();
		}
		System.out.println();
		}
		System.out.println("First Matrix :");
		for(i=0;i<n;i++){
			for (j=0;j<m;j++) {
			System.out.print("  "+a[i][j]);
		}
		System.out.println();
	}
		
		System.out.println("Enter The Second Array Values:");
		for(i=0;i<n;i++){
			for (j=0;j<m;j++){
			b[i][j]=sc.nextInt();
		}
	}
		System.out.println("Second Array :");
		for(i=0;i<n;i++){
			for (j=0;j<m;j++){
			System.out.print(" "+b[i][j]);
		}
		System.out.println();
		}
		System.out.println();
		System.out.println("Addition Of Array:");
		for(i=0;i<n;i++){
			for (j=0;j<m;j++){
			c[i][j]=a[i][j]+b[i][j];
			System.out.print("  "+c[i][j]);
		}
		System.out.println();
	}
}
}
package FileHandling12;
import java.io.*;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader R=new BufferedReader(isr);
		System.out.println("Enter Your Name :");
		String name=R.readLine();
		System.out.println("Enter Your Age :");
		double age=Double.parseDouble(R.readLine());
		System.out.println("Your Name is: "+name);
		System.out.println("Your Age is: "+age);

}

}

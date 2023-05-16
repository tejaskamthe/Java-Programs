package Assignment4;

import java.util.Scanner;

public class Program7 {
	
	public int SumofDigits(String st) {
		int l=(st.length());
		int sum = 0;
		for(int i=0;i<l;i++) {
			if(Character.isDigit(st.charAt(i))) {
				
			String tem=st.substring(i,i+1);
		sum +=Integer.parseInt(tem);
		
		}
	}
	return sum;
}
	public static void main(String[] args) {
		Program7 p7=new Program7();
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter String like This tedhah21312: ");
		str=sc.next();
		System.out.println("This Is Your Given String :"+str);
		System.out.println("The Sum Of Digits :"+p7.SumofDigits(str));
		
	}

}

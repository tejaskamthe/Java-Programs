package ExceptionHandling8;

public class Program1 {
	public static void main(String[] args) {
		int a=10,b=0,c;
		String str = null;
		String str1="abc";
		int arr[]= {10,20};
		try {
			c=a/b;
			System.out.println("Divison" +c);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occur");
		}
		try {
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println("Null Charachter is not an Upper Case");
		}
		try {
			System.out.println(arr[20]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Range..");
		}
		try {
			int i=Integer.parseInt(str1);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception Occurs..");
		}
		try {
			Class.forName("program2");
			System.out.println("Class name Is Found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class Not Found Exception Is Occur..");
		}
	}

}

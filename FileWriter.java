import java.io.*;

claas FileWriter{
	public static void main(String[] args) {
		FileWriter f;
					f= new FileWriter("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
					f.write("My Name Is Tejas..!");
					System.out.println("Your Data Is Successfully write in Your File..!");
					f.close();
		}
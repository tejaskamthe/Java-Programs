package FileHandling12;
import java.io.*;
public class Program3 {

	public static void main(String[] args)  {
		try {
		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
		
		FileOutputStream f2=new FileOutputStream("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile1.txt");
		int a;
		while((a=f1.read())!=-1) {
			f2.write(a);
		}
		System.out.println("File Copied SuccessFully..");
			f1.close();
			f2.close();
		

	}
		catch(Exception e) {
			System.out.println(e);
		}

}
}

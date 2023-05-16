package FileHandling12;
import java.io.*;

public class Program2 {

	public static void main(String[] args)throws Exception {
			FileOutputStream f1=new FileOutputStream("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
			String s="Java Programing";
			String s1="Advance ";
			f1.write(s1.getBytes());
			f1.write(s.getBytes());
			
			f1.close();
			
			
	FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
	int i=0;
	while((i=fin.read())!=-1){
	System.out.print((char)i);
	}
	fin.close();
			
		}
		
	}

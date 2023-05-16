package programjava;

import java.io.*;

public class FileInfo{
static String str="TEJAS SUHAS KAMTHE..";
	public static void main(String[] args) throws IOException {
	FileWriter f;
	f=new FileWriter("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
	f.write(str.toLowerCase());
	System.out.println("Data Add Successfully..!");
	f.close();
	}

}

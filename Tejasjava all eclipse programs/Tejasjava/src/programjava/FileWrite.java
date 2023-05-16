package programjava;

import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileWriter f;
			try {
				f = new FileWriter("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
				f.write("My Name is Tejas..");
				System.out.println("Data Write In The File Successfully..!");
				f.close();
			} catch (Exception e) {
				System.out.println("File Dose't Exist");
				e.printStackTrace();
			}
			
		}
		

	}



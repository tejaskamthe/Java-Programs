package programjava;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	

	public static void main(String[] args){
	File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\kamthe.txt");
	try {
		if(f.createNewFile()) {
			System.out.println("File Is Successfully Created..!");
		}
		else {
			System.out.println("File Is Alredy Exist..!");
		}
	} catch (IOException e) {
		System.out.println("Exception Is Handled..!");
		e.printStackTrace();
	}
	}
}
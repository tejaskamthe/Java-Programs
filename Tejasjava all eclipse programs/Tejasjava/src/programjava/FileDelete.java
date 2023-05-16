package programjava;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
		
		try {
		if(f.delete()) {
			System.out.println("File Is Successfully Deleted..!");
		}
		else {
			System.out.println("File Dosen't Exist..!");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}

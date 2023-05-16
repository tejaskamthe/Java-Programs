package programjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadData {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
		try (Scanner FileReader = new Scanner(f)) {
			while(FileReader.hasNextLine()) {
				String FileData=FileReader.nextLine();
				System.out.println(FileData);
			}
			FileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ReadDataFile{
	public static void main(String[] args) {
		try{
			File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
			Scanner FileReader=new Scanner(f);
			while(FileReader.hasNextLine()){
				String FileData=FileReader.nextLine();
				System.out.println(FileData);
			}
			FileReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("UnAccepted Exception Occurs");
		}
	}
}
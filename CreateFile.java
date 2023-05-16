import java.io.File;
import java.io.*;

class CreateFile{
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\kamthe.txt");
		try{
		if (f.createNewFile()){
			System.out.println("File Is Create Successfully..!");
		}
		else{
			System.out.println("File Is Alredy Exist..!");
		}
	}
	catch(IOException i){
		System.out.println(i);
	}
	}
}
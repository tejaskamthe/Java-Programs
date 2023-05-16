import java.io.*;
class FileDelete{
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\kamthe.txt");
		if(f.delete()){
			System.out.println("File Is Successfully Deleted..!");
		}
		else{
			System.out.println("File Is Not Exist..!");
		}
	}
	
}
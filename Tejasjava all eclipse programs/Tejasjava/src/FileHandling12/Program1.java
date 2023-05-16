package FileHandling12;

import java.io.File;
import java.io.IOException;

class news{
	void show() {
		File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
		try {
			f.createNewFile();
			System.out.println("Is File :"+f.isFile());
			System.out.println("is Directory:"+f.isDirectory());
			System.out.println("Modified Date:"+f.lastModified());
			System.out.println("File Size:"+f.length());
			System.out.println("File Path:"+f.getPath());
			System.out.println("File AbsolutePath :"+f.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class Program1 {

	public static void main(String[] args) {
		news s=new news();
		s.show();

	}

}

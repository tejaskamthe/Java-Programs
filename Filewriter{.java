import java.io.FileWriter;

claas Filewriter{
	public static void main(String[] args) throws Exception {
		Filewriter f;
					f= new FileWriter("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
					f.write("My Name Is Tejas..!");
					System.out.println("Your Data Is Successfully write in Your File..!");
					f.close();
		}
}





File f=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
		if(f.exists()) {
			System.out.println("File Name:   "+f.getName());
			System.out.println("File Location : "+f.getAbsolutePath());
			System.out.println("File Writable  "+f.canWrite());
			System.out.println("File Readable  "+f.canRead());
			System.out.println("File Size   "+f.length());
			
		}
		else {
			System.out.println("File Dose't Exist..!");
		}
	}
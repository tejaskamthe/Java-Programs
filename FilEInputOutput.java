import java.io.*;
class FilEInputOutput{
	public static void main(String[] args) {
		try{
			FileOutputStream f=new FileOutputStream("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
			String a="Tejas ";
			String b="Kamthe";
			f.write(a.getBytes());
			f.write(b.getBytes());
			f.close();

		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
		int i=0;
		while((i=f1.read())!=-1){
			System.out.print((char)i);
		}	
		f1.close();
		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
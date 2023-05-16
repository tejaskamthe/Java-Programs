package FileHandling12;
import java.io.*;
public class Program4 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Tejas Kamthe");
			bw.close();
			fw.close();
			FileReader fr=new FileReader("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
			BufferedReader br=new BufferedReader(fr);
			int i;
			while((i=br.read())!=-1) {
				System.out.print((char)i);
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

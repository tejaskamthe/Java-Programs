package FileHandling12;
import java.io.*;
public class Program5 {
void countwords() {
	
				try{
					String line;
					int count=0;
					int perticularword=0;
					FileReader file=new FileReader("C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt");
					BufferedReader br=new BufferedReader(file);
					while((line =br.readLine())!=null) {
						String words[]=line.split(" ");
						for(String s:words) {
							if(s.equalsIgnoreCase("To")) {
								perticularword=perticularword+1;
							}
						}
						count=count+words.length;
					}
					System.out.println("Number of Words Given In File:"+count);
					System.out.println("count of Searched 'To' word is:"+perticularword);
					br.close();
					file.close();
				}
				catch(Exception e) {
					System.out.println("filehandlingdemo1.Prog5.countNumbers()"+e);
				}
}
public static void main(String[] args) throws IOException{
		Program5 p=new Program5();
		p.countwords();
}

	}


import java.io.*;

public class AppendToFile {
    public static void main(String[] args) {
        

        try {
        	String string1 = "Hello, ";
            String string2 = "World!";
        	File file=new File("C:\\Users\\Admin\\Desktop\\tejas\\java\\file.txt");
            FileWriter fileWriter = new FileWriter(file,true);
            //BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            fileWriter.write(string1);
            //fileWriter.write(string2);

            //bufferedWriter.close();
            fileWriter.close();

            System.out.println("Strings appended successfully.");
        } catch(IOException e) {
            System.out.println("An error occurred while appending the strings to the file.");
            e.printStackTrace();
        }
    }
}
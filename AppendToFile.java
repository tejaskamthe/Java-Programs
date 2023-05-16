import java.io.*;

public class AppendToFile {
    public static void main(String[] args) {
        String string1 = "Hello, ";
        String string2 = "World!";

        try {
            FileWriter fileWriter = new FileWriter(C:\\Users\\Admin\\Desktop\\tejas\\java"file.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(string1);
            bufferedWriter.write(string2);

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Strings appended successfully.");
        } catch(IOException e) {
            System.out.println("An error occurred while appending the strings to the file.");
            e.printStackTrace();
        }
    }
}

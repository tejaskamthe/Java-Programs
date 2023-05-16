package FileHandling12;

import java.io.IOException;
import java.io.RandomAccessFile;
 
public class Program8 {
  public static void main(String[] args) {
      try {
           String fileName = "C:\\Users\\Admin\\Desktop\\tejas\\java\\MyFile.txt";
           String data = "TEjas SuHas KAmthe";
           RandomAccessFile randomAccessFile;
           
           // ---- Writing in file using RandomAccessFile ----
           // 'rw' means opening file in Read-Write mode
           randomAccessFile = new RandomAccessFile(fileName, "rw");
           randomAccessFile.seek(5);
           randomAccessFile.writeUTF(data);
           System.out.println("Data written in = "+data);
           randomAccessFile.close();
 
           // ---- Reading from file using RandomAccessFile ----
           // 'r' means opening file in Read mode
           randomAccessFile = new RandomAccessFile(fileName, "r");
           randomAccessFile.seek(5);
           data = randomAccessFile.readUTF();
           System.out.println("Data read from file = "+data);
           randomAccessFile.close();
 
      } catch (IOException e) {
           e.printStackTrace();
      }
  }
 
}
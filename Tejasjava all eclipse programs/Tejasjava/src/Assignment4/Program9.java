package Assignment4;

import java.util.Scanner;

class Convert
{
    Scanner sc=new Scanner(System.in);
    int num;
    void getVal()
     {
          System.out.println("Decimal to HexaDecimal,Octal and Binary");
          System.out.println("\nEnter the number :");
          num = sc.nextInt();
     }
    void convert()
      {
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal Value is : " + hexa);
           String octal = Integer.toOctalString(num);
           System.out.println("Octal Value is : " + octal);
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary Value is : " + binary);
       }
}
class Program9
{
   public static void main(String args[])
    {
        Convert obj = new Convert();
         obj.getVal();
         obj.convert();
    }
}

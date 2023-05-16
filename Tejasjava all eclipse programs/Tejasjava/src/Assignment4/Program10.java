//*Q .Declare enum of weekday: Print number with day
//Hint: public enum day{SUNDAY (0), MONDAY (1)}
//Print: 0 SUNDAY 1 MONDAY 

package Assignment4;

import java.time.*;  
import java.time.temporal.ChronoField;
import java.util.Scanner;  
public class Program10 {  

public static void main(String[] args) {  
	  Scanner sc=new Scanner(System.in);
	  int y,d;
	  String m;
	  System.out.println("Enter The Year(yyyy), Month(mm), Day(dd) :");
	  y=sc.nextInt();
	  m=sc.next();
	  d=sc.nextInt();
    LocalDate localDate = LocalDate.of(y, Month.APRIL,d);  
    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
  }  
}  
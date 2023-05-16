package programjava;

import java.util.Scanner;

class Calculator {
   char operator;
    Double number1, number2, result;
   static String next_calculation;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

   
    void Calculators(){
    	
   // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();
    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
        
    }
    
  }
   
 public static void Restart(String name) {
	 System.out.println("Hi, I am " + next_calculation + "!");
	   
      
 }
  public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.Calculators();
        
        if(next_calculation=="yes") {
        	cal.Calculators();
        }
}
}
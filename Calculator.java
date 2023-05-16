import java.util.Scanner;

class Calculator {
   char operator;
    Double number1, number2, result;
    String next_calculation;

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
  public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println("Enter The yes Or no");
        next_calculation=sc.next();
        if(next_calculation == "yes"){
            cal.Calculators();
          }
          if(next_calculation=="no"){
            break;
        }
    else{
        System.out.print("Invalid Input");
  }
}
}

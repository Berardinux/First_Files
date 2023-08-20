import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("First number: ");
    int num1 = scanner.nextInt();
    System.out.print("\n");

//##################################################

    System.out.println("Select Operator");
    System.out.println(" ");
    System.out.println("( 1 ) = Addition");
    System.out.println("( 2 ) = Subtraction");
    System.out.println("( 3 ) = Multiplication");
    System.out.println("( 4 ) = Division");
    System.out.println(" ");
    System.out.print("Enter: ");
    int userInput = scanner.nextInt();

//##################################################

    System.out.print("Second number: ");
    int num2 = scanner.nextInt();
    System.out.print("\n");

    selOperator(num1, num2, userInput);

    scanner.close();
  }

  public static void selOperator(int num1, int num2, int userInput) {
    double result;

    if (userInput == 1) {
      System.out.println("Performing Addition");
      result = num1 + num2;
    }
    else if (userInput == 2) {
      System.out.println("Performing Subtraction");
      result = num1 - num2;
    }
    else if (userInput == 3) {
      System.out.println("Performing Multiplication");
      result = num1 * num2;
    }
    else if (userInput == 4) {
      if (userInput != 0) {
        System.out.println("Performing Division");
        result = (double) num1 / num2;
      }
      else {
        System.out.println("Davision by zero is not allowed");
        return;
      }

    }
    else {
      System.out.println ("That was not one of the options! )-: ");
      return;
    }
    System.out.println("= " + result);

  }

}


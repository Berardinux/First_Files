public class ErrorHandling {
  public static void main(String[] args) {
    String[] names = { "Ben", "Amy", "Kim" };
    try {
      for (int i = 0; i <=3; i = i + 1) {
        System.out.println(names[i]);
      }

    }
    catch (ArrayIndexOutOfBoundsException ex) {
      System.err.println(ex);
    }
    try {
      int num1 = 0;
      int num2 = 10;
      int num3 = num2 / num1;
    }
    catch (ArithmeticException ex) {
      System.err.println(ex);
      System.out.println("Hey! Devide by zero is uncool dude!");
    }
    catch (Exception ex) {
      System.out.println("Something Broke Bro");
    }
    System.out.println("The program is complete!");
  }
}
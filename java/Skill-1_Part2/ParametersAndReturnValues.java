public class ParametersAndReturnValues {
  public static void main(String[] args) {
    String name = "Amy";
    myCoolFunction(name, "Good Morning ");
    myCoolFunction(name, "Good Afternoon ");
    int bigger = whichIsBigger(5,6);
    System.out.println(bigger + " is the larger number.");
    bigger = whichIsBigger(15,3);
    System.out.println(bigger + " is the larger number.");
    bigger = whichIsBigger(1216745,15434251);
    System.out.println(bigger + " is the larger number.");
  }
  public static void myCoolFunction(String nameParameter, String greeting) {
    System.out.println("Hello World!");
    System.out.println(greeting + nameParameter);
  }
  public static int whichIsBigger(int a, int b) {
    if (a>b) {
      return a;
    }
    return b;
  }
}
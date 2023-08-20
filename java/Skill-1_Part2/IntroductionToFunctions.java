public class IntroductionToFunctions {
  public static void main(String[] args) {
    System.out.println("##################################");
    System.out.println("Before function call");
    System.out.println("##################################");
    myCoolFunction();
    System.out.println("##################################");
    System.out.println("After function call!");
    System.out.println("##################################");
    myCoolFunction();
    System.out.println("##################################");
  }
  public static void myCoolFunction() {
    System.out.println("Hello World!");
    System.out.println("Hello Ben");
  }
}
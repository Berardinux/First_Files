import java.util.Scanner;

public class InputAndOutput {
public static void main(String[] args) {
    Scanner kb;
    kb = new Scanner(System.in);

    System.out.println("What is your name?");
    String name;
    name = kb.nextLine();
    System.out.println("Hello " + name);

    
    System.err.println("Error Will Robinson!");
  }
}
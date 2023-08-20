import java.util.HashMap;

public class Neet {
  public static void main(String[] args) {
    System.out.println("\n\n\nTHIS IS JAVA!\n\n\n");

    HashMap<String, String> data = new HashMap<> ();
    data.put("Texas", "Smash");
    data.put("Detroit", "Smash");

    System.out.println(data);

    for (String key : data.keySet()) {
      String val = data.get(key);
      System.out.println(key + "=" + val);
    }
  }
}
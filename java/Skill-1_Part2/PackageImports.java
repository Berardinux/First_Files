public class PackageImports {

  public static void main(String[] args) {
    int x = 25;
    double result;

    result = java.lang.Math.sqrt(x);
    System.out.println(result);

  }

  public static double sqrt(double val) {
    double t;
    double squareRoot = val / 2;

    do {
      t = squareRoot;
      squareRoot = (t + (val / t)) / 2;
    } while (( t - squareRoot) != 0);
    return squareRoot;
  }
}
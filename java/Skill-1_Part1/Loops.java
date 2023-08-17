public class Loops {
    public static void main(String[] args) {
        int number = 378;
        boolean isPrime = true;
        int test = 2;

        while (test < number) {
            if (number % test == 0) {
                isPrime = false;
                System.out.println(number + " is divisible by " + test);
                break;
            }
            System.out.println(test);
            test = test + 1;
        }

        if (isPrime) {
            System.out.println("This is a prime number!");
        }
        else {
            System.out.println("This is not a prime number.");
        }
    }
}

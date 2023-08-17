public class IfThenElse {
    public static void main(String[] args) {
        
        String name1 = "Ben";
        int age1 = 37;

        String name2 = "kim";
        int age2 = 22;

        if (age1 >= 21) {
            System.out.println("You are old enough to enter.");
            System.out.println("Welcome to the club " + name1);
        }
        if (age2 >= 21) {
            System.out.println("You are old enough to enter.");
            System.out.println("Welcome to the club " + name2);
        }
        else if (age2 >= 18) {
            System.out.println("You are old enough to enter but not drink.");
            System.out.println("Wlecome to the club" + name2);
        }
        else {
                System.out.println("Sorry you are too young to enter.");
        }
        
        System.out.println("Have a nice day.");
    }
}
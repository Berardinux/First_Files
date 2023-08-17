public class CharAndStrings {
    public static void main (String[] args) {
        char letter;
        letter = 'C';

        String name, upperName, otherName, combined, substring;
        name = " Amy";
        otherName = " Ben";

        combined = name.concat( otherName );
        
        substring = name.substring(1, 3);


        System.out.println( substring );
    }
}
public class Arrays {
    public static void main(String[] args) {
        
        String[] names = { "Ben", "Kim", "Amy", "Joe", "Sam", "Jill" };
        int[] ages = { 37, 19, 21, 15, 45, 29 };
        int len = ages.length -1;

        for ( int idx = 0; idx <= len; idx = idx + 1 ) {
            if ( ages[idx] >= 21 ) {
                System.out.println( "You are old enough to enter!" );
                System.out.println( "Welcome to the club! " + names[idx] ); 
                System.out.println( "#####################################" );  
            }
        else if ( ages[idx] >= 18 ) {
            System.out.println( "You are old enough to enter but not drink." );
            System.out.println( "Wlecome to the Club! " + names[idx] );
            System.out.println( "#####################################" );
        }
        else {
            System.out.println( "Sorry you are too young to enter" + names[idx] );
            System.out.println( "#####################################" );
        }
        }
    }
}
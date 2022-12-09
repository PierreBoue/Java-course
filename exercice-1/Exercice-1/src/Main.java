public class Main {
    public static void main(String[] args)
    {
       //enumerate_while( 100 );
       // enumerate_while( 100);
        enumerate_even(100);
    }
    private static void enumerate_while( int maxen )
    {
        int i =1;
        while ( i <= maxen ) System.out.println(i++); // exo 1-1
    }
    private static  void enumerate_for( int maxen )
    {
        for ( int i =1; i <= maxen; i++ ) System.out.println(i); // exo 1-2
    }
    private static void  enumerate_even( int maxen )
    {
        for ( int i =0; i <= maxen; i += 2 ) System.out.println(i); // exo 1-3
    }
}

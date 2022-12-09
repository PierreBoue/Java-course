public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        System.out.println( petit_carre(30));
    }
    public static int petit_carre( int n )
    {
        double resultat = Math.floor( Math.sqrt(n));
        if ( Math.pow(resultat, 2) == n) return n;
        return (int)Math.pow(resultat + 1, 2);
    }
}
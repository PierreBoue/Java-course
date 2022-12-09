import java.util.ArrayList;
import java.lang.Integer;
public class Main
{
    public static void main(String[] args)
    {
        //int[] suite = fibo(10 );
        // for (int n: suite) System.out.println(n);
        int[] aprox = approximation_fibo((float)0.01 );
        System.out.println("a = " + aprox[0] +" b = " + aprox[1]);
    }
    private static int[] fibo( int nbre)
    {
        ArrayList<Integer> suite = new ArrayList<Integer>();//initialise un
        suite.add(0);
        suite.add(1);
        int idx = 2;
        while (idx  < nbre )
        {
            suite.add(suite.get(idx-2) + suite.get(idx - 1 ));
            idx++;
        }
        int[] rez = suite.stream().mapToInt(i ->i).toArray();
        return rez;
    }
    private static int[] approximation_fibo( float epsilon )
    {
        final double phi = ( 1 + Math.sqrt(5)) / 2;
        ArrayList<Integer> fibo = new ArrayList();
        int f1 = 1;
        int f2 = 1;

        while ( Math.abs(phi - (float)f2 / (float)f1 ) > epsilon )
        {
            int temp = f1;
            f1 = f2;
            f2 = temp + f2;
        }
        int[] retour = { f2, f1 };
        return retour;
    }
}
import java.util.ArrayList;
import java.lang.Integer;
public class Main
{
    public static void main(String[] args)
    {
        int[] suite = fibo(10 );
        for (int n: suite) System.out.println(n);

    }
    private static int[] fibo( int nbre)
    {
        ArrayList<Integer> suite = new ArrayList<Integer>();
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
    private static int[] approximation_fibo()
    {
        
    }
}
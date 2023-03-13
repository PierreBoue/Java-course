import java.util.ArrayList;

public class Describe {

    public static void describe(ArrayList<String> prenoms)
    {
        for ( String prenom: prenoms )
        {
            //System.out.println(prenom +":" + prenom.length());
            if ( prenom.length() >= 4 ) System.out.println(prenom);

        }
    }

}

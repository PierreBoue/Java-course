import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        Describe describe = new Describe();
        ToUpperCase toUpperCase = new ToUpperCase();

        final ArrayList<String> prenoms = new ArrayList<String>();
        prenoms.add("Jean");
        prenoms.add("Ahmed");
        prenoms.add("Lea");
        prenoms.add("Blanca");
        //describe(prenoms);
        ToUpperCase.toUpperCase(prenoms);

//        Describe.describe(prenoms);
    }
//    private static void describe(ArrayList<String> prenoms)
//    {
//        for ( String prenom: prenoms )
//        {
//            //System.out.println(prenom +":" + prenom.length());
//            if ( prenom.length() >= 4 ) System.out.println(prenom);
//
//        }
//    }


//    private static void to_upper_case(ArrayList<String> prenoms)
//    {
//        for ( String prenom: prenoms ) System.out.println(prenom.toUpperCase());
//    }
}
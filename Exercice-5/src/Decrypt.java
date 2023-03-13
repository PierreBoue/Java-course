public class Decrypt {

    public static String decrypt( String message )
    {
        String resultat ="";
        for (int i=0; i < message.length(); i++)
        {
            if ( message.charAt(i) != '0') resultat += message.charAt(i);
        }
        return resultat;
    }

}

public class TicTacToe
{
    final int size = 3;
    Cell[][] plateau= new Cell[size][size];
    public TicTacToe()
    {
        for (int i = 0; i < size; i++ )
        {
           // plateau[i]= new Cell[size];
            for (int j=0; j< size; j++)
            {
                plateau[i][j]= new Cell();
            }
        }
    }
    public void  display()
    {
        String separateur = "";
        for (int i = 0; i < (size * 4 + 1); i++ ) separateur += '_';// 4 taille d'une cellule
        System.out.println(separateur);
        for (int i=0; i < size; i++)
        {

            for ( Cell cellule : plateau[i])
            {
                System.out.print(cellule.getRepresentation());
            }
            System.out.println( "|\n" + separateur);
        }
    }
}

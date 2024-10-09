import java.lang.foreign.SymbolLookup;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int countByOne = 0;

       /* for (countByOne = 0; countByOne <= 30; countByOne++)
        {
            System.out.printf(countByOne + " ");
        }
        for (countByOne = 30; countByOne >= 0; countByOne--)
        {
            System.out.print(countByOne + " ");
        }
        for (countByOne = 0; countByOne <= 18; countByOne = countByOne + 3 )
        {
            System.out.print(countByOne + " ");
        }
        for (countByOne = 10; countByOne >= 0; countByOne = countByOne - 2 )
        {
            System.out.print(countByOne + " ");
       }
       */
        int row = 0;
        int column = 0;
        /*
        for (row = 1; row <= 5; row++ )
        {

            for (column = 1; column <= 5; column++ )
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

         */

        /*for (row = 5; row >= 0; row-- )
        {
            for (column = 1; column <= row; column++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/
        for (row = 1; row <= 5; row++ )
        {

            for (column = 1; column <= row; column++ )
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
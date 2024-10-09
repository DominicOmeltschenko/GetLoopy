import java.util.Random;
import java.util.Scanner;
public class DieRoller {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int dieOne;
        int dieTwo;
        int dieThree;
        int rollNum = 1;
        int sumNum = 0;
        String playAgain = "";
        String trash = "";
        System.out.println("Roll Die1 Die2 Die3 Sum");
        System.out.println("-----------------------");
        boolean done = false;
       do
       {

               do {
                   rollNum++;
                   dieOne = new Random().nextInt(6) + 1;
                   dieTwo = new Random().nextInt(6) + 1;
                   dieThree = new Random().nextInt(6) + 1;
                   sumNum = dieOne + dieTwo + dieThree;
                   System.out.printf("%-5d %1d %4d %4d %4d\n", rollNum, dieOne, dieTwo, dieThree, sumNum);
               } while (!(dieOne == dieThree && dieOne == dieTwo));
           System.out.print("Would you like to roll again? (Y/N): ");
           playAgain = in.nextLine();
           if (playAgain.equalsIgnoreCase("N"))
           {
               done = true;
           }
           else if (playAgain.equalsIgnoreCase("Y" ))
           {
             done = false;
           }
           else
           {
               trash = playAgain;
             System.out.println("You said: " + trash);
             System.out.print("Please say Y or N: ");
               playAgain = in.nextLine();
           }

       }while(!done);


    }
}

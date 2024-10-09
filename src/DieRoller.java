import java.util.Random;
import java.util.Scanner;
public class DieRoller {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int dieOne = 0;
        int dieTwo = 1;
        int dieThree = 2;
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
                   rollNum = rollNum++;
                   dieOne = new Random().nextInt(6) + 1;
                   dieTwo = new Random().nextInt(6) + 1;
                   dieThree = new Random().nextInt(6) + 1;
                   sumNum = dieOne + dieTwo + dieThree;
                   System.out.printf("%-5d %1d %4d %4d %4d\n", rollNum, dieOne, dieTwo, dieThree, sumNum);
               } while (dieOne != dieTwo && dieOne != dieThree);
           System.out.print("Would you like to roll again? (Y/N): ");
           playAgain = in.nextLine();
           if (playAgain.equals("N"))
           {
               done = true;
           }
           else if (playAgain.equals("Y" ))
           {
             done = false;
           }
           else
           {
               trash = in.nextLine();
             System.out.println("You said: " +trash);
             System.out.println("Please say Y or N");
           }

       }while(!done);


    }
}

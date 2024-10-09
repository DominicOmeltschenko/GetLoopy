import java.util.Random;
public class DieRoller {

    public static void main(String[] args)
    {
        Random generator = new Random();
        int dieOne = new Random().nextInt(6) + 1;
        int dieTwo = new Random().nextInt(6) + 1;
        int dieThree = new Random().nextInt(6) + 1;
        System.out.println(dieOne+ " " + dieTwo + " " + dieThree);
    }
}

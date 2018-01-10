package Chapter3;
import java.util.*;
/**
 * Program to flip a coin and determine whether the user guessed correctly with a 50% chance of success
 * 
 * @author Daniel Bernardy
 */
public class C3_14 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //chooses a 1 or a 2 because i couldnt get it to work with a 1 and a 0
        Random randNum = new Random();
        int randomInt = randNum.nextInt(2) + 1;
        
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        //Takes in the desired number
        System.out.print(
                "Heads or Tails?: ");
        
        //Sets the value of hOrT
        String headsOrTails1 = input.nextLine();
        String headsOrTails = headsOrTails1.toLowerCase();
        
        //Sets the values of heads and tales for checking the user's answer
        final String HEADS = "heads";
        final String TAILS = "tails";
        
        //determines the user's input
        if (headsOrTails.equals(HEADS))
        {
            int oneOrZero = 1;
            
            //determines whether the user wins or not and displays the result
            if(randomInt == oneOrZero)
            {
            System.out.println(
                    "You Win!");
            }
            else
            {
            System.out.println(
                    "You Lose.");
            }
            
        }
        else if (headsOrTails.equals(TAILS))
        {
            int oneOrZero = 2;
            
            //determines whether the user wins or not and displays the result
            if(randomInt == oneOrZero)
            {
            System.out.println(
                    "You Win!");
            }
            else
            {
            System.out.println(
                    "You Lose.");
            }
        }
        else
        {
            System.out.println(
                    "Error: input wasn't heads or tails.");
        }
        
    }
}

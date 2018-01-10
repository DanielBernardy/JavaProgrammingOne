package Chapter5;
import java.util.Scanner;
/**
 * Program to count votes entered by the user
 * 
 * @author Daniel Bernardy
 */
public class P5 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        //initializes values
        String vote1;
        char vote;
        int yes = 0,no = 0;
        int tOrF = 1;
        
        //makes a reoccuring question
        while ( tOrF == 1 )
        {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            vote1 = input.next().toUpperCase();
            vote = vote1.charAt(0);
            
            //determines user input and changes the counter if necissary
            switch(vote)
                {
                case 'Q':   tOrF = 2;
                    break;
                case 'Y':   yes += 1;
                    break;
                case 'N':   no += 1;
                    break;
                default:    System.out.println("INVALID CODE: Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
                }
            
        }
        //outputs the total of the counter
        System.out.println("Total yes votes: " + yes + ", Total no votes: " + no);
    }
}

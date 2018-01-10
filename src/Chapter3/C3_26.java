package Chapter3;
import java.util.Scanner;
/**
 * Program to determine whether an integer entered by the user is divisible by 5 and/or 6 and displays which scenario it is
 * 
 * @author Daniel Bernardy
 */
public class C3_26 
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
        
        //Takes in the desired number
        System.out.println(
                "Enter an integer: ");
        
        //Sets the value of number
        int number = input.nextInt();
        
        //determines whether the number is divisible by 5 and 6 and displays result
        if (number % 5 == 0 && number % 6 == 0)
        {
            System.out.println("Is " + number + " divisible by 5 and 6? true");
        }
        else
        {
            System.out.println("Is " + number + " divisible by 5 and 6? false");
        }
        
        //determines whether the number is divisible by 5 or 6 and displays result
        if (number % 5 == 0 || number % 6 == 0)
        {
           System.out.println("Is " + number + " divisible by 5 or 6? true"); 
        }
        else
        {
            System.out.println("Is " + number + " divisible by 5 or 6? false");
        }
        
        //determines whether the number is divisible by 5 or 6 but not both and displays result
        if (number % 5 == 0 ^ number % 6 == 0)
        {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? true");
        }
        else
        {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? false");
        }
    }
}

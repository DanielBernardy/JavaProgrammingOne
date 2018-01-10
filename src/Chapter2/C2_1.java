package Chapter2;
import java.util.Scanner;
/**
 * Program to convert an input from Celsius to Fahrenheit and display the result
 * 
 * @author Daniel Bernardy
 */
public class C2_1 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //creates scanner
        Scanner input = new Scanner(System.in);
        
        //takes in the desired number
        System.out.println(
                "Enter a dagree in Celsius: ");
        
        //sets the value of Celsius
        double Celsius = input.nextDouble();
        
        //converts Celsius to Fahrenheit and sets the value
        double Fahrenheit = (9.0 / 5) * Celsius + 32;
        
        //displays result onto the user's screen
        System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
}
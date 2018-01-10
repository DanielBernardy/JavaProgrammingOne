package Chapter2;
import java.util.Scanner;
/**
 * Program to calculates the gratuity and total from the subtotal and gratuity rate and displays it onto the console
 * 
 * @author Daniel Bernardy
 */
public class C2_5 
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
                "Enter the subtotal and a gratuity rate: ");
        
        //Sets the value of Subtotal
        double Subtotal = input.nextDouble();
        
        //Sets the value of GratuityRate
        double GratuityRate = input.nextDouble() / 100;
        
        //Calculates the Gratuity
        double Gratuity = GratuityRate * Subtotal;
        
        //Calculates the Total
        double Total = Gratuity + Subtotal;
        
        //Displays the Gratuity and Total
        System.out.println(
                "The gratuity is $" + Gratuity + " and total is $" + Total);
    }
}

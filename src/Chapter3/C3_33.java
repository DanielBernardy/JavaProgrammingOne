package Chapter3;
import java.util.Scanner;
/**
 * Program to determine which package has the better deal and prints the result to the console
 * 
 * @author Daniel Bernardy
 */
public class C3_33 
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
                "Enter weight and price for package 1: ");
        
        //Sets the value of weight1
        double weight1 = input.nextInt();
        
        //sets the value of price1
        double price1 = input.nextDouble();
        
        //Takes in the desired number
        System.out.println(
                "Enter weight and price for package 2: ");
        
        //Sets the value of weight2
        double weight2 = input.nextInt();
        
        //sets the value of price2
        double price2 = input.nextDouble();
        
        //makes ratio of weight1 and price1
        double ratio1 = weight1 / price1;
        
        //makes ratio of weight1 and price1
        double ratio2 = weight2 / price2;
        
        //determines if the ratios are the same or if one of the prices are better and displays a result
        if (ratio1 == ratio2)
        {
            System.out.println("Two packages have the same price.");
        }
        else if(ratio1 > ratio2)
        {
            System.out.println("Package 1 has a better price");
        }
        else if(ratio1 < ratio2)
        {
            System.out.println("Package 2 has a better price");
        }
    }
}

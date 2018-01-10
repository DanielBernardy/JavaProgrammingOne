package Chapter2;
import java.util.Scanner;
/**
 * Program to display the area and volume of a cylinder after the radius and length are entered into the console
 * 
 * @author Daniel Bernardy
 */
public class C2_2 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //Declares a constant
        final double PI = 3.14159;
        
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        //Takes in the desired number
        System.out.println(
                "Enter the radius and length of a cylinder: ");
        
        //Sets the value of Radius
        double Radius = input.nextDouble();
        
        //Sets the value of Length
        double Length = input.nextDouble();
        
        //Calculates and sets the Area
        double Area = Radius * Radius * PI;
        
        //Calculatesand sets the Volume
        double Volume = Area * Length;
        
        //Displays Area of the cylinder
        System.out.println(
                "The area is " + Area );
        
        //Displays Volume of the cylinder
        System.out.println(
                "The volume is " + Volume);
    }
}

package Chapter1;
/**
 * Program to display on the console the perimeter and area of a circle with the pre set radius of 5.5
 * 
 * @author Daniel Bernardy
 */
public class C1_8 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //declares radius
        double radius = 5.5;
        
        //prints "perimeter = " for user to understand its the perimeter
        System.out.print("perimeter = ");
        
        //calculates and prints the perimeter value
        System.out.println(2 * radius * 3.14);
        
        //prints "area = " for the user to understand its the area
        System.out.print("area = ");
        
        //caluclates and prints the area value
        System.out.println(radius * radius * 3.14);
    }
}

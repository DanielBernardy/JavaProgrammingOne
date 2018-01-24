package Chapter7;
import java.util.Scanner;
/**
 * Program to calculate the minimum value in an array
 * 
 * @author Daniel Bernardy
 */
public class C7_9 
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
        
        //initiates array
        double[] num = new double[10];
        
        //takes input for array
        System.out.print("Enter ten numbers: ");
        for(int i = 0;i < 10;i++)
        {
            //sets a value of score at i position
            num[i] = input.nextDouble();
        }
        min(num);
    }
    
    /**
     * Method to calculate and print the minimum number of the array
     * 
     * @param array array value from main
     */
    public static void min(double[] array)
    {
        //declares min value
        double min = 0;
        //iterates through array
        for(int x = 0;x < 10;x++)
        {
            //sets the minimum value for the start
            if(x == 0)
            {
            min = array[x];
            }
            //resets min if array is less than it
            else if(array[x] < min)
            {
                min = array[x];
            }
        }
        //prints the result
        System.out.println("The minimum number is: " + min);
    }
}

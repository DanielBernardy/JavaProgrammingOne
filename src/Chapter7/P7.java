package Chapter7;
import java.util.*;
/**
 * Program to calculate the average of an array inputed by the user
 * 
 * @author Daniel Bernardy
 */
public class P7 
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
    
        //takes input
        System.out.print("How many numbers will be read: ");
        int num = input.nextInt();
        int[] list = new int[num];
        
        System.out.print("\nEnter " + num + " elements: ");
        input(list,input);
        
        //determines and outputs the average
        System.out.println("\nThe average is " + avg(list));
        
        //displays the array
        System.out.print("\nThe contents of the array: ");
        display(list);
    }
    
    /**
     * Method to take the input for an array
     * 
     * @param list
     * @param input 
     */
    public static void input(int [] list, Scanner input)
    {
        //takes input
        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }
        
    }
    
    /**
     * Method to calculate the average
     * 
     * @param list array from main
     * @return
     */
    public static double avg(int[] list)
    {
        //declares variable
        double sum = 0;
        
        //adds values in list
        for(int i = 0;i < list.length;i++)
        {
            sum += list[i];
        }
        
        //calculates the average from the sum and list length
        double avg = sum / list.length;
        
        //returns the average
        return avg;
    }
    
    /**
     * Method to display the array
     * 
     * @param list array from main
     */
    public static void display(int[] list)
    {
        //displays list
        System.out.println(Arrays.toString(list));
    }
}

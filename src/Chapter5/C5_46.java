package Chapter5;
import java.util.Scanner;
/**
 * Program to reverse a string
 * 
 * @author Daniel Bernardy
 */
public class C5_46 
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
        
        //Takes in the desired string
        System.out.print("Enter a string: ");
        
        //Sets the value of s1
        String s1 = input.nextLine();
        
        //displays result
        System.out.print("The reversed string is ");
        
        for(int x = s1.length()-1 ; x >= 0 ; x--)
        {
        System.out.print(s1.charAt(x));
        }
    }
}

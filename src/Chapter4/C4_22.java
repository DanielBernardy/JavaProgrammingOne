package Chapter4;
import java.util.Scanner;
/**
 * Program to check if a string entered by the user is a substring of another string the user entered
 * 
 * @author Daniel Bernardy
 */
public class C4_22 
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
        System.out.print("Enter string s1: ");
        
        //Sets the value of s1
        String string1 = input.nextLine();
        
        //Takes in the desired string
        System.out.print("Enter string s2: ");
        
        //Sets the value of s2
        String string2 = input.nextLine();
        
        //determines if s2 is a substring of s1
        if(string1.contains(string2))
        {
            System.out.println(string2 + " is a substring of " + string1);
        }
        else
        {
            System.out.println(string2 + " is not a substring of " + string1);
        }
    }
}

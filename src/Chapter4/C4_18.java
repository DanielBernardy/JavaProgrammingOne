package Chapter4;
import java.util.Scanner;
/**
 * Program to display what major and year a student is after the student has entered a number and a letter
 * 
 * @author Daniel Bernardy
 */
public class C4_18 
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
        
        //Takes in the desired characters
        System.out.print("Enter two characters: ");
        
        //Sets the value of userInput and assignes letter and number values
        String userInput = input.nextLine();
        char letter = userInput.charAt(0);
        char number = userInput.charAt(1);
        
        //declares variables
        String major, status;
        
        //sets the major
        switch(letter)
        {
            case 'M':   major = "Mathematics";
                        break;
            case 'C':   major = "Computer Science";
                        break;
            case 'I':   major = "Information Technology";
                        break;
            default:    major = "Error";
        }
        
        //sets the status
        switch(number)
        {
            case '1':   status = " Freshman";
                        break;
            case '2':   status = " Souphmore";
                        break;
            case '3':   status = " Junior";
                        break;
            case '4':   status = " Senior";
                        break;
            default:    status = "Error";
        }
        
        //displays the major and status
        if(((major).equals("Error")) || ((status).equals("Error")) )
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println(major + status);
        }
    }
}

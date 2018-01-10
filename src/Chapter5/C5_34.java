package Chapter5;
import java.util.Scanner;
/**
 * Program to play the game rock paper scissors
 * 
 * @author Daniel Bernardy
 */
public class C5_34 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //declares variables
        String computer1 , userInput1;
        int counter = 0;
        int counter1 = 0;
        
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        while( (counter != (counter1 + 2) ) && (counter1 != (counter + 2) ) )
        {
            //Takes in the desired number
            System.out.print("scissor(0), rock (1), paper (2): ");
            int userInput = input.nextInt();
        
            //chooses a number 
            int computer = (int)(Math.random() * 3);
        
            //assigns computer1 a string value
            switch(computer)
            {
                case 0:   computer1 = "scissor";
                         break;
                case 1:   computer1 = "rock";
                            break;
                case 2:   computer1 = "paper";
                            break;
                default:  computer1 = " ";
            }
            
            //assigns userInput1 a string value
            switch(userInput)
            {
                case 0:   userInput1 = "scissor";
                            break;
                case 1:   userInput1 = "rock";
                            break;
                case 2:   userInput1 = "paper";
                            break;
                default:  userInput1 = " ";
            }
        
            //checks who wins and displays output
            if(userInput >= 3)
            {
                System.out.println("Invalid input.");
            }
            else if(userInput == computer)
            {
                System.out.println("The computer is " + computer1 + ". You are " + userInput1 + " too. It is a draw");
            }
            else if((computer == 0) && (userInput == 2))
            {
                System.out.println("The computer is " + computer1 + ". You are " + userInput1 + ". You lose");
                counter1++;
            }
            else if((computer == 2) && (userInput == 0))
            {
                System.out.println("The computer is " + computer1 + ". You are " + userInput1 + ". You won");
                counter++;
            }
            else if(userInput > computer)
            {
                System.out.println("The computer is " + computer1 + ". You are " + userInput1 + ". You won");
                counter++;
            }
            else if(userInput < computer)
            {
                System.out.println("The computer is " + computer1 + ". You are " + userInput1 + ". You lose");
                counter1++;
            }
            
            //displays the count
            System.out.println("user: " + counter + "\ncomputer: " + counter1);
        }
    }
}

package Chapter6;
import java.util.Scanner;
/**
 * Program to check if a password matches three requirements
 * 
 * @author Daniel Bernardy
 */
public class C6_18 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) 
    {
        //declares variable
        String password;

        //Creates scanner
        Scanner input = new Scanner(System.in);

        System.out.print("password must have: \nat least 8 character, \nconsist of only letters and digits, \ncontain at least two digits\n \nPlease enter your password: ");
        password = input.nextLine();
        char password1;
        
        //checks if password length is at least 8 characters
        if (password.length() >= 8) 
        {
            //checks if password is is only letters and digits
            if (password.matches("[a-zA-Z0-9]*")) 
            {
                //checks if password has at least two digits
                int counter = 0;
                for (int i = 0; i < password.length(); i++) 
                {
                    
                    //if (Character.isDigit(password.charAt(i))) ++counter;
                    
                    password1 = password.charAt(i);

                    switch (password1) 
                    {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            counter++; break;
                        default:
                            break;
                    }
                }

                if (counter >= 2) 
                {
                    System.out.println("Valid Password");
                } else 
                {
                    System.out.println("Invalid Password");
                }
            } else 
            {
                System.out.println("Invalid Password");
            }
        } else 
        {
            System.out.println("Invalid Password");
        }
    }
}

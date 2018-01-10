package Chapter3;
import java.util.Scanner;
/**
 * Program to compare two numbers and what grade the number would correspond to
 * 
 * @author Daniel Bernardy
 */
public class P3 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt 
     */
    public static void main(String[]args)
    {
        //declares num1 and num2
        double num1,num2;
        
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        //Takes in the desired number for num1
        System.out.println("Enter a number: ");
        
        //Sets the value of num1
        num1 = input.nextDouble();
        
        //takes in the desired number for num2
        System.out.println("Enter another number: ");
        
        //Sets the value of num2
        num2 = input.nextDouble();
        
        //If the first number is less than the second then display a message saying” The first number is less than the second”.
        if(num1 < num2)
        {
            System.out.println("The first number is less than the second");
        }
        
        //If the first number is greater than the second then display a message saying” The first number is greater than the second”.
        if(num1 > num2)
        {
            System.out.println("The first number is greater than the second");
        }
        
        //If the first number is equal to the second then display a message saying” The first number is equal to the second”.
        if(num1 == num2)
        {
            System.out.println("The first number is equal to the second");
        }
        
        //If the first number is less than or equal to the second then display a message saying” The first number is less than or equal to the second”.
        if(num1 <= num2)
        {
            System.out.println("The first number is less than or equal to the second");
        }
        
        //If the first number is not equal to the second then display a message saying” The first number is not equal to the second”.
        if(num1 != num2)
        {
            System.out.println("The first number is not equal to the second");
        }
        
        //If the second number is equal to zero, then display a message saying “Cannot divide by zero. Otherwise, if the first number divided by the second number is less than one, display a message saying “proper fraction”. Otherwise, display a message saying “improper fraction”.
        if(num2 == 0)
        {
            System.out.println("Cannot divide by zero.");
        }
        else if((num1 / num2) < 1)
        {
            System.out.println("proper fraction");
        }
        else
        {
            System.out.println("improper fraction");
        }
        
        //If the first number is greater than or equal to 90 then display “A”. Otherwise, if the value is greater than or equal to 80 then display “B”. Otherwise, if the value is greater than or equal to 70 then display “C”. Otherwise, if the value is greater than or equal to 60 then display “D”. Otherwise, display “F”.
        if(num1 >= 90)
        {
            System.out.println("A");
        }
        else if(num1 >= 80)
        {
            System.out.println("B");
        }
        else if(num1 >= 70)
        {
            System.out.println("C");
        }
        else if(num1 >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
        
        //If the second number is between 1 and 100 then display the message “In range”. Otherwise, display the message “Out of range”.
        if((num2 >= 1) && (num2 <= 100))
        {
            System.out.println("In range");
        }
        else
        {
            System.out.println("Out of range");
        }
    }
}

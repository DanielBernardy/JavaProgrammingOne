package Chapter4;
import java.util.Scanner;
/**
 * Program to compare two bidders pay per hour of work and how long to find the better deal
 * 
 * @author Daniel Bernardy
 */
public class P4 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //declares variables
        String name1;
        String name2;
        int hours1,hours2;
        double payRate1,payRate2,cost1,cost2;
        
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        //Takes in the desired characters
        System.out.print("Enter the first bidder's name: ");
        
        //Sets the value of name1
        name1 = input.next();
        
        //Takes in the numbers of hours of work
        System.out.print("Enter the number of hours the bidder will require: ");
        
        //Sets value of hours1
        hours1 = input.nextInt();
        
        //Takes in the rate of pay per hour
        System.out.print("Enter the amount of pay per hour of work: $");
        
        //Sets value of payRate1
        payRate1 = input.nextDouble();
        
        //Takes in the desired characters
        System.out.print("Enter the second bidder's name: ");
        
        //Sets the value of name2
        name2 = input.next();
        
        //Takes in the numbers of hours of work
        System.out.print("Enter the number of hours the bidder will require: ");
        //Sets value of hours2
        hours2 = input.nextInt();
        
        //Takes in the rate of pay per hour
        System.out.print("Enter the amount of pay per hour of work: $");
        
        //Sets value of payRate2
        payRate2 = input.nextDouble();
        
        //sets the values of cost1 and cost2
        cost1 = hours1 * payRate1;
        cost2 = hours2 * payRate2;
        
        //displays the winner and the cost
        if(cost1 < cost2)
        {
            System.out.print("Winner is: " + name1 + " ,and cost is: $");
            System.out.printf("%4.2f" , cost1);
        }
        else if(cost1 > cost2)
        {
            System.out.print("Winner is: " + name2 + " ,and cost is: $");
            System.out.printf("%4.2f" , cost2);
        }
        else if((cost1 == cost2) && (hours1 < hours2))
        {
            System.out.print("Winner is: " + name1 + " ,and cost is: $");
            System.out.printf("%4.2f" , cost1);
            System.out.print(" ,and hours of work: " + hours1);
        }
        else if((cost1 == cost2) && (hours1 > hours2))
        {
            System.out.print("Winner is: " + name2 + " ,and cost is: $");
            System.out.printf("%4.2f" , cost2);
            System.out.print(" ,and hours of work: " + hours2);
        }
        else if((cost1 == cost2) && (hours1 == hours2))
        {
            System.out.println("The bidders " + name1 + " and " + name2 + " have identical bids.");
            System.out.print("number of hours: " + hours1 + " ,cost per hour: $");
            System.out.printf("%4.2f" , payRate1);
            System.out.print(" ,total cost: $");
            System.out.printf("%4.2f" , cost1);
        }
    }
}
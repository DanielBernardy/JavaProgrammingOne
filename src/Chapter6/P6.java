package Chapter6;
import java.util.Scanner;
/**
 * Program to convert dollars to euro, pound, or yen with a fee
 * 
 * @author Daniel Bernardy
 */
public class P6 
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
        System.out.print("How many Euros does a dollar buy? ");
        double euroToDollar = input.nextDouble();
        
        System.out.print("\nHow many Pound Sterling does a dollar buy? ");
        double poundToDollar = input.nextDouble();
        
        System.out.print("\nHow many Yen does a dollar buy? ");
        double yenToDollar = input.nextDouble();
        
        //makes reoccuring question
        String yOrN = "YES";
        while(yOrN.equals("YES"))
        {
            double exchangeRate;

            //determines how much your converting
            System.out.print("\nPlease enter the number of dollars you want to convert: $");
            double dollar = input.nextDouble();
            double dollars = dollar;
            
            //determines what your converting it to
            System.out.print("\nEnter E to buy Euros, P to buy Pounds, Y to buy Yen: ");
            String purchsKind1 = input.next().toUpperCase();
            char purchsKind = purchsKind1.charAt(0);
            
            //applys fee
            dollars = currencyCount(dollars,feeDeter(dollars));
            
            //determines conversion type
            boolean epyDet = true;
            double value;
            while(epyDet == true)
            {
                switch(purchsKind)
                {
                    case 'E':   value = dollars * euroToDollar;
                        System.out.printf("\nFor %3.2f dollars, you will be able to buy %3.2f Euros.", dollar, value);
                        epyDet = false;
                        break;
                    case 'P':   value = dollars * poundToDollar;
                        System.out.printf("\nFor %3.2f dollars, you will be able to buy %3.2f Pounds.", dollar, value);
                        epyDet = false;
                        break;
                    case 'Y':   value = dollars * yenToDollar;
                        System.out.printf("\nFor %3.2f dollars, you will be able to buy %3.2f Pounds.", dollar, value);
                        epyDet = false;  
                        break;
                    default:    System.out.println("Invalid input. try again.");
                }
            }
            
            //determines if you want to do more conversions or not
            boolean yOrNDet = true;
            while(yOrNDet == true)
            {
                System.out.print("\n\nAre there more conversions to perform? :");
                String yOrN1 = input.next().toUpperCase();
            
                switch(yOrN1)
                {
                    case "YES": yOrNDet = false;
                        break;
                    case "NO":  yOrN = "NO"; 
                        yOrNDet = false;
                        break;
                    default:    System.out.println("\nInvalid input. try again.");
                }
            }
        }
    }
    
    /**
     * Method to calculate the fee
     * 
     * @param dollars1 the amount of dollars being converted
     * @param exchangeRate1 the percent of dollars the fee will be
     * @return the amount of dollars with the fee taken
     */
    public static double currencyCount(double dollars1, double exchangeRate1)
    {
          //takes the fee
          return dollars1 += dollars1 * exchangeRate1;
    }
    
    /**
     * Method to calculate what percentage of dollars the fee will be
     * 
     * @param dollars1 the amount of dollars being converted
     * @return what percent to take away from dollars 
     */
    public static double feeDeter(double dollars1)
    {
            if(dollars1 <= 100)
            {
                return -.1;   
            }
            else //if(dollars > 100)
            {
                return -.05;
            }
    }
}

package Chapter2;
import java.util.Scanner;
/**
 *Program to add up and display total price for a dinner
 * 
 * @author Daniel Bernardy
 */
public class P2 
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
        
        //takes in the price of the meal
        System.out.print("Please enter the price of your meal: $");
        
        //sets the value for Meal
        double Meal = input.nextDouble();
        
        //takes in the price of the Drink
        System.out.print("Please enter the price of your Drink: $");
        
        //sets the value for Drink
        double Drink = input.nextDouble();
        
        //takes in the price of the Desert
        System.out.print("Please enter the price of your Desert: $");
        
        //sets the value for Desert
        double Desert = input.nextDouble();
        
        //adds the total for the food
        double Food = Meal + Drink + Desert;
        
        //takes 10% of the food price for tax
        double Tax = Food * .1;
        
        //takes 15% from the food and the tax for tip
        double Tip = .15 * (Food + Tax);
        
        //adds the food tax and tip to get the total price
        double Total = Food + Tax + Tip;
        
        //displays the Food, Tax, Tip, and Total price
        System.out.println("Food: $" + Food + " Tax: $" + Tax + " Tip: $" + Tip + " Total: $" + Total);   
    }
}


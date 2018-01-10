package Chapter4;
import java.util.Scanner;
/**
 * Program to make a financial application payroll when a user enters their personal information
 * 
 * @author Daniel Bernardy
 */
public class C4_23 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //declares variables
        String name;
        double hoursWorked,hourlyPay,fedTaxWithRate,stateTaxWithRate,grossPay,fedWith,stateWith,deductions,netPay;
        
        //Creates scanner
        Scanner input = new Scanner(System.in);
        
        //Takes in the desired characters
        System.out.print("Enter employee's name: ");
        //Sets the value of name
        name = input.nextLine();
        
        //Takes in the desired characters
        System.out.print("Enter number of hours worked in a week: ");
        //Sets the value of 
        hoursWorked = input.nextInt();
        
        //Takes in the desired characters
        System.out.print("Enter hourly pay rate: ");
        //Sets the value of 
        hourlyPay = input.nextDouble();
        
        //Takes in the desired characters
        System.out.print("Enter federal tax withholding rate: ");
        //Sets the value of 
        fedTaxWithRate = input.nextDouble();
        
        //Takes in the desired characters
        System.out.print("Enter state tax withholding rate: ");
        //Sets the value of 
        stateTaxWithRate = input.nextDouble();
        
        //sets grossPay
        grossPay = hoursWorked * hourlyPay;
        
        //caluclates and displays the payroll statement
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Pay Rate; $%4.2f", hourlyPay);
        System.out.printf("\nGross Pay: $%4.2f", grossPay);
        System.out.println("\nDeductions:");
        
        fedWith = fedTaxWithRate * grossPay;
        stateWith = stateTaxWithRate * grossPay;
        deductions = fedWith + stateWith;
        netPay = grossPay - deductions;
        System.out.print("   Federal Withholding (" + (fedTaxWithRate * 100) + "%): $");
        System.out.printf("%4.2f \n", fedWith);
        System.out.print("   State Withholding (" + (stateTaxWithRate * 100) + "%): $");
        System.out.printf("%4.2f \n", stateWith);
        
        System.out.printf("   Total Deduction: $%4.2f" , deductions);
        
        System.out.printf("\nNetPay: $%4.2f" , netPay);
    }
}

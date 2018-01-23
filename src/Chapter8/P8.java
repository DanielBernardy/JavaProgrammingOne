package Chapter8;
import java.util.*;
/**
 * Program to 
 * 
 * @author Daniel Bernardy
 */
public class P8 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[]args)
    {
        //Creates scanner and initialize majority of variables
        Scanner input = new Scanner(System.in);
        String amountStr;
        
        //declare variables
        int x = 0,y = 0;
        boolean check1 = true ,check2 = true ,check3 = true, check4 = true, checkA = true;
        float[] outputTotal;
        float[][] arr = new float [4][5];
        
        while(checkA)
        {
            check1 = true ;
            check2 = true ;
            check3 = true ;
            check4 = true ;
            
            String yOrN;
            char yOrN1;
            float amount = 0;
            //takes in the id
            while(check1)
            {
                System.out.print("Computer prompt: Enter the salesman ID as A, B, C, or D.\nUser reply: ");
                String salesmanId = input.next();
                char iD = salesmanId.toUpperCase().charAt(0);
                
               switch(iD)
                {
                    case 'A':   x = 0;
                                check1 = false;
                                break;
                    case 'B':   x = 1;
                                check1 = false;
                                break;
                    case 'C':   x = 2;
                                check1 = false;
                                break;
                    case 'D':   x = 3;
                                check1 = false;
                                break;
                    default:    System.out.println("Invalid input");
                }
            }
            //takes in which day
            while(check2)
            {
                System.out.print("Computer prompt: Enter the day as M, T, W, H, or F.\nUser reply: ");
                String weekDay = input.next();
                char day = weekDay.toUpperCase().charAt(0);
            
                switch(day)
                {
                    case 'M':   y = 0;
                                check2 = false;
                                break;
                    case 'T':   y = 1;
                                check2 = false;
                                break;
                    case 'W':   y = 2;
                                check2 = false;
                                break;
                    case 'H':   y = 3;
                                check2 = false;
                                break;
                    case 'F':   y = 4;
                                check2 = false;
                                break;
                    default:    System.out.println("Invalid input");
                }
            }
            //takes in the amount of sale
            while(check3)
            {
                System.out.print("Computer prompt: Enter the amount of the sale\nUser reply: $");
                amountStr = input.next();
            
                if (amountStr.matches("[a-zA-Z]+")) 
                {
                    System.out.println("Invalid input");
                }
                else
                {
                    amount = Float.parseFloat(amountStr);
                    check3 = false;
                }
            }
        
            arr[x][y] += amount;
            
            //checks to see if the user wants to input anything else
            while(check4)
            {
                System.out.print("Computer prompt: : More data? Enter Y for more or N to stop.\nUser reply: ");
                yOrN = input.next();
                yOrN1 = yOrN.toLowerCase().charAt(0);
            
                switch(yOrN1)
                {
                    case 'n' :  check4 = false;
                                checkA = false;
                                break;
                    case 'y' :  check4 = false;
                                
                                //checkA = true;
                                break;
                    default:    System.out.println("Invalid input");
                }
                
            }
            
        }
        
        //displays the sales for each day and person
        System.out.println("salesman\tM\tT\tW\tH\tF");
        for (int t = 0; t < 4; t++) 
        {
            switch(t)
            {
                case 0: System.out.print("    A\t\t");
                    break;
                case 1: System.out.print("    B\t\t");
                    break;
                case 2: System.out.print("    C\t\t");
                    break;
                case 3: System.out.print("    A\t\t");
                    break;
            }

            for (int j = 0; j < 5; j++) 
            {
                System.out.printf("%4.2f\t",arr[t][j]);
            } 
            System.out.print("\n");

        }
        
        //adds up the sales for each person
        System.out.println("\ntotal of the sales");
        outputTotal = total(arr);
        for(int i = 0; i < outputTotal.length; i ++)
        {
            switch(i)
            {
                case 0:System.out.printf("A = %4.2f\n",outputTotal[i]);
                    break;
                case 1:System.out.printf("B = %4.2f\n",outputTotal[i]);
                    break;
                case 2:System.out.printf("C = %4.2f\n",outputTotal[i]);
                    break;
                case 3:System.out.printf("D = %4.2f\n",outputTotal[i]);
                    break;
            }
        }
        
        //System.out.println("salesman    M   T   W   H   F");
        //System.out.println();
    }
    
    /**
     * Method to add up the totals and make a 1 dimensional array containing the output
     * 
     * @param totalWeek 2D array from main
     * @return 
     */
    public static float[] total(float [][] totalWeek)
    {
        
        //adds up the days
        float[] totalId = new float [4];
        
        for(int x = 0; x < 4; x++)
        {
            float sum2 = 0;
            for(int y = 0; y < 5 ;y++)
            {
                sum2 += totalWeek[x][y];
            }
            totalId[x] = sum2;
        }
        return totalId;
    }
}


package Chapter8;
/**
 * Program to print employee hours for a week and calculate the total hours
 * 
 * @author Daniel Bernardy
 */

public class C8_4 
{
    /**
    * Main Method
    * 
    * @param args arguments from command line prompt
    */
    public static void main(String[] args) 
    {
        //initializes 2d array
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        int[][] max = new int[8][2];
        
        //prints the array and calculates the total
        System.out.println("               Su   M    T    W    Th   F    Sa   Total");
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            System.out.print("Employee " + i + "     ");

            //calculates the total and prints the result
            for (int j = 0; j < 7; j++) {
                System.out.print(hours[i][j] + "    ");
                sum += hours[i][j];
            }
            //adds the employee number and the total hours to an array
            max[i][1] = i;
            max[i][0] = sum;
            System.out.print(sum + "\n");
        }

        System.out.println("\nExtra credit output: ");

        //sorts the array from least to greatest depending on the second value in each set
        //in cases of the values being the same in two or more cases it arranges by the first data values spot in the same manner as it would the second
        java.util.Arrays.sort(max, (int[] a, int[] b) -> Double.compare(a[0], b[0]));

        //displays the data backwards to make it show greatest to least rather than least to greatest
        for (int i = 7; i > -1; i--) {
            System.out.println("Employee " + max[i][1] + ": " + max[i][0]);

        }
    }
}

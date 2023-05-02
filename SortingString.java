// Import at top
import java.util.Scanner;
/** SortingString.java - Reverse lexicographic order
 * <p>Problem Statement: Write a program which prompts the user for three  Strings, 
 * then sorts and displays them in reverse lexicographic (largest first,
 * then smaller, then smallest) order on your screen.
 * </p>
 * 
 * <p>Algorithm: <br />
 *   1. Import java.util.Scanner <br />
 *   2. Create main class <br />
 *   3. Create string variables, first - third <br />
 *   4. Ask user for string 1, 2, and 3 inputs <br />
 *   5. Trim each string and turn it into a string variable <br />
 *   6. Create an if statement to quit the program <br />
 *   7. Use if statements to set the string variables from largest to smallest <br />
 *   8. Do this by comparing them with .equals and using > 0 <br />
 *   9. Assign each string to first, second, or third <br />
 *   9. After comparing all of the strings and ranking them, print to screen <br />
 *   10.Compile and test <br />
 * </p>
 *   @author Ethan Grant
 *   @version Module 6, Homework 2
 */

public class SortingString {
    public static void main(String[] args) 
    {
        {
            // variables
            String first = "";
            String second = "";
            String third = "";

            // Ask user for inputs
            System.out.print("Please enter three strings below: \n");
            System.out.print("String 1: \n");
            Scanner one =
                new Scanner(System.in); 
            // Turn into string variable and trim whitespace
            String stringOne = one.nextLine().trim();   
            // Allow user to exit program
            if (stringOne.equals("quit")) {
                System.out.println("Now quitting...");
                System.exit(0);
            }   

            System.out.print("String 2: \n");
            Scanner two =
                new Scanner(System.in); 
            String stringTwo = two.nextLine().trim();  
            if (stringTwo.equals("quit")) {
                System.out.println("Now quitting...");
                System.exit(0);
            }

            System.out.print("String 3: \n");
            Scanner three =
                new Scanner(System.in); 
            String stringThree = three.nextLine().trim();
            if (stringThree.equals("quit")) {
                System.out.println("Now quitting...");
                System.exit(0);
            }

            // Set the order of string variables, largest to smallest
            if (stringOne.compareTo(stringTwo) > 0 && stringOne.compareTo(stringThree) > 0) {
                // Assign the strings to first, second, or third depending on size
                first = stringOne;
                // If string one is largest, then calculate which is the next biggest string
                if (stringTwo.compareTo(stringThree) > 0) {
                    second = stringTwo;
                    third = stringThree;
                }
                else {
                    // If string two is not the second biggest, then string three is
                    second = stringThree;
                    third = stringTwo;
                }}
            // Repeat
            else if (stringTwo.compareTo(stringOne) > 0 && stringTwo.compareTo(stringThree) > 0) {
                first = stringTwo;
                if (stringOne.compareTo(stringThree) > 0) {
                    second = stringOne;
                    third = stringThree;   
                }
                else {
                    second = stringThree;
                    third = stringOne;
                }}
            // Repeat
            else if (stringThree.compareTo(stringOne) > 0 && stringThree.compareTo(stringTwo) > 0) {
                first = stringThree;

                if (stringOne.compareTo(stringTwo) > 0) {
                    second = stringOne;
                    third = stringTwo;
                }
                else {
                    second = stringTwo;
                    third = stringOne;
                }}

            // Print out the strings in reverse lexicographic ar
            System.out.printf("Those Strings in reverse lexicographic order are:\n");
            System.out.printf(" 1. %s\n 2. %s\n 3. %s\n", first, second, third); 

        }    
    }
}
// Import at top
import java.util.Scanner;
/** CarRentalQuotes.java - Estimates adult height of child
 * <p>Problem Statement: Calculate a child's expected height using the height of 
 * the father and mother.
 * </p>
 * 
 * <p>Algorithm: <br />
 *   1. Import java.util.Scanner <br />
 *   2. Create main class <br />
 *   3. Create variables involving feet, inches, and height for the mother, father, and child <br />
 *   4. Ask user for gender, parent feet and inches inputs, read it from the system console, and turn them into string and
 *      int variables <br />
 *   5. Turn user inputs into one variable, converting feet to inches and adding the inches variable <br />
 *   6. Create an if statement, separating male and female. Male = ((mother * 13 / 12) + father) / 2
 *      Female = ((father * 12 / 13) + mother) / 2 <br />
 *   7. Split the calculation into feet and inches for the child <br />
 *   8. Print out statement <br />
 *   9/ Compile and test <br />
 * </p>
 *   @author Ethan Grant
 *   @version Module 6, Homework 1
 */

public class ChildHeight {
    public static void main(String[] args) 
    {
    {
        // Variables
        int intFatherFeet = 0;
        int intFatherInches = 0;
        int intFatherHeight = 0;
        int intMotherFeet = 0;
        int intMotherInches = 0;
        int intMotherHeight = 0;
        int childHeight = 0;
        int childFeet = 0;
        int childInches = 0;
        // Ask user for inputs
        System.out.print("Enter gender of child (Male/Female)\n");
        // Reads from system console
        Scanner gender =
            new Scanner(System.in); 
        // Turn into string variable
        String stringGender = gender.nextLine();

        // Ask user for inputs
        System.out.print("Enter height of father in feet\n");
        // Reads from system console
        Scanner fatherFeet =
            new Scanner(System.in); 
        // Turn into int variable
        intFatherFeet = fatherFeet.nextInt();
        
        System.out.print("Enter remaining height of father in inches\n");
        Scanner fatherInches =
            new Scanner(System.in); 
        intFatherInches = fatherInches.nextInt(); 
       
        System.out.print("Enter height of mother in feet\n");
        Scanner motherHeight =
            new Scanner(System.in); 
        intMotherFeet = motherHeight.nextInt();
        
        System.out.print("Enter remaining height of mother in inches\n");
        Scanner motherInches =
            new Scanner(System.in); 
        intMotherInches = motherInches.nextInt(); 
        
        // Convert to one variable
        intFatherHeight = intFatherFeet * 12 + intFatherInches;
        intMotherHeight = intMotherFeet * 12 + intMotherInches;
        // Calculate child's height depending on if male or female 
        if (stringGender.equalsIgnoreCase("Male")) {
           childHeight = Math.round(((intMotherHeight * 13 / 12) + intFatherHeight) / 2);
    }
        else if (stringGender.equalsIgnoreCase("Female")) {
           childHeight = Math.round(((intFatherHeight * 12 / 13) + intMotherHeight) / 2);
    }
        // Split into feet and height for output statement
        childFeet = childHeight / 12;
        childInches = childHeight % 12;
        
        // Print out calculation 
        System.out.printf("The child's height might be %d'%d\"", childFeet, childInches);
    
    }
    }
    }
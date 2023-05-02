// Import at top
import java.util.Scanner;
/** FractionMain.java - 
 * <p>Problem Statement:
 * </p>
 * 
 * <p>Algorithm: <br />
 *   1. Import java.util.Scanner <br />
 *   2. Create two classes, one of them main <br />
 *   3. Create instance variables, numerator and denominator <br />
 *   4. Create a constructor setting values of numerator and denominator <br />
 *   5. Create getter and setter methods <br />
 *   6. Create a showFraction method to display the fraction on the screen as a ratio <br />
 *   7. Create a equals method <br />
 *   8. Create a toString method with String.format and use a realValues variable to get
 *      the value of the fraction by diving numerator and denominator <br />
 *   9. In the main class create six different fraction objects <br />
 *   10.Determine if the pairs are equal with .equals and print <br />
 *   11. Print out statements referencing toString <br />
 *   12. Compile and test <br />
 *      
 * </p>
 *   @author Ethan Grant
 *   @version Module 6, Homework 3
 */

public class FractionMain {
    public static void main(String[] args) 
    {
        {
           Fraction fractionOne =
               new Fraction(1,4);
           Fraction fractionTwo =
               new Fraction(5,20);
           System.out.print("1/4 and 5/20 are " + fractionOne.equals(fractionTwo)); 
           
           Fraction fractionThree =
               new Fraction(5,9);
           Fraction fractionFour =
               new Fraction(85,153);
           System.out.print("\n5/9 and 85/153 are " + fractionThree.equals(fractionFour)); 
          
           Fraction fractionFive =
               new Fraction(-6,4);
           Fraction fractionSix =
               new Fraction(-125,83);
           System.out.print("\n-6/4 and -125/83 are " + fractionFive.equals(fractionSix)); 
           
           System.out.print(fractionOne.toString()); 
           System.out.print(fractionTwo.toString()); 
           System.out.print(fractionThree.toString()); 
           System.out.print(fractionFour.toString()); 
           System.out.print(fractionFive.toString()); 
           System.out.print(fractionSix.toString()); 
        }
    } 
}
// Import at top
import java.util.Scanner;
/**
 * Fraction.java - Compare different fraction
 * 
 * <p> Instance variables:
 *     Int numerator = the numerator of the fraction <br />
 *     Int denominator = the denominator of the fraction <br />
 *     Double realValue = Calculation of the fraction
 *     String stringValue = Turns realValue into a string for formatting
 *                          of the decimals <br />
 * </p>
 * <p> Methods: <br />
 *     full constructor <br />
 *     getters and setters <br />
 *     showFraction <br />
 *     equals <br />
 *     toString <br />
 * </p> 
 *   @author Ethan Grant
 *   @version Module 6, Homework 3
 */

    public class Fraction 
    {
        // Instance variables
        private int numerator = 0;
        private int denominator = 0;

       // Constructor that sets the values of instance variables
       public Fraction(int newNumerator, int newDenominator) {
           numerator = newNumerator;
           denominator = newDenominator; 
           
       }
       // Setters
       public void setNumerator(int newNumerator) {
           numerator = newNumerator;
       }
       public void setDenominator(int newDenominator) {
           denominator = newDenominator;
       }
      
       // Getters
       public int getNumerator() {
           return numerator;
       }
       public int getDenominator() {
           return denominator;
       }
      
       // ShowFraction Method to display fraction as ratio
       public String showFraction() {
           return numerator + "/" + denominator;
       }
       
       // Equals method
       public boolean equals(Fraction another) {
           if (denominator == 0 ||
                       another.denominator == 0) {
               return false;
           }
           // Cross multiplication to compare products 
           return numerator * another.denominator == denominator * another.numerator;
       }
       
       // toString method 
       public String toString() {
           double realValue = (double) numerator / denominator;
           return String.format("\nThe fraction %s evaluates to %.2f ",showFraction(), realValue);
       }
    }
    
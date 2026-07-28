import java.util.Scanner;

public class MathPractice {
    /*
     * // 📝 MEMORY REVISION - ERRORS PERFORMED:
     * // 1. UNUSED IMPORT: 'import java.util.Scanner' (❌) was flagged 
     * //    because no Scanner object was created in the main method.
     */

    public static void main(String[] args) {
        // FIXED: Now we actually USE the Scanner tool
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble(); 
        
        double num2 = -10.5;

        // a. Finding Minimum
        System.out.println("Minimum of input and 50: " + Math.min(num1, 50)); 

        // b. Finding Maximum
        System.out.println("Maximum of input and 50: " + Math.max(num1, 50));

        // c. Square Root
        System.out.println("Square Root of " + num1 + ": " + Math.sqrt(num1));

        // f. Absolute Value
        System.out.println("Absolute value of -10.5: " + Math.abs(num2));
        
        sc.close(); // Good practice to close it!
    }
}
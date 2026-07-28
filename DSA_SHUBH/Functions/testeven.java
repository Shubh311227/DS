/*
 * 📝 REVISION NOTES: testeven.java
 * --------------------------------------------------------------------------
 * 1. IMPORT ERROR: 'scanner' (❌) -> 'Scanner' (✅). Classes must be capitalized.
 * 2. PRINT TYPO: 'printn' (❌) -> 'println' (✅). It stands for "print line".
 * 3. RETURN TYPE: Using 'int' (❌) for a true/false question. Use 'boolean' (✅).
 * 4. KEYWORD CASE: 'Return', 'True', 'False' (❌) -> 'return', 'true', 'false' (✅).
 * 5. METHOD CALL: 'isEven()' (❌) -> 'isEven(a)' (✅). You must pass the variable
 * into the parentheses so the method has data to process.
 * 6. TERMINAL BLANK: Added a System.out.print prompt so you know when to type.
 * --------------------------------------------------------------------------
 */

import java.util.Scanner;

public class testeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Added prompt so the terminal isn't just a blank blinking cursor
        System.out.print("Enter an integer to check: ");
        int a = sc.nextInt();
        
        // FIXED: Passed 'a' as an argument and corrected the println typo
        System.out.println("Result: " + isEven(a));
        
        sc.close();
    }

    // FIXED: Changed return type to boolean and used lowercase keywords
    public static boolean isEven(int num) {
        // The ternary operator: (condition) ? (if true) : (if false)
        return num % 2 == 0 ? true : false;
    }   
}
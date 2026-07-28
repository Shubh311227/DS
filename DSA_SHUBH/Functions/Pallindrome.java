import java.util.Scanner;

class Pallindrome {
    /*
     * 📝 MEMORY REVISION - ERRORS PERFORMED:
     * --------------------------------------------------------------------------
     * // 1. SYSTEM CASE: 'system.in' (❌) -> 'System.in' (✅). 
     * //    Classes like System must be capitalized in Java.
     * * // 2. RESERVED WORD: 'int new = 0' (❌) -> 'int reversed_x = 0' (✅). 
     * //    'new' is a reserved keyword in Java used to create objects; 
     * //    it cannot be used as a variable name.
     * * // 3. FOR LOOP SYNTAX: 'for(y>0;y/=10)' (❌) -> 'for(; y > 0; y /= 10)' (✅). 
     * //    A 'for' loop MUST have two semicolons (initialization; condition; update).
     * * // 4. LOGIC (REVERSAL): 'a*(int)Math.pow(10,p)' (❌) -> '(rev * 10) + a' (✅). 
     * //    Using powers of 10 actually rebuilt the number in its original order. 
     * //    To reverse it, you must multiply the running total by 10.
     * * // 5. MISSING ELSE: Printing "not palindrome" outside the if-block (❌). 
     * //    Without an 'else', the program would print "not palindrome" for every 
     * //    number, even if it was a palindrome.
     * --------------------------------------------------------------------------
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        calculator(x);
        
        sc.close();
    }

    public static void calculator(int x) {
        int y = x; 
        int reversed_x = 0; 

        // Corrected for-loop syntax with proper reversal logic
        for (; y > 0; y /= 10) {
            int digit = y % 10;
            reversed_x = (reversed_x * 10) + digit;
        }

        // Corrected if-else structure
        if (x == reversed_x) {
            System.out.println("The given number is a Palindrome.");
        } else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
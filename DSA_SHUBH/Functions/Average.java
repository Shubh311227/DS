/*
 * 📝 REVISION NOTES & LESSONS LEARNED:
 * --------------------------------------------------------------------------
 * 1. CASE SENSITIVITY: Java is strict. 'Scanner' and 'nextDouble' must be 
 * capitalized correctly. 'scanner' or 'nextDOuble' will cause errors.
 * * 2. CLASS WRAPPING: All code must live inside a 'public class Name { ... }'.
 * * 3. FILE NAMING: The filename (Average.java) must match the class name 
 * (Average) exactly, including capitalization.
 * * 4. METHOD NAMING: Methods should start with a lowercase letter (average). 
 * If you use an Uppercase letter that matches the class name, Java thinks 
 * it is a "Constructor" and throws error Java(67108974).
 * * 5. USER PROMPTS: Without System.out.print, the terminal stays blank/black 
 * while waiting for input, making the program look "frozen."
 * * 6. STRINGS VS LOGIC: Anything inside quotes " " is treated as text. 
 * To call a method, it must be outside the quotes: "Result: " + average().
 * * 7. RESOURCE LEAKS: Always use 'sc.close()' to stop the Scanner and clear 
 * the "Problem" warning in VS Code.
 * --------------------------------------------------------------------------
 */

import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to avoid a "blank terminal"
        System.out.println("Enter three numbers:");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Calling the method outside of the quotes
        System.out.println("Average: " + average(a, b, c));
        
        // Closing the scanner to free resources
        sc.close(); 
    }

    // Method name in lowercase to distinguish from the Class name
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
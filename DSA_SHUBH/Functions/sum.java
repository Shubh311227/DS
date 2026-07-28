import java.util.Scanner;

public class sum {
    /*
     * 📝 REVISION SUMMARY:
     * // 1. LOOP CONDITION: Changed x >= 0 to x > 0 to prevent an infinite loop at zero.
     * // 2. CLEANUP: Added sc.close() to free system resources.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        System.out.println("The sum of the digits is: " + calculator(x));
        
        sc.close(); 
    }

    public static int calculator(int x) {
        int a;
        int s = 0;
        
        // Use > 0. If you use >= 0, when x reaches 0, 0/10 remains 0 
        // and the loop never ends!
        for (; x > 0; x /= 10) {
            a = x % 10;
            s = s + a;
        }
        
        return s;
    }
}
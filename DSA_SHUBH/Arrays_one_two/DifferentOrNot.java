import java.util.*;
/*
 * MISTAKES FOUND & FIXED:
 *
 * 1. Constraint check 'nums[i]' used BEFORE 'i' is declared — 'i' only exists
 *    inside the for-loop below, so using it in the if-condition is a compile error.
 *
 * 2. Math.pow(10,5) and Math.pow(10,9) return 'double', not 'int' — comparing
 *    an int with a double is unsafe and poor practice for constraint validation.
 *    Fixed by using integer literals: 100000 and 1000000000 directly.
 *
 * 3. Entire logic is wrapped inside the constraint if-block — if constraints
 *    fail, nothing happens (no message, no return). Fixed by using early return
 *    with an error message when constraints are violated.
 *
 * 4. Element-level constraint (nums[i] range check) cannot be done in a single
 *    if-statement alongside 'n' check — needs its own loop to check each element.
 *    Fixed by adding a separate validation loop before the main logic.
 *
 * 5. Inner loop starts at j=0 with i!=j check — this causes every pair (i,j)
 *    to be checked TWICE e.g. (0,1) and (1,0). Wasteful and redundant.
 *    Fixed by starting j = i+1 so each pair is checked only once.
 *
 * 6. No early exit when a duplicate is found — loop continues running even
 *    after flag=true, wasting time. Fixed by adding break in both inner
 *    and outer loops as soon as a duplicate is detected.
 */
public class DifferentOrNot {

    public static void search(int[] nums, int n) {

        // Validate constraints
        if (n < 1 || n > 100000) {
            System.out.println("Invalid input: array length out of bounds.");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] < -1000000000 || nums[i] > 1000000000) {
                System.out.println("Invalid input: element out of bounds at index " + i);
                return;
            }
        }

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // j = i+1 avoids redundant comparisons
                if (nums[j] == nums[i]) {
                    flag = true;
                    break;  // No need to check further
                }
            }
            if (flag) break;  // Exit outer loop early too
        }

        if (flag) {
            System.out.println("Not all different (duplicate found): True");
        } else {
            System.out.println("All elements are different: False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        search(nums, n);
    }
}
public class Combination {

    // Lookup table: L[digit] gives the letters on a phone keypad for that digit.
    // L[0] and L[1] are empty because 0 and 1 have no letters on a phone keypad.
    // Example: L[2] = {'a','b','c'}, L[3] = {'d','e','f'}, etc.
    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
                                {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                                {'t','u','v'},{'w','x','y','z'}};

    // Entry point function: takes a digit string (e.g. "23") and prints
    // all possible letter combinations.
    public static void letterCombinations(String D) {

        int len = D.length(); // total number of digits in the input

        // Edge case: if input is empty, there are no combinations to build.
        // Just print an empty line and stop.
        if (len == 0) {
            System.out.println("");
            return;
        }

        // Start the recursive process:
        // pos = 0        -> begin from the first digit
        // len            -> total digits (used to know when we're done)
        // new StringBuilder() -> empty container to build up letters one by one
        // D              -> the original digit string
        bfs(0, len, new StringBuilder(), D);
    }

    // Recursive helper function (despite the name "bfs", this is actually
    // DFS / backtracking: it goes deep into one path before trying the next).
    //
    // pos -> index of the digit we are currently processing
    // len -> total length of the digit string (to detect when we're finished)
    // sb  -> the letters chosen so far (one combination being built)
    // D   -> the original digit string
    public static void bfs(int pos, int len, StringBuilder sb, String D) {

        // BASE CASE:
        // If pos has reached len, it means we've picked one letter for
        // every digit, so "sb" now holds one complete valid combination.
        if (pos == len) {
            System.out.println(sb.toString());
        }
        else {
            // RECURSIVE CASE:

            // Step 1: Get the current digit character (e.g. '2'),
            // convert it to its numeric value (e.g. 2),
            // then look up its corresponding letters array from L.
            // Example: if D.charAt(pos) = '2', letters = {'a','b','c'}
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];

            // Step 2: Try every possible letter for this digit.
            for (int i = 0; i < letters.length; i++)

                // IMPORTANT: "new StringBuilder(sb)" creates a FRESH COPY
                // of the current sb (not the original sb itself).
                // This copy is based on the sb passed INTO this function call,
                // which stays the same throughout this loop.
                //
                // Why copy instead of reusing sb directly?
                // Because if we mutated sb directly (sb.append(...)),
                // it would keep growing incorrectly across loop iterations
                // (e.g. "a" -> "ad" -> "ade" -> "adef", which is wrong).
                // By copying, each letter choice gets its own independent
                // branch, so "a" + 'd', "a" + 'e', "a" + 'f' are all
                // built separately from the same starting point "a".
                //
                // After appending the current letter, recurse into the
                // NEXT digit (pos+1).
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
        }
    }

    // Main method: program starts here.
    // Change the string below to test with different digit inputs, e.g. "234".
    public static void main(String[] args) {
        letterCombinations("234");
    }
}
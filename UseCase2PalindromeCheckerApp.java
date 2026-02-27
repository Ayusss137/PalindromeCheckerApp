public class UseCase2PalindromeCheckerApp {
    /**
 * =========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Goal:
 * Display whether a hardcoded string is a palindrome.
 *
 * Flow:
 * 1. Program starts.
 * 2. Hardcoded string is checked.
 * 3. Result is printed.
 * 4. Program exits.
 *
 * Key Concepts Used:
 * - Class
 * - Main Method
 * - Static Keyword
 * - String
 * - String Literal
 * - Conditional Statement (if-else)
 * - Console Output
 *
 * Data Structure Used:
 * - String
 *
 * @author Ayush
 * @version 2.0
 * =========================================================
 */

public class palindromecheckerapp {

    /**
     * Entry point of the Java application.
     * JVM starts execution from here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Hardcoded string (String Literal)
        String input = "madam";

        // Step 2: Reverse the string
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Step 3: Check palindrome using if-else
        boolean isPalindrome;

        if (input.equals(reversed)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        // Step 4: Print result
        System.out.println("=====================================");
        System.out.println("Input String : " + input);
        System.out.println("Reversed String : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("=====================================");
    }
}
    
}

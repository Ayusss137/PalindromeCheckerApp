/**
 * =========================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =========================================================
 * UC1: Application Entry & Welcome Message
 * UC2: Print a Hardcoded Palindrome Result
 * =========================================================
 */

public class palindromecheckerapp {

    private static final String APPLICATION_NAME = "Palindrome Checker Application";
    private static final String APPLICATION_VERSION = "Version 2.0";

    // ==============================
    // MAIN METHOD
    // ==============================
    public static void main(String[] args) {

        // UC1
        showWelcomeMessage();

        // UC2
        runUC2();
    }

    // ==============================
    // UC1 METHOD
    // ==============================
    public static void showWelcomeMessage() {

        System.out.println("=================================================");
        System.out.println("        Welcome to " + APPLICATION_NAME);
        System.out.println("        " + APPLICATION_VERSION);
        System.out.println("=================================================");

        System.out.println("Application started successfully.");
        System.out.println("Ready to proceed to palindrome validation...");
        System.out.println();
    }

    // ==============================
    // UC2 METHOD
    // ==============================
    public static void runUC2() {

        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("UC2 Result:");
        System.out.println("Input String : " + input);
        System.out.println("Reversed     : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println();
    }
}
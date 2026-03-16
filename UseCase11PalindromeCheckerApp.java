class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String input = "level";

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

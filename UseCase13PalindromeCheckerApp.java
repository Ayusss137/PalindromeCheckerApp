public class UseCase13PalindromeCheckerApp {

    static boolean checkPalindrome(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "racecar";

        long start = System.nanoTime();

        boolean result = checkPalindrome(input);

        long end = System.nanoTime();

        long duration = end - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time (ns): " + duration);
    }
}


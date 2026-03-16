public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Race Car";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        boolean isPalindrome = normalized.equals(reversed);

        System.out.println("Original Input : " + input);
        System.out.println("Processed Input : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

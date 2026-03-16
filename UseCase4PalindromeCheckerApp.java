public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

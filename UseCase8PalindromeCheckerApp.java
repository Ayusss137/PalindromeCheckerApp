class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    static Node createList(String input) {

        Node head = null;
        Node tail = null;

        for (char c : input.toCharArray()) {

            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    static boolean isPalindrome(Node head) {

        String original = "";
        String reversed = "";

        Node current = head;

        while (current != null) {
            original += current.data;
            reversed = current.data + reversed;
            current = current.next;
        }

        return original.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "level";

        Node head = createList(input);

        boolean result = isPalindrome(head);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

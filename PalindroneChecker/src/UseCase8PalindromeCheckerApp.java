import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        if (text == null) return false;

        LinkedList<Character> deque = new LinkedList<>();
        // Add all characters to the LinkedList
        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        // Compare characters from both ends
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String testString = "racecar";
        System.out.println("Is '" + testString + "' a palindrome? " + isPalindrome(testString));

        String testString2 = "hello";
        System.out.println("Is '" + testString2 + "' a palindrome? " + isPalindrome(testString2));
    }
}
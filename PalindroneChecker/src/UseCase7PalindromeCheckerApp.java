import java.util.Deque;
import java.util.LinkedList;
public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Racecar";
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new LinkedList<>();

        // Add all characters to the deque
        for (char c : cleanedInput.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        // Compare characters from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is palindrome: " + isPalindrome);
    }
}
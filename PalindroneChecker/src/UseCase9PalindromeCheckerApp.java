import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Initial call to the recursive function
        if (check(s, 0, s.length() - 1)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }    // Recursively checks whether a string is palindrome
    private static boolean check(String s, int start, int end) {
        // Base Case 1: All characters matched, or pointers crossed
        if (start >= end) {
            return true;
        }
        // Check outer characters
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        // Recursive step: Move inward
        return check(s, start + 1, end - 1);
    }
}
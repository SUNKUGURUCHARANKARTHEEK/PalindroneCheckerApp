/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class usecase1PalindroneApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Application Information
        final String APP_NAME = "Palindrome Checker Management System";
        final String APP_VERSION = "Version 1.0";

        // Welcome Display
        System.out.println("=================================================");
        System.out.println("        Welcome to " + APP_NAME);
        System.out.println("-------------------------------------------------");
        System.out.println("                 " + APP_VERSION);
        System.out.println("=================================================");

        // Startup confirmation message
        System.out.println("Application started successfully.");
        System.out.println("Ready for next use case implementation...");
    }
}
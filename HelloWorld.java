import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("👋 Welcome to the Simple Java App!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = addNumbers(num1, num2);
        System.out.println("✅ Sum: " + result);

        System.out.print("Enter your name: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        greetUser(name);

        printCountdown(5);
    }

    /**
     * Adds two numbers and returns the sum.
     */
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    /**
     * Greets the user with a personalized message.
     */
    public static void greetUser(String username) {
        if (username == null || username.trim().isEmpty()) {
            System.out.println("⚠️ Invalid name entered.");
        } else {
            System.out.println("Hello, " + username + "! Glad you're here.");
        }
    }

    /**
     * Prints a countdown from the given number.
     */
    public static void printCountdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println("⏳ Countdown: " + i);
        }
        System.out.println("🚀 Let's go!");
    }
}
